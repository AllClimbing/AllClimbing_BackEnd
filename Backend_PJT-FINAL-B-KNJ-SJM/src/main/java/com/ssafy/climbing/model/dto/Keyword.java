package com.ssafy.climbing.model.dto;

public class Keyword {
	
	private String userId;
	private String gymId;
	
	public Keyword() {}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getGymId() {
		return gymId;
	}
	public void setGymId(String gymId) {
		this.gymId = gymId;
	}

	@Override
	public String toString() {
		return "Keyword [userId=" + userId + ", gymId=" + gymId + "]";
	}

	
	
}
