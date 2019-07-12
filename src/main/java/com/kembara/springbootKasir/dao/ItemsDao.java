package com.kembara.springbootKasir.dao;

import com.kembara.springbootKasir.dto.itemsDto;
import com.kembara.springbootKasir.model.EntityItems;

public interface ItemsDao {
	
	EntityItems addItem(itemsDto item);
	EntityItems findById(int idItem);
}
