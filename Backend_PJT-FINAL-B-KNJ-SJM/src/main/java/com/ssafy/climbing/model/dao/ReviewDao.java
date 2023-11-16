package com.ssafy.climbing.model.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.ssafy.climbing.model.dto.Review;

public interface ReviewDao {

	// 리뷰 등록
	int insertReview(Review review);

	// 해당 암장의 리뷰들 조회
	List<Review> selectGymReview(String gymId);
	
	// 유저가 쓴 리뷰들 모두 조회
	List<Review> selectUserReview(String userId);

	// 리뷰 한개 조회
	Review selectOneReview(@Param("gymId") String gymId,@Param("reviewNo") int reviewNo);
 
	// 리뷰 수정
	int updateReview(Review review);

	// 리뷰 삭제
	int deleteReview(@Param("gymId")String gymId, @Param("reviewNo") int reviewNo);

}
