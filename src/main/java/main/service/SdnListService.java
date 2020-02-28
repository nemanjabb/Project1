package main.service;

import org.springframework.beans.factory.annotation.Autowired;

import main.model.SdnList;
import main.repo.ISdnList;

public class SdnListService {

	@Autowired
	ISdnList iSdnList;
	
	public SdnList getByName() {
		Iterable<SdnList> retVal = iSdnList.findAll();
		
		
		
		return null;
	}
	
}
