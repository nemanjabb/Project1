package main.model;

public class Id {
	
	private String uid;
	private String idType;
	private String idNumber;
	private String idCountry;
	
	public Id(){}
	
	public Id(String uid, String idType, String idNumber, String idCountry) {
		super();
		this.uid = uid;
		this.idType = idType;
		this.idNumber = idNumber;
		this.idCountry = idCountry;
	}

	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	public String getIdCountry() {
		return idCountry;
	}
	public void setIdCountry(String idCountry) {
		this.idCountry = idCountry;
	}
	
	
	
}
