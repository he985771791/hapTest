package com.hand.hap.order.service;

import com.hand.hap.core.IRequest;
import com.hand.hap.order.dto.Order;
import com.hand.hap.order.dto.OrderDetail;

import java.util.List;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/12/29
 */
public interface IOrderService {
    public List<Order> selectCollect(IRequest request,Order order, int page, int pageSize);
    public List<OrderDetail> selectDetails(IRequest request,Order order, int page, int pageSize);
}