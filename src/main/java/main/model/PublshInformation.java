package main.model;

public class PublshInformation {

	private String Publish_Date;
	private String Record_Count;

	public PublshInformation() {
	}

	public PublshInformation(String publish_Date, String record_Count) {
		Publish_Date = publish_Date;
		Record_Count = record_Count;
	}

	public String getPublish_Date() {
		return Publish_Date;
	}

	public void setPublish_Date(String publish_Date) {
		Publish_Date = publish_Date;
	}

	public String getRecord_Count() {
		return Record_Count;
	}

	public void setRecord_Count(String record_Count) {
		Record_Count = record_Count;
	}

}
