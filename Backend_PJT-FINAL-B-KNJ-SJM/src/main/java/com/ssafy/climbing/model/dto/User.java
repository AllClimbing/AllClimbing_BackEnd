package com.ssafy.climbing.model.dto;

import java.util.ArrayList;
import java.util.List;

public class User {
	private String userId;
	private String password;
	private String email;
	private String nickname;
	private String instagram;
	
	public User() {}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getInstagram() {
		return instagram;
	}

	public void setInstagram(String instagram) {
		this.instagram = instagram;
	}

	@Override
	public String toString() {
		return "User [userId=" + userId + ", password=" + password + ", email=" + email + ", nickname=" + nickname
				+ ", instagram=" + instagram + "]";
	}
	
	
}