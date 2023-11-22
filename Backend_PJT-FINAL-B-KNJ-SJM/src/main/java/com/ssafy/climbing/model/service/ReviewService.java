package com.ssafy.climbing.model.service;

import java.util.List;

import com.ssafy.climbing.model.dto.*;

public interface ReviewService {
	
	// 리뷰 등록
	int writeReview(Review review);

	// 해당 암장의 리뷰들 조회
	List<Review> getGymReview(String gymId);
	
	// 유저가 쓴 리뷰 조회
	List<Review> getUserReview(String userId);

	// 리뷰 수정
	int modifyReview(Review review);

	// 리뷰 한개 조회
	Review getOneReview(int reviewNo);

	// 리뷰 삭제
	int removeReview(int reviewNo);

}
