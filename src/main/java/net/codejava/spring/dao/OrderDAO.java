package net.codejava.spring.dao;

import java.util.List;

import net.codejava.spring.model.CartInfo;
import net.codejava.spring.model.OrderDetailInfo;
import net.codejava.spring.model.OrderInfo;
import net.codejava.spring.model.PaginationResult;

public interface OrderDAO {
	public void saveOrder(CartInfo cartInfo);
	 
    public PaginationResult<OrderInfo> listOrderInfo(int page,
            int maxResult, int maxNavigationPage);
    
    public OrderInfo getOrderInfo(String orderId);
    
    public List<OrderDetailInfo> listOrderDetailInfos(String orderId);
}
