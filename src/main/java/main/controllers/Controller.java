package main.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.DocumentM;
import main.model.SdnList;
import main.service.DocumentService;
import main.service.SdnListService;

@RestController
class Controller {

	@Autowired
	DocumentService documentService;
	
	@Autowired
	SdnListService sdnListService;

	@RequestMapping("/new")
	String hello() {

		DocumentM doc = documentService.saveDocument();

		return doc.getName().toString();

	}
	

	@RequestMapping("/all")
	int all() {

		SdnList doc = sdnListService.getByName();

		return 1;

	}
}