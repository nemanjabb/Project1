package main.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;

@Document(indexName = "entries", type = "entry", shards = 2)
public class SDNEntry {

	@Id
	private String uid;
	private String firstName;
	private String lastName;
	private String sdnType;
	private String remarks;
	private Program programList;

	private IdList idList;
	private DateOfBirthList dateOfBirthList;
	private PlaceOfBirthList placeOfBirthList;
	// private List<Aka> akaList;
	// private List<Address> addressList;

	public SDNEntry() {
	}

	public SDNEntry(String uid, String firstName, String lastName, String sdnType, String remarks, Program programList,
			DateOfBirthList dateOfBirthList, PlaceOfBirthList placeOfBirthList) {
		super();
		this.uid = uid;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sdnType = sdnType;
		this.setRemarks(remarks);
		this.setProgramList(programList);
		this.dateOfBirthList = dateOfBirthList;
		this.placeOfBirthList = placeOfBirthList;
	}

	public IdList getIdList() {
		return idList;
	}

	public void setIdList(IdList idList) {
		this.idList = idList;
	}

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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public Program getProgramList() {
		return programList;
	}

	public void setProgramList(Program programList) {
		this.programList = programList;
	}

	public DateOfBirthList getDateOfBirthList() {
		return dateOfBirthList;
	}

	public void setDateOfBirthList(DateOfBirthList dateOfBirthList) {
		this.dateOfBirthList = dateOfBirthList;
	}

	public PlaceOfBirthList getPlaceOfBirthList() {
		return placeOfBirthList;
	}

	public void setPlaceOfBirthList(PlaceOfBirthList placeOfBirthList) {
		this.placeOfBirthList = placeOfBirthList;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
