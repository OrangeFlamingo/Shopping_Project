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
		
public UserVO signup(UserVO vo) throws Exception {
//		sql.insert(namespace + ".signup", vo);  //얘가 왜 에러일까요? 그걸 저한테 물으면 어떡해요
		return null;
	}

public UserVO signin(UserVO vo) {
	// TODO Auto-generated method stub
	return null;
}
}
