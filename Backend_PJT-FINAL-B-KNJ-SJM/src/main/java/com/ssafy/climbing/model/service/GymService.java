package com.ssafy.climbing.model.service;

import java.util.List;

import com.ssafy.climbing.model.dto.Gym;

public interface GymService {
	
	//암장 목록 조회
	List<Gym> selectAllGym();
	
	//암장 1개 조회
	Gym selectOneGym(String gymId);
	
	//한 유저가 자주가는 암장 목록 조회
	List<Gym> selectFavoriteGym(String userId);
	
	int insertGym(Gym gym);
	
	
}
