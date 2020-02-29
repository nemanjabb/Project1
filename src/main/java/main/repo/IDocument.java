package main.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.SDNEntry;

public interface IDocument extends ElasticsearchRepository<SDNEntry, String> {
	
//	List<DocumentM> findByName(Integer name);
	
	
}
