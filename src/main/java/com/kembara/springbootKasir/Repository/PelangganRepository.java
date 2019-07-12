package com.kembara.springbootKasir.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kembara.springbootKasir.model.EntityPelanggan;

public interface PelangganRepository extends CrudRepository<EntityPelanggan, Integer> {

	EntityPelanggan findById(int idPelanggan);
}
