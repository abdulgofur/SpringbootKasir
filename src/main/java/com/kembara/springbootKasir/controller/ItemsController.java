package com.kembara.springbootKasir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kembara.springbootKasir.Exception.RegisteredException;
import com.kembara.springbootKasir.dao.ItemsDao;
import com.kembara.springbootKasir.dto.CommonResponse;
import com.kembara.springbootKasir.dto.itemsDto;
import com.kembara.springbootKasir.model.EntityItems;

@CrossOrigin
@RestController
public class ItemsController {

	public static final String URL_ITEMS= "items";
	
	@Autowired
	private ItemsDao itemsDao;
	
	@Transactional
	@PostMapping(value = URL_ITEMS)
	public CommonResponse<EntityItems> addItem(@RequestBody itemsDto itemdto) throws RegisteredException{
		int additems = itemdto.getIdItem();
		CommonResponse<EntityItems> resp = new CommonResponse<EntityItems>();
		
		if (itemsDao.findById(additems) != null) {
			throw new RegisteredException();
		}else {
			resp.setCode("01");
			resp.setDescription("Success");
			resp.setData(itemsDao.addItem(itemdto));
		}
		return resp;
	}
	
	
}
