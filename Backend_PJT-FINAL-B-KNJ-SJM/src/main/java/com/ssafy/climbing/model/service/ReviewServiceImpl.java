package com.ssafy.climbing.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.climbing.model.dao.ReviewDao;
import com.ssafy.climbing.model.dto.Review;

@Service
public class ReviewServiceImpl implements ReviewService {

	// 의존성 주입
	@Autowired
	private ReviewDao rDao;

	@Override
	public int writeReview(Review review) {
		return rDao.insertReview(review);
	}

	@Override
	public List<Review> getGymReview(String gymId) {
		return rDao.selectGymReview(gymId);
	}
	
	@Override
	public List<Review> getUserReview(String userId) {
		return rDao.selectUserReview(userId);
	}

	@Override
	public Review getOneReview(int reviewNo) {
		return rDao.selectOneReview(reviewNo);

	}

	@Override
	public int modifyReview(Review review) {
		return rDao.updateReview(review);

	}

	@Override
	public int removeReview(int reviewNo) {
		return rDao.deleteReview(reviewNo);

	}

}
