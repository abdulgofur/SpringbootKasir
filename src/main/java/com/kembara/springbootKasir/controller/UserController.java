package com.kembara.springbootKasir.controller;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.kembara.springbootKasir.Exception.RegisteredException;
import com.kembara.springbootKasir.dao.UserDao;
import com.kembara.springbootKasir.dto.CommonResponse;
import com.kembara.springbootKasir.dto.UserDto;
import com.kembara.springbootKasir.model.EntityUser;

import net.bytebuddy.dynamic.loading.PackageDefinitionStrategy.Definition.Undefined;

@CrossOrigin
@RestController
public class UserController {
	public static final String URL_USER = "user";
	public static final String URL_USERS = "users";
	public static final String URL_USER_BY_ID = "user/{idUser}";
	public static final String URL_LIST_BY_ID = "list/{idUser}";
	
	
	@Autowired
	private UserDao userDao;
	
	@Transactional
	@PostMapping(value = URL_USER + "/" + URL_USER)
	public CommonResponse<EntityUser> createUser(@RequestBody UserDto user) throws RegisteredException{
		int cas = user.getIdUser();
		CommonResponse<EntityUser> resp = new CommonResponse<EntityUser>();
		
		if (userDao.findById(cas)!=null) {
			throw new RegisteredException();
		}else {
			resp.setCode("01");
			resp.setDescription("Success");
			resp.setData(userDao.createUser(user));
		}
		return resp;
	}
	
	@GetMapping(value = URL_USER + "/" + URL_USER_BY_ID)
	public CommonResponse<EntityUser> getById(@PathVariable(name = "idUser")int idUser) throws EntityNotFoundException{
		EntityUser entityUser = userDao.findById(idUser);
		CommonResponse<EntityUser> resp = new CommonResponse<EntityUser>();
		if (entityUser == null) {
			throw new EntityNotFoundException();
		}else {
			resp.setData(entityUser);
		}
		return resp;
	}
	
	@DeleteMapping(value = URL_USER + "/" + URL_USER_BY_ID)
	public CommonResponse<EntityUser> deleteUser(@PathVariable (name = "idUser") int idUser) throws EntityNotFoundException{
		EntityUser check = userDao.findById(idUser);
		CommonResponse<EntityUser> resp = new CommonResponse<EntityUser>();
		if (check == null) {
			throw new EntityNotFoundException();
		}else {
			resp.setData(userDao.deleteUser(check));
		}
		return resp;
	}
	
	@Transactional
	@PutMapping(value = URL_USER + "/" + URL_USER)
	public CommonResponse<EntityUser> updateUser(@RequestBody UserDto user) throws EntityNotFoundException{
		Integer tempUser = user.getIdUser();
		CommonResponse<EntityUser>resp = new CommonResponse<EntityUser>();
		if (tempUser == null) {
			throw new EntityNotFoundException();
		}else {
			resp.setData(userDao.updateUser(user));
		}
		return resp;
	}
	
	@GetMapping(value = URL_USERS)
	public CommonResponse<List<EntityUser>> getList() throws EntityNotFoundException{
		List<EntityUser>data = userDao.getListUser();
		CommonResponse<List<EntityUser>> resp = new CommonResponse<>();
		
		if (data.isEmpty()) {
			resp.setData(data);
			throw new EntityNotFoundException();
		}else {
			resp.setData(data);
		}
		return resp;
	}
	
	@GetMapping(value = URL_USER + "/" + URL_LIST_BY_ID)
	public CommonResponse<List<EntityUser>>getList(@PathVariable(name = "idUser")int idUser) throws EntityNotFoundException{
		List<EntityUser> user = userDao.getListUser(idUser);
		CommonResponse<List<EntityUser>>resp = new CommonResponse<>();
		if (user.isEmpty()) {
			throw new EntityNotFoundException();
		}else {
			resp.setData(user);
		}
		return resp;
	}
}
