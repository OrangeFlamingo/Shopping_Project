package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.ProductsVO;
import com.spring.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService service;
	
	@RequestMapping(path="/products", method=RequestMethod.GET)
  public ResponseEntity<List<ProductsVO>> products(HttpServletRequest req) {
	List<ProductsVO> result = null;
	
	try {
        result = service.getProductList();
		
      } catch (Exception e) {
      	return new ResponseEntity<List<ProductsVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
	return new ResponseEntity<List<ProductsVO>>(result, HttpStatus.OK);
  }

	@RequestMapping(path="/product", method=RequestMethod.GET)
	  public ResponseEntity<ProductsVO> product(HttpServletRequest req, ProductsVO paramVo) {
		ProductsVO result = null;
		
	try {
			result = service.getProduct(paramVo);
		
	      } catch (Exception e) {
	      	return new ResponseEntity<ProductsVO>(HttpStatus.INTERNAL_SERVER_ERROR);
	      }
		return new ResponseEntity<ProductsVO>(result, HttpStatus.OK);
	}	
}
