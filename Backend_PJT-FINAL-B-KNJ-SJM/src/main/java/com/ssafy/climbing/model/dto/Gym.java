package com.ssafy.climbing.model.dto;

import java.util.Date;

public class Gym {
	private String gymId;
	private String gymImgURL;
	private String gymName;
	private String gymAddress;
	private String operationTime;
	private int area;
	private String contact;
	private boolean shower;
	private boolean parking;
	private boolean tutoring;
	private String homepage;
	private String detail;
	
	public Gym() {}

	public String getGymId() {
		return gymId;
	}

	public void setGymId(String gymId) {
		this.gymId = gymId;
	}
	


	public String getGymImgURL() {
		return gymImgURL;
	}

	public void setGymImgURL(String gymImgURL) {
		this.gymImgURL = gymImgURL;
	}


	public String getOperationTime() {
		return operationTime;
	}

	public void setOperationTime(String operationTime) {
		this.operationTime = operationTime;
	}

	public int getArea() {
		return area;
	}

	public void setArea(int area) {
		this.area = area;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public boolean isShower() {
		return shower;
	}

	public void setShower(boolean shower) {
		this.shower = shower;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	public boolean isTutoring() {
		return tutoring;
	}

	public void setTutoring(boolean tutoring) {
		this.tutoring = tutoring;
	}

	public String getHomepage() {
		return homepage;
	}

	public void setHomepage(String homepage) {
		this.homepage = homepage;
	}

	public String getDetail() {
		return detail;
	}

	public void setDetail(String detail) {
		this.detail = detail;
	}

	public String getGymName() {
		return gymName;
	}

	public void setGymName(String gymName) {
		this.gymName = gymName;
	}

	public String getGymAddress() {
		return gymAddress;
	}

	public void setGymAddress(String gymAddress) {
		this.gymAddress = gymAddress;
	}

	@Override
	public String toString() {
		return "Gym [gymId=" + gymId + ", gymImgURL=" + gymImgURL + ", gymName=" + gymName + ", gymAddress="
				+ gymAddress + ", operationTime=" + operationTime + ", area=" + area + ", contact=" + contact
				+ ", shower=" + shower + ", parking=" + parking + ", tutoring=" + tutoring + ", homepage=" + homepage
				+ ", detail=" + detail + "]";
	}


	
	
	
	

}
