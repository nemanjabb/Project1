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
//		return (List<DocumentM>) iDocument.findAll();
		return null;
	}
	
	public DocumentM saveDocument(){
		DocumentM doc = new DocumentM();
		doc.setName("Nemanja");
//		iDocument.
//		return doc;
		return iDocument.save(doc);
		
	}
	
}
