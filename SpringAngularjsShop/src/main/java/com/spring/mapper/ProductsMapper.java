package com.spring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.models.ProductsVO;

@Repository
public interface ProductsMapper {

	public List<ProductsVO> getProductList();
	public ProductsVO getProduct(ProductsVO productsVO);
//	public int insert(String param);
//	public int update(String param);
//	public int delete(String param);

}
