package com.spring.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.spring.mapper.OrdersMapper;
import com.spring.models.OrderVO;

@Service
public class OrderService {

	@Resource
	private OrdersMapper ordersMapper;
	
	public List<OrderVO> getProductList() {
		List<OrderVO> results = ordersMapper.getProductList();
		return results;
	}
	
	public OrderVO getProductCd(OrderVO paramVO) {
		OrderVO orderVO = ordersMapper.getProductCd(paramVO);
		return orderVO;
	}
}
