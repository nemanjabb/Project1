package main.model;

public class PlaceOfBirthItem {

	private String uid;
	private String placeOfBirth;
	private String mainEntry;
	
	public PlaceOfBirthItem(){}
	
	
	public PlaceOfBirthItem(String uid, String placeOfBirth, String mainEntry) {
		super();
		this.uid = uid;
		this.placeOfBirth = placeOfBirth;
		this.mainEntry = mainEntry;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getMainEntry() {
		return mainEntry;
	}
	public void setMainEntry(String mainEntry) {
		this.mainEntry = mainEntry;
	}
	
	
	
}
