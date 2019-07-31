package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.mapper.UsersMapper;
import com.spring.models.UserVO;

@Service
public class UsersService {

	@Resource
	private UsersMapper usersMapper;
	
	public List<UserVO> getUserId() {
		List<UserVO> results = usersMapper.getUserId();
		return results;
	}
	
	public UserVO getUseerInfo(UserVO paramVO) {
		UserVO userVO = usersMapper.getUserInfo(paramVO);
		return userVO;
	}
}
