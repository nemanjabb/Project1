package main.controllers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

import javax.annotation.PostConstruct;

import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.data.elasticsearch.core.EntityMapper;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.google.gson.Gson;
import com.google.gson.JsonIOException;
import com.google.gson.JsonSyntaxException;

import main.model.SDNEntry;
import main.model.SdnList;
import main.service.DocumentService;

@RestController
class Controller {

	@Autowired
	DocumentService documentService;

	@Autowired
	EntityMapper entityMapper;

	// @Autowired
	// SdnListService sdnListService;

	@Autowired
	ResourceLoader resourceLoader;

	@Autowired
	RestHighLevelClient elasticsearchClient;

	@Value("/client/src/main/resources/sdnUnitedStatesDepartmentOfTreasures.json")
	Resource resourceFile;

	@PostConstruct
	void init() {
//		SdnList sdnList = null;
//
//		Gson gson = new Gson();
//
//		try {
//			sdnList = gson.fromJson(new FileReader("D:/Project2/Project1/src/main/resources/new 3.json"),
//					SdnList.class);
//		} catch (JsonSyntaxException | JsonIOException | FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		documentService.saveDocument(sdnList.getSdnEntry());

	}

	@RequestMapping("/save")
	String hello(@RequestBody List<SDNEntry> entries) {
		documentService.saveDocument(entries);
		return null;

	}

	@PostMapping("/name")
	Iterable<SDNEntry> all() {

		// SdnList doc = sdnListService.getByName();

		Iterable<SDNEntry> retVal = documentService.findByName();
		return retVal;

	}
}