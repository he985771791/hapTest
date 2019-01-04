package com.hand.hap.inventory.service.impl;

import com.hand.hap.system.service.impl.BaseServiceImpl;
import org.springframework.stereotype.Service;
import com.hand.hap.inventory.dto.InventoryItems;
import com.hand.hap.inventory.service.IInventoryItemsService;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(rollbackFor = Exception.class)
public class InventoryItemsServiceImpl extends BaseServiceImpl<InventoryItems> implements IInventoryItemsService{

}