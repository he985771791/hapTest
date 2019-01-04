package com.hand.hap.order.mapper;

import com.hand.hap.order.dto.Order;
import com.hand.hap.order.dto.OrderDetail;

import java.util.List;

/**
 * @author hehe.zhang@hand-china.com
 * @version 1.0
 * @description ${description}
 * @date 2019/1/4
 */
public interface OrderDetailMapper {
    List<OrderDetail> orderDetails(Order order);
}
