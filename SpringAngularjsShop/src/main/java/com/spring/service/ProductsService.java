package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.mapper.ProductsMapper;
import com.spring.models.ProductsVO;

@Service
public class ProductsService {

	@Resource
	private ProductsMapper productsMapper;
	
	public List<ProductsVO> getProductList() {
		List<ProductsVO> results = productsMapper.getProductList();
		return results;
	}
	
	public ProductsVO getProduct(ProductsVO paramVO) {
		ProductsVO productsVO = productsMapper.getProduct(paramVO);
		return productsVO;
	}
	
	public ProductsVO getProductImg(ProductsVO paramVO) {
		ProductsVO productsVO = productsMapper.getProductImg(paramVO);
		return productsVO;
	}
}
