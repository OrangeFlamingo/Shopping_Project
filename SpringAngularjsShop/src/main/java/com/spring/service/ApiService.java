package com.spring.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.mapper.Spring1stMapper;
import com.spring.models.ApiResultVO;

@Service
public class ApiService {

	@Resource
	private Spring1stMapper spring1stMapper;
	
	public ApiResultVO testDB() {
		ApiResultVO apiResultVO = new ApiResultVO();
		// DB
		String now = spring1stMapper.getNow();
//		String result = "DB에서 조회하여 반환하도록 구성";
		apiResultVO.setMessage(now);
		return apiResultVO;
	}
}
