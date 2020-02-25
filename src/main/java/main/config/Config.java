package main.config;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.elasticsearch.client.ClientConfiguration;
import org.springframework.data.elasticsearch.client.RestClients;

@Configuration
public class Config {


    @Value("${elasticsearch.host:localhost}") 
    public String host;
    @Value("${elasticsearch.port:9300}") 
    public int port;
    
    
    
    
    @Bean
    RestHighLevelClient client() {
//    	
//        RestHighLevelClient client = new RestHighLevelClient(
//                RestClient.builder(new HttpHost(elasticsearchHost)));

      ClientConfiguration clientConfiguration = ClientConfiguration.builder() 
        .connectedTo("localhost:9300")
        .build();

      return RestClients.create(clientConfiguration).rest();                  
    }
    
   
	
}
