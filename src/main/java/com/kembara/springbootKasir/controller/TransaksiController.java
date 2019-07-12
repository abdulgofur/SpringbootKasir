package com.kembara.springbootKasir.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kembara.springbootKasir.Exception.RegisteredException;
import com.kembara.springbootKasir.dao.TransaksiDao;
import com.kembara.springbootKasir.dto.CommonResponse;
import com.kembara.springbootKasir.dto.transaksiDto;
import com.kembara.springbootKasir.model.EntityTransaksi;

@CrossOrigin
@RestController
public class TransaksiController {
	public static final String URL_TRANS = "trans";
	
	@Autowired
	private TransaksiDao transDao;
	
	@Transactional
	@PostMapping(value = URL_TRANS + "/" + URL_TRANS)
	public CommonResponse<EntityTransaksi> createTrans(@RequestBody transaksiDto trans) throws RegisteredException{
		int ctrans = trans.getIdTransaksi();
		CommonResponse<EntityTransaksi> resp = new CommonResponse<EntityTransaksi>();
		
		if (transDao.findById(ctrans) !=null) {
			throw new RegisteredException();
		}else {
			resp.setCode("01");
			resp.setDescription("Success");
			resp.setData(transDao.createTrans(trans));
		}
		return resp;
	}
}
