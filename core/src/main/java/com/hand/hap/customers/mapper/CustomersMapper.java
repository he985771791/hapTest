package com.hand.hap.customers.mapper;

import com.hand.hap.customers.dto.Customers;
import com.hand.hap.mybatis.common.Mapper;

import java.util.List;

public interface CustomersMapper extends Mapper<Customers>{
    List<Customers> selectIdName(Customers customers);
}