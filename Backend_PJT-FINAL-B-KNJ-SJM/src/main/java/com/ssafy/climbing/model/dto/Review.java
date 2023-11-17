package com.ssafy.climbing.model.dto;

import java.util.Date;

public class Review {
	private int reviewNo; 
	private String gymId;
	private String userId;
	private String reviewImgURL;
	private String content;
	private String visitDate;
	private String regDate; 
	
	public Review() {
		
	}

	public int getReviewNo() {
		return reviewNo;
	}

	public void setReviewNo(int reviewNo) {
		this.reviewNo = reviewNo;
	}

	public String getGymId() {
		return gymId;
	}

	public void setGymId(String gymId) {
		this.gymId = gymId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getReviewImgURL() {
		return reviewImgURL;
	}

	public void setReviewImgURL(String reviewImgURL) {
		this.reviewImgURL = reviewImgURL;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getVisitDate() {
		return visitDate;
	}

	public void setVisitDate(String visitDate) {
		this.visitDate = visitDate;
	}

	public String getRegDate() {
		return regDate;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	@Override
	public String toString() {
		return "Review [reviewNo=" + reviewNo + ", gymId=" + gymId + ", userId=" + userId + ", reviewImgURL="
				+ reviewImgURL + ", content=" + content + ", visitDate=" + visitDate + ", regDate=" + regDate + "]";
	}
	
	
}
