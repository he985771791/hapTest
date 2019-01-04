package com.hand.hap.order.service.impl;

import com.github.pagehelper.PageHelper;
import com.hand.hap.core.IRequest;
import com.hand.hap.order.dto.Order;
import com.hand.hap.order.dto.OrderDetail;
import com.hand.hap.order.mapper.OrderDetailMapper;
import com.hand.hap.order.mapper.OrderMapper;
import com.hand.hap.order.service.IOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description
 * @date 2018/12/29
 */
@Service
public class OrderServiceImpl implements IOrderService {
    @Autowired
    OrderMapper orderMapper;
    @Autowired
    OrderDetailMapper detailMapper;
    @Override
    public List<Order> selectCollect(IRequest request,Order order, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return orderMapper.selectCollect(order);
    }

    @Override
    public List<OrderDetail> selectDetails(IRequest request, Order order, int page, int pageSize) {
        PageHelper.startPage(page,pageSize);
        return detailMapper.orderDetails(order);
    }
}