package com.ssafy.climbing.model.controller;

import java.io.UnsupportedEncodingException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.climbing.model.dto.User;
import com.ssafy.climbing.model.service.GymService;
import com.ssafy.climbing.model.service.ReviewService;
import com.ssafy.climbing.model.service.UserService;
import com.ssafy.climbing.util.JwtUtil;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/user")
@Api(tags="유저 컨트롤러")
@CrossOrigin("*")
public class UserController  {
	
	@Autowired
	private GymService vService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;
	
	//로그인 토큰 생성용
	@Autowired
	private JwtUtil jwtUtil;
	
	private static final String HEADER_AUTH = "access-token";

	//=======================유저파트 CURD 구현===========================
	@GetMapping("/{userId}")
	@ApiOperation(value="유저 정보 조회")
	public ResponseEntity<?> list(@PathVariable String userId){
		User user = uService.getUser(userId);
		if (user == null) {
			return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);			
		}
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}

	
	@PostMapping("/login")
	@ApiOperation(value="로그인")
	public ResponseEntity<?> login(@RequestBody User user) {
		System.out.println(user.toString());
		User selectedUser = uService.getUser(user.getUserId());
		if (selectedUser == null) {
			return new ResponseEntity<String>("", HttpStatus.OK);
		} 
		
		if (selectedUser.getPassword().equals(user.getPassword())) {
			try {
				//로그인 성공 시 토큰을 전송
				return new ResponseEntity<String>(jwtUtil.createToken("userId", user.getUserId()), HttpStatus.OK);
			} catch (UnsupportedEncodingException e) {
				String msg = "토큰 생성 시 인코딩 에러가 발생하였습니다.";
				return new ResponseEntity<String>(msg, HttpStatus.OK);
			}
		}
		
		return new ResponseEntity<String>("", HttpStatus.OK);
		
	}
	
	
	
	@PostMapping("/signup")
	@ApiOperation(value="회원가입")
	public ResponseEntity<?> signup(@RequestBody User user) {
		int result = uService.createUser(user);
		
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	
	@GetMapping("/validation")
	@ApiOperation(value="유효성 검사")
	public ResponseEntity<Boolean> validate(@RequestParam String token){
		
		System.out.println(token);
		
		if(token != null) {
			try {
				jwtUtil.valid(token);
				return new ResponseEntity<Boolean>(true, HttpStatus.OK);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				return new ResponseEntity<Boolean>(false, HttpStatus.OK);
			}
		}
		
		
		return new ResponseEntity<Boolean>(false, HttpStatus.OK);
	}
	
	
	
}
