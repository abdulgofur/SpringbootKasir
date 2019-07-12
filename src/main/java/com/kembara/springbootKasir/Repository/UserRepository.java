package com.kembara.springbootKasir.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.kembara.springbootKasir.dto.UserDto;
import com.kembara.springbootKasir.model.EntityUser;

public interface UserRepository extends CrudRepository<EntityUser, Integer> {
	
	EntityUser findById(int idUser);
	List<EntityUser>findByIdUser(int idUser);

}
