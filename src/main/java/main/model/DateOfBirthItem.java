package main.model;

public class DateOfBirthItem {
	
	private String uid;
	private String dateOfBirth;
	private String mainEntry;
	
	public DateOfBirthItem (){}
	
	public DateOfBirthItem(String uid, String dateOfBirth, String mainEntry) {
		super();
		this.uid = uid;
		this.dateOfBirth = dateOfBirth;
		this.mainEntry = mainEntry;
	}
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getMainEntry() {
		return mainEntry;
	}
	public void setMainEntry(String mainEntry) {
		this.mainEntry = mainEntry;
	}
	
	
}
