package com.shirsho.parkingfinder.model;

public class ParkingFinderInputRequestLayout {
	String destinationHouseNumber;
	String destinationStreetName;
	String destinationTownName;
	String destinationStateName;
	public String getHouseNumber() {
		return destinationHouseNumber;
	}
	public void setHouseNumber(String houseNumber) {
		this.destinationHouseNumber = houseNumber;
	}
	public String getStreetName() {
		return destinationStreetName;
	}
	public void setStreetName(String streetName) {
		this.destinationStreetName = streetName;
	}
	public String getTownName() {
		return destinationTownName;
	}
	public void setTownName(String townName) {
		this.destinationTownName = townName;
	}
	public String getStateName() {
		return destinationStateName;
	}
	public void setStateName(String stateName) {
		this.destinationStateName = stateName;
	}
	
	
	

}
