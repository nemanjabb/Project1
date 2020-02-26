package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.DocumentM;
import main.repo.IDocument;

public class DocumentService {

	@Autowired
	IDocument iDocument;
	
	public DocumentService(){}
	
	public List<DocumentM> findByName(String name) {
		return null; //(List<DocumentM>) iDocument.findAll();
	}
	
	public DocumentM saveDocument(){
		DocumentM doc = new DocumentM();
		doc.setName(7);
		
		return doc;
//		return iDocument.save(doc);
		
	}
	
}
