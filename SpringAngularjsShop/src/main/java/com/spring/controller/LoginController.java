package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.common.util.Spring1stUtils;
import com.spring.models.UserVO;
import com.spring.service.UsersService;

@RestController
public class LoginController {

	@Autowired
	private UsersService service;

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public ResponseEntity<UserVO> login(UserVO vo, HttpServletRequest req) throws Exception {
	   
	 UserVO login = service.getUseerInfo(vo);  
	 HttpSession session = req.getSession();
	 
	 if(login == null || Spring1stUtils.isEmpty(login.getUserName())) {
	  session.removeAttribute("member");
	 } else {
	  session.setAttribute("member", login);
	 }   
	 return new ResponseEntity<UserVO>(login, HttpStatus.OK);
	}
	  
	@RequestMapping(value = "/user/reservation", method = RequestMethod.POST)
	public ResponseEntity<UserVO> postSignup(UserVO vo) throws Exception {
	 service.signup(vo);
	 return new ResponseEntity<UserVO>(vo, HttpStatus.OK);
	}
	
}