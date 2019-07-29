package com.spring.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.spring.models.ApiRequestVO;
import com.spring.models.ProductsVO;
import com.spring.service.ProductsService;

@RestController
public class ProductsController {

	@Autowired
	private ProductsService service;
	
	@RequestMapping(path="/api/products", method=RequestMethod.POST)
  public ResponseEntity<List<ProductsVO>> products(HttpServletRequest req, @ModelAttribute("apiRequestVO") ApiRequestVO apiRequestVO) {
	List<ProductsVO> result = null;
	
	try {
        result = service.getProductList();
		
      } catch (Exception e) {
      	return new ResponseEntity<List<ProductsVO>>(HttpStatus.INTERNAL_SERVER_ERROR);
      }
	return new ResponseEntity<List<ProductsVO>>(result, HttpStatus.OK);
  }

	@RequestMapping(path="/api/product", method=RequestMethod.POST)
	  public ResponseEntity<ProductsVO> product(HttpServletRequest req, ProductsVO paramVO) {
		ProductsVO result = null;
		
		try {
	        result = service.getProduct(paramVO);
	
	      } catch (Exception e) {
	      	return new ResponseEntity<ProductsVO>(HttpStatus.INTERNAL_SERVER_ERROR);
	      }
		return new ResponseEntity<ProductsVO>(result, HttpStatus.OK);
	  }

}
