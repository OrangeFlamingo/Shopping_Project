package com.spring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.models.UserVO;

@Repository
public interface UsersMapper {

	public List<UserVO> getUserId();
	public UserVO getUserInfo(UserVO userVO);
	

	
	public int insertUser(UserVO userVO);
//	public int update(String param);
//	public int delete(String param);

}
