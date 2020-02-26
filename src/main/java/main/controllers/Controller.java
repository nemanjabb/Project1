package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.model.DocumentM;
import main.service.DocumentService;

@RestController
class Controller {

	@Autowired
	DocumentService documentService;

	@RequestMapping("/new")
	String hello() {

		DocumentM doc = documentService.saveDocument();

		return doc.getName().toString();

	}
	

	@RequestMapping("/all")
	int all() {

		List<DocumentM> doc = documentService.findByName("");

		return doc.size();

	}
}