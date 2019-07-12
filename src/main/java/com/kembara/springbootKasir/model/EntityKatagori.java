package com.kembara.springbootKasir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Kategori")
@Table(name = "kategori")
public class EntityKatagori {

	@Id
	@Column(name = "id_kategori")
	private int idKategori;
	
	@Column(name = "nm_kategori")
	private String nmKategori;

	public int getIdKategori() {
		return idKategori;
	}

	public void setIdKategori(int idKategori) {
		this.idKategori = idKategori;
	}

	public String getNmKategori() {
		return nmKategori;
	}

	public void setNmKategori(String nmKategori) {
		this.nmKategori = nmKategori;
	}
	
	
}
