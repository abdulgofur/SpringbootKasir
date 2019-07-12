package com.kembara.springbootKasir.dao;

import java.util.List;

import com.kembara.springbootKasir.dto.UserDto;
import com.kembara.springbootKasir.model.EntityUser;

public interface UserDao {
	
	List<EntityUser> getListUser(int idUser);
	List<EntityUser> getListUser();
	EntityUser createUser(UserDto user);
	EntityUser findById(int idUser);
	EntityUser updateUser(UserDto user);
	EntityUser deleteUser(EntityUser user);
}
