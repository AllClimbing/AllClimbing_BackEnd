package com.ssafy.climbing.model.controller;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.Async;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.ssafy.climbing.model.dto.Review;
import com.ssafy.climbing.model.service.GymService;
import com.ssafy.climbing.model.service.ReviewService;
import com.ssafy.climbing.model.service.UserService;

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
	
	private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

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
		List<Review> reviewList = rService.getUserReview(userId);
		return new ResponseEntity<List<Review>>(reviewList, HttpStatus.OK);
	}
	
	@GetMapping("/select/{reviewNo}")
	@ApiOperation(value="리뷰 한개 조회")
	public ResponseEntity<?> selectOneReview(@PathVariable int reviewNo){
		Review review = rService.getOneReview(reviewNo);
		if (review == null) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Review>(review, HttpStatus.OK);
	}
	
	@PostMapping("/write")
	@ApiOperation(value="리뷰 작성")
		public ResponseEntity<Void> write(@RequestPart(value="image", required = false) MultipartFile file, @RequestPart("review") Review review){
		
		//파일이 존재하고 가짜파일이 아닐때만
		if (file != null && file.getSize() > 0) {
			String uploadPath = "C:\\uploadTemp";
			
			File folder = new File(uploadPath);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			
			//작성일까지만 불러온다
			String writtenDay = sdf.format(System.currentTimeMillis());
			
			//작성일 폴더가 없다면 폴더 생성
			//저장될 폴더경로
			String saveFolder = uploadPath+"/"+writtenDay;
			folder = new File(saveFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}
		
			
			//실제 파일이름을 가져와
			//기존 파일이름
			String originalFileName = file.getOriginalFilename();
			int nameLength = originalFileName.length();
			//저장될 파일이름
			UUID uuid = UUID.randomUUID();
			String saveFileName = uuid.toString()+originalFileName.substring(nameLength-4, nameLength);
			
			// 파일 Dto 생성하여 우선 경로만
			// DAO를 통해 저장
			review.setReviewImgURL(saveFolder);
			review.setOriginalFileName(originalFileName);
			review.setSaveFileName(saveFileName);
			
			File target = new File(saveFolder, saveFileName);

			//target에 file복사
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				System.out.println("왜 예외로들어오는거지");
				e.printStackTrace();
			}
			
		}
		
		int result = rService.writeReview(review);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}

	
	@PutMapping("/update")
	@ApiOperation(value="리뷰 수정")
	public ResponseEntity<Void> update(@RequestPart(value="image", required = false) MultipartFile file, @RequestPart("review") Review review){
		if (file != null && file.getSize() > 0) {
			String uploadPath = "C:\\uploadTemp";
			
			File folder = new File(uploadPath);
			if (!folder.exists()) {
				folder.mkdir();
			}
			
			
			//작성일까지만 불러온다
			String writtenDay = sdf.format(System.currentTimeMillis());
			System.out.println(writtenDay);
			
			//작성일 폴더가 없다면 폴더 생성
			//저장될 폴더경로
			String saveFolder = uploadPath+"/"+writtenDay;
			folder = new File(saveFolder);
			if (!folder.exists()) {
				folder.mkdir();
			}
		
			
			//실제 파일이름을 가져와
			//기존 파일이름
			String originalFileName = file.getOriginalFilename();
			int nameLength = originalFileName.length();
			//저장될 파일이름
			UUID uuid = UUID.randomUUID();
			String saveFileName = uuid.toString()+originalFileName.substring(nameLength-4, nameLength);
			
			// 파일 Dto 생성하여 우선 경로만
			// DAO를 통해 저장
			review.setReviewImgURL(saveFolder);
			review.setOriginalFileName(originalFileName);
			review.setSaveFileName(saveFileName);
			
			File target = new File(saveFolder, saveFileName);

			//target에 file복사
			try {
				FileCopyUtils.copy(file.getBytes(), target);
			} catch (IOException e) {
				System.out.println("왜 예외로들어오는거지");
				e.printStackTrace();
			}
			
		}
		
		int result = rService.modifyReview(review);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_MODIFIED);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}
	
	
	@DeleteMapping("/delete/{reviewNo}")
	@ApiOperation(value="리뷰 삭제")
	public ResponseEntity<Void> delete(@PathVariable int reviewNo){
		int result = rService.removeReview(reviewNo);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Void>(HttpStatus.OK);
	}

}
