package main.model;

import java.util.List;

public class SdnList {
	
	private PublshInformation publshInformation;
	
	private List<SDNEntry> sdnEntry;
	
	public SdnList() {
	}

	public SdnList(PublshInformation publshInformation, List<SDNEntry> sdnEntry) {
		this.setPublshInformation(publshInformation);
		this.sdnEntry = sdnEntry;
	}

	public List<SDNEntry> getSdnEntry() {
		return sdnEntry;
	}

	public void setSdnEntry(List<SDNEntry> sdnEntry) {
		this.sdnEntry = sdnEntry;
	}

	public PublshInformation getPublshInformation() {
		return publshInformation;
	}

	public void setPublshInformation(PublshInformation publshInformation) {
		this.publshInformation = publshInformation;
	}

}
