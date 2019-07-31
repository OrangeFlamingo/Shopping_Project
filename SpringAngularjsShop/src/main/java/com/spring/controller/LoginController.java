package com.spring.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.spring.models.UserVO;
import com.spring.service.UsersService;

@RestController
public class LoginController {

	@Autowired
	private UsersService service;

	@RequestMapping(value = "/signin", method = RequestMethod.GET)
	public void getSignin() throws Exception {
	}

	@RequestMapping(value = "/signin", method = RequestMethod.POST)
	public String postSignin(UserVO vo, HttpServletRequest req, RedirectAttributes rttr) throws Exception {
	   
	 UserVO login = service.signup(vo);  
	 HttpSession session = req.getSession();
	 
	 
	 if(login != null) {
	  session.setAttribute("member", login);
	 } else {
	  session.setAttribute("member", null);
	  rttr.addFlashAttribute("msg", false);
	  return "redirect:/member/signin";
	 }  
	 
	 return "redirect:/";
	}
	  

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public void getSignup() throws Exception {
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String postSignup(UserVO vo) throws Exception {

	 service.signup(vo);

	 return "redirect:/";
	}
	
}