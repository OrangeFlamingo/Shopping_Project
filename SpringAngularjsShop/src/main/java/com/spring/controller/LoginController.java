package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.UserVO;
import com.spring.service.UsersService;

@RestController
public class LoginController {

	@Autowired
	private UsersService service;
	
	@RequestMapping(path="/api/user", method=RequestMethod.POST)
  public ResponseEntity<List<UserVO>> login(HttpServletRequest req, UserVO paramVO) {
	List<UserVO> result = null;
	
	try {
		
		result = service.getUserId();
		
      } catch (Exception e) {
      	return new ResponseEntity<List<UserVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
	return new ResponseEntity<List<UserVO>>(result, HttpStatus.OK);
  }

	
	
}