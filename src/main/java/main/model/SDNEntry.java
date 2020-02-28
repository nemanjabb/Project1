package main.model;

import java.util.List;

public class SDNEntry {

	private String uid;
	private String lastName;
	private String sdnType;
	private List<String> programList;
	private List<Aka> akaList;
	private List<Address> addressList;
	
	public SDNEntry (){}
	
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getSdnType() {
		return sdnType;
	}
	public void setSdnType(String sdnType) {
		this.sdnType = sdnType;
	}
	public List<String> getProgramList() {
		return programList;
	}
	public void setProgramList(List<String> programList) {
		this.programList = programList;
	}
	public List<Aka> getAkaList() {
		return akaList;
	}
	public void setAkaList(List<Aka> akaList) {
		this.akaList = akaList;
	}
	public List<Address> getAddressList() {
		return addressList;
	}
	public void setAddressList(List<Address> addressList) {
		this.addressList = addressList;
	}
	
	
}
