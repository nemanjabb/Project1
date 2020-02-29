package main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.SDNEntry;
import main.repo.IDocument;

public class DocumentService {

	@Autowired
	IDocument iDocument;
	
	public DocumentService(){}
	
	public Iterable<SDNEntry> findByName() {
//		return (List<DocumentM>) iDocument.findAll();
		return iDocument.findAll();
	}
	
	public Iterable<SDNEntry> saveDocument(List<SDNEntry> entries){

		return iDocument.saveAll(entries);
		
	}
	
}
