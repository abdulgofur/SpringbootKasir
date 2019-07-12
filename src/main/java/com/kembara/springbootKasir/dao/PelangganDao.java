package com.kembara.springbootKasir.dao;

import com.kembara.springbootKasir.dto.pelangganDto;
import com.kembara.springbootKasir.model.EntityPelanggan;

public interface PelangganDao {
	
	EntityPelanggan inputPelanggan(pelangganDto pelanggan);
	EntityPelanggan findById(int idPelanggan);
}
