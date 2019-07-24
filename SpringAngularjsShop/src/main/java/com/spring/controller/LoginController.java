package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.ApiResultVO;
import com.spring.models.UserVO;

@RestController
public class LoginController {

//	@Autowired
//	private ApiService apiService;
	
	@RequestMapping(path="/api/login", method=RequestMethod.POST)
  public ResponseEntity<ApiResultVO> login(HttpServletRequest req, UserVO userVO) {
	ApiResultVO apiResultVO = null;
	
	try {
        apiResultVO = new ApiResultVO();
        apiResultVO.setMessage(apiResultVO.getMessage() + "    ID : " + userVO.getUserId() + "     PW : " + userVO.getUserPassword());
		
      } catch (Exception e) {
      	return new ResponseEntity<ApiResultVO>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
	return new ResponseEntity<ApiResultVO>(apiResultVO, HttpStatus.OK);
  }

}
