package com.kembara.springbootKasir.dao;

import com.kembara.springbootKasir.dto.transaksiDto;
import com.kembara.springbootKasir.model.EntityTransaksi;

public interface TransaksiDao {
	
	EntityTransaksi createTrans(transaksiDto transaksi);
	EntityTransaksi findById(int idTransaksi);
}
