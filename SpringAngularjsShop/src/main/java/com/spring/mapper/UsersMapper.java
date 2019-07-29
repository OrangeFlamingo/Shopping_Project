package com.spring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.models.UserVO;

@Repository
public interface UsersMapper {

	public List<UserVO> getUserId();
	public UserVO getuser_id(UserVO userVO);
//	public int insert(String param);
//	public int update(String param);
//	public int delete(String param);

}
