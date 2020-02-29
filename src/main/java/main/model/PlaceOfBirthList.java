package main.model;

public class PlaceOfBirthList {

	private PlaceOfBirthItem placeOfBirthItem;

	public PlaceOfBirthList() {
	}

	public PlaceOfBirthList(PlaceOfBirthItem placeOfBirthItem) {
		super();
		this.placeOfBirthItem = placeOfBirthItem;
	}

	public PlaceOfBirthItem getPlaceOfBirthItem() {
		return placeOfBirthItem;
	}

	public void setPlaceOfBirthItem(PlaceOfBirthItem placeOfBirthItem) {
		this.placeOfBirthItem = placeOfBirthItem;
	}

}
