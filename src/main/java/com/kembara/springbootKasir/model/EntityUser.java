package com.kembara.springbootKasir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Users")
@Table(name = "users")
public class EntityUser {

	@Id
	@Column(name = "id_user")
	private int idUser;
	
	@ManyToOne
	@JoinColumn(name = "id_role")
	private EntityRole idRole;
	
	@Column(name = "nm_user")
	private String nmUser;
	
	@Column(name = "nik")
	private int nik;
	
	@Column(name = "password")
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
