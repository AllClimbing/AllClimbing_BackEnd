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
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ssafy.climbing.model.dto.Gym;
import com.ssafy.climbing.model.dto.Keyword;
import com.ssafy.climbing.model.service.GymService;
import com.ssafy.climbing.model.service.ReviewService;
import com.ssafy.climbing.model.service.UserService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/gym")
@Api(tags="암장 컨트롤러")
@CrossOrigin("*")
public class GymController  {
	
	@Autowired
	private GymService gService;
	
	@Autowired
	private UserService uService;
	
	@Autowired
	private ReviewService rService;
	
	@GetMapping("/list")
	@ApiOperation(value="암장 목록 조회")
	public ResponseEntity<?> allGymList(){
		List<Gym> gymList = gService.selectAllGym();
		return new ResponseEntity<List<Gym>>(gymList, HttpStatus.OK);
	}
	
	@GetMapping("/list/{userId}")
	@ApiOperation(value="자주가는 암장 목록 조회")
	public ResponseEntity<?> favoriteGymList(@PathVariable String userId){
		List<Gym> gymList = gService.selectFavoriteGym(userId);
		return new ResponseEntity<List<Gym>>(gymList, HttpStatus.OK);
	}
	
	@GetMapping("/{gymId}")
	@ApiOperation(value="암장 상세조회")
	public ResponseEntity<?> selectGym(@PathVariable String gymId){
		Gym gym = gService.selectOneGym(gymId);
		return new ResponseEntity<Gym>(gym, HttpStatus.OK);
	}
	
	
	@PostMapping("/insert")
	@ApiOperation(value="암장 정보삽입")
	public ResponseEntity<?> insertGym(@RequestBody Gym gym){
		System.out.println(gym.toString());
		int result = gService.insertGym(gym);
		if (result == 0) {
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Void>(HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/favorite")
	@ApiOperation(value="암장 찜 체크용")
	public ResponseEntity<?> checkFavoriteGym(@RequestBody Keyword keyword){
//		System.out.println("==================구분선==================");
//		System.out.println(keyword.getGymId());
//		System.out.println(keyword.getUserId());
		Keyword resultType = gService.checkFavoriteGym(keyword.getUserId(), keyword.getGymId());
		if (resultType == null) {
			return new ResponseEntity<Boolean>(false, HttpStatus.OK);
		}
		System.out.println(resultType.toString());
		return new ResponseEntity<Boolean>(true, HttpStatus.ACCEPTED);
	}
	
	
	@PostMapping("/favorite/{gymId}")
	@ApiOperation(value="암장 찜")
	public ResponseEntity<?> addFavoriteGym(@RequestBody Keyword keyword){
		System.out.println("찜?"+keyword.toString());
		int result = gService.addFavoriteGym(keyword);
		if (result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.ACCEPTED);
	}
	
	@PostMapping("/favorite/delete")
	@ApiOperation(value="암장 찜 해제")
	public ResponseEntity<?> deleteFavoriteGym(@RequestBody Keyword keyword){
		System.out.println("찜해제?"+keyword.toString());
		int result = gService.deleteFavoriteGym(keyword);
		if (result == 0) {
			return new ResponseEntity<Integer>(result, HttpStatus.NOT_ACCEPTABLE);
		}
		return new ResponseEntity<Integer>(result, HttpStatus.ACCEPTED);
	}


}
