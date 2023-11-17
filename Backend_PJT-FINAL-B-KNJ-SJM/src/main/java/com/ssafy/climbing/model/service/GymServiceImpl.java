package com.ssafy.climbing.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssafy.climbing.model.dao.GymDao;
import com.ssafy.climbing.model.dto.Gym;

@Service
public class GymServiceImpl implements GymService {
	
	@Autowired
	private GymDao gDao;

	@Override
	public List<Gym> selectAllGym() {
		return gDao.selectAllGym();
	}

	@Override
	public Gym selectOneGym(String gymId) {
		return gDao.selectOneGym(gymId);
	}

	@Override
	public List<Gym> selectFavoriteGym(String userId) {
		return gDao.selectFavoriteGym(userId);
	}

	@Override
	public int insertGym(Gym gym) {
		return gDao.insertGym(gym);
	}



}
