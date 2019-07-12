package com.kembara.springbootKasir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kembara.springbootKasir.Exception.RegisteredException;
import com.kembara.springbootKasir.dao.PelangganDao;
import com.kembara.springbootKasir.dto.CommonResponse;
import com.kembara.springbootKasir.dto.pelangganDto;
import com.kembara.springbootKasir.model.EntityPelanggan;

@CrossOrigin
@RestController
public class PelangganController {
	public static final String URL_PELANGGAN = "pelanggan";
	
	@Autowired
	private PelangganDao pelangganDao;
	
	@Transactional
	@PostMapping(value= URL_PELANGGAN)
	public CommonResponse<EntityPelanggan> regPelanggan(@RequestBody pelangganDto pelanggan) throws RegisteredException{
		int reg = pelanggan.getIdPelanggan();
		CommonResponse<EntityPelanggan> resp = new CommonResponse<EntityPelanggan>();
		
		if (pelangganDao.findById(reg) != null) {
			throw new RegisteredException();
		}else {
			resp.setCode("01");
			resp.setDescription("Success");
			resp.setData(pelangganDao.inputPelanggan(pelanggan));
		}
		return resp;
	}

}
