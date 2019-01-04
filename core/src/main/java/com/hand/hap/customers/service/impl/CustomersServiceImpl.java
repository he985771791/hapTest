package com.hand.hap.customers.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.hap.customers.dto.Customers;
import com.hand.hap.customers.service.ICustomersService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class CustomersServiceImpl extends BaseServiceImpl<Customers> implements ICustomersService{

}