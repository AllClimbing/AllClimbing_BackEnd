package com.ssafy.climbing.model.service;

import java.util.List;

import com.ssafy.climbing.model.dto.*;

public interface UserService {

	// 유저 생성
	int createUser(User user);

	// 유저 조회
	User getUser(String userId);

	// 유저 수정
	int modifyUser(User user);

	// 유저 삭제
	int removeUser(String id);


}
