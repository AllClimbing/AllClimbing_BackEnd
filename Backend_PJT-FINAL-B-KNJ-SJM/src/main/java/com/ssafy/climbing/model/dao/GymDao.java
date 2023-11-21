package com.ssafy.climbing.model.dao;

import java.util.List;

import com.ssafy.climbing.model.dto.Keyword;
import com.ssafy.climbing.model.dto.Gym;

public interface GymDao {
	
	//암장 목록 조회
	List<Gym> selectAllGym();
	
	//암장 1개 조회
	Gym selectOneGym(String gymId);
	
	//한 유저가 자주가는 암장 목록 조회
	List<Gym> selectFavoriteGym(String userId);
	
	//암장 데이터베이스 삽입
	int insertGym(Gym gym);
	
	//암장 찜 기능
	int addFavoriteGym(Keyword keyword);
	
	//암장 찜 해제 기능
	int deleteFavoriteGym(Keyword keyword);
	
	

}
