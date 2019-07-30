package com.spring.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.spring.models.OrderVO;

@Repository
public interface OrdersMapper {

	public List<OrderVO> getOrderList();
	public OrderVO getOrder(OrderVO orderVO);
//	public int insert(String param);
//	public int update(String param);
//	public int delete(String param);

}
