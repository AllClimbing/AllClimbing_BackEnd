package com.ssafy.climbing.model.dao;

import java.util.List;

import com.ssafy.climbing.model.dto.User;

public interface UserDao {

	// 유저 생성
	int insertUser(User user);

	// 유저 수정
	int updateUser(User user);

	// 유저 삭제
	int deleteUser(String userId);

	// 유저 조회
	User selectOneUser(String userId);
	
	// 유저 목록 조회
	List<User> selectAllUser();
}
