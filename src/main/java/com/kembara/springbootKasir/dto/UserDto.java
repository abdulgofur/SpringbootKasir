package com.kembara.springbootKasir.dto;

import com.kembara.springbootKasir.model.EntityRole;

public class UserDto {

	private int idUser;
	private EntityRole idRole;
	private String nmUser;
	private int nik;
	private String password;
	public int getIdUser() {
		return idUser;
	}
	public void setIdUser(int idUser) {
		this.idUser = idUser;
	}
	public EntityRole getIdRole() {
		return idRole;
	}
	public void setIdRole(EntityRole idRole) {
		this.idRole = idRole;
	}
	public String getNmUser() {
		return nmUser;
	}
	public void setNmUser(String nmUser) {
		this.nmUser = nmUser;
	}
	public int getNik() {
		return nik;
	}
	public void setNik(int nik) {
		this.nik = nik;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
