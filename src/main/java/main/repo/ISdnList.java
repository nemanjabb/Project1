package main.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.SdnList;

public interface ISdnList extends ElasticsearchRepository<SdnList, String>{

}
