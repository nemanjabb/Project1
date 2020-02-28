package main.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document (indexName="sdnlist")
public class SdnList {
	
	private PublshInformation publshInformation;
	@Id
	private String name;
	
	List<SDNEntry> sdnEntry;
	
	public PublshInformation getPublshInformation() {
		return publshInformation;
	}
	public void setPublshInformation(PublshInformation publshInformation) {
		this.publshInformation = publshInformation;
	}
	public List<SDNEntry> getSdnEntry() {
		return sdnEntry;
	}
	public void setSdnEntry(List<SDNEntry> sdnEntry) {
		this.sdnEntry = sdnEntry;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
}
