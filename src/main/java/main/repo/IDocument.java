package main.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import main.model.DocumentM;

public interface IDocument extends ElasticsearchRepository<DocumentM, Integer> {
	
	
//	List<DocumentM> findByName(Integer name);
	
	
}
