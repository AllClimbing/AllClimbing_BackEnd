package com.ssafy.climbing.model.service;

import java.util.List;

import com.ssafy.climbing.model.dto.Gym;
import com.ssafy.climbing.model.dto.Keyword;

public interface GymService {
	
	//암장 목록 조회
	List<Gym> selectAllGym();
	
	//암장 1개 조회
	Gym selectOneGym(String gymId);
	
	//한 유저가 자주가는 암장 목록 조회
	List<Gym> selectFavoriteGym(String userId);
	
	//암장 추가 기능
	int insertGym(Gym gym);
	
	//암장 정보 업데이트 기능
	int updateGym(Gym gym);
	
	//암장 찜 체크용
	Keyword checkFavoriteGym(String gymId, String userId);
	
	//암장 찜 기능
	int addFavoriteGym(Keyword keyword);
	
	//암장 찜 해제 기능
	int deleteFavoriteGym(Keyword keyword);
	
}
