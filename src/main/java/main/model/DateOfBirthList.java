package main.model;

public class DateOfBirthList {
	
	private DateOfBirthItem dateOfBirthItem;

	public DateOfBirthList(){}
	
	public DateOfBirthList(DateOfBirthItem dateOfBirthItem) {
		this.dateOfBirthItem = dateOfBirthItem;
	}

	public DateOfBirthItem getDateOfBirthItem() {
		return dateOfBirthItem;
	}

	public void setDateOfBirthItem(DateOfBirthItem dateOfBirthItem) {
		this.dateOfBirthItem = dateOfBirthItem;
	}
}
