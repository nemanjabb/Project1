package main.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.support.DefaultConversionService;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;
import org.springframework.data.elasticsearch.config.AbstractElasticsearchConfiguration;
import org.springframework.data.elasticsearch.core.ElasticsearchEntityMapper;
import org.springframework.data.elasticsearch.core.EntityMapper;
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories;

import main.service.DocumentService;
import main.service.SdnListService;

@Configuration
@EnableElasticsearchRepositories(                             
		  basePackages = "org.springframework.data.elasticsearch.repositories")
public class ClientConfig extends AbstractElasticsearchConfiguration {

	@Override
	public RestHighLevelClient elasticsearchClient() {
		return RestClients.create(ClientConfiguration.localhost()).rest();
	}

	@Bean
	@Override
	public EntityMapper entityMapper() {
		ElasticsearchEntityMapper entityMapper = new ElasticsearchEntityMapper(elasticsearchMappingContext(),
				new DefaultConversionService());
		entityMapper.setConversions(elasticsearchCustomConversions());

		return entityMapper;
	}
	
	@Bean
	public DocumentService documentService() {
		return new DocumentService();
	}
	
	@Bean
	public SdnListService sdnListService() {
		return new SdnListService();
	}
	
}
