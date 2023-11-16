package com.ssafy.climbing.model.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.climbing.model.dto.Review;
import com.ssafy.climbing.model.service.ReviewService;
import com.ssafy.climbing.model.service.UserService;
import com.ssafy.climbing.model.service.GymService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/review")
@Api(tags="리뷰 컨트롤러")
@CrossOrigin("*")
public class ReviewController  {
	
	@Autowired
	private GymService vService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;

	//=======================리뷰파트 CURD 구현===========================
	@GetMapping("/{gymId}")
	@ApiOperation(value="암장 리뷰 조회")
	public ResponseEntity<List<Review>> gymReviewlist(@PathVariable String gymId){
		List<Review> reviewList = rService.getGymReview(gymId);
		return new ResponseEntity<List<Review>>(reviewList, HttpStatus.OK);
	}
	
	@GetMapping("/list/{userId}")
	@ApiOperation(value="유저 리뷰 조회")
	public ResponseEntity<List<Review>> userReviewlist(@PathVariable String userId){
		List<Review> reviewList = rService.getGymReview(userId);
		return new ResponseEntity<List<Review>>(reviewList, HttpStatus.OK);
	}
	
	@PostMapping("/write")
	@ApiOperation(value="리뷰 작성")
	public ResponseEntity<Void> write(@RequestBody Review review){
		int result = rService.writeReview(review);
		
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PutMapping("/update")
	@ApiOperation(value="리뷰 수정")
	public ResponseEntity<Void> update(@RequestBody Review review){
		int result = rService.modifyReview(review);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete")
	@ApiOperation(value="리뷰 삭제")
	public ResponseEntity<Void> delete(@PathVariable String gymId, @RequestParam int reviewNo){
		int result = rService.removeReview(gymId, reviewNo);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	

}
