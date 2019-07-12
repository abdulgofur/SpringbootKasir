package com.kembara.springbootKasir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Role")
@Table(name = "role")
public class EntityRole {

	@Id
	@Column(name = "id_role")
	private int idRole;
	
	@Column(name = "nm_role")
	private String nmRole;

	public int getIdRole() {
		return idRole;
	}

	public void setIdRole(int idRole) {
		this.idRole = idRole;
	}

	public String getNmRole() {
		return nmRole;
	}

	public void setNmRole(String nmRole) {
		this.nmRole = nmRole;
	}
	
}
