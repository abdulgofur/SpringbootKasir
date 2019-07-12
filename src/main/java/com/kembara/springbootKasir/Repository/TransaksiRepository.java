package com.kembara.springbootKasir.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kembara.springbootKasir.model.EntityTransaksi;

public interface TransaksiRepository extends CrudRepository<EntityTransaksi, Integer>{
	EntityTransaksi findById(int idTransaksi);
}
