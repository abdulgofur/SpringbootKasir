package com.kembara.springbootKasir.Repository;

import org.springframework.data.repository.CrudRepository;

import com.kembara.springbootKasir.model.EntityItems;

public interface ItemsRepository extends CrudRepository<EntityItems, Integer> {
	EntityItems findById(int idItem);
}
