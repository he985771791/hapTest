package com.hand.hap.inventory.mapper;

import com.hand.hap.mybatis.common.Mapper;
import com.hand.hap.inventory.dto.InventoryItems;

import java.util.List;

public interface InventoryItemsMapper extends Mapper<InventoryItems>{
    List<InventoryItems> selectIdName(InventoryItems inventoryItems);
}