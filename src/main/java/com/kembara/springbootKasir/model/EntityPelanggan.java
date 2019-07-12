package com.kembara.springbootKasir.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "Pelanggan")
@Table(name = "pelanggan")
public class EntityPelanggan {
	
	@Id
	@Column(name = "id_pelanggan")
	private int IdPelanggan;
	
	@Column(name = "nm_pelanggan")
	private String nmPelanggan;
	
	@Column(name = "date")
	private Date date;

	public int getIdPelanggan() {
		return IdPelanggan;
	}

	public void setIdPelanggan(int idPelanggan) {
		IdPelanggan = idPelanggan;
	}

	public String getNmPelanggan() {
		return nmPelanggan;
	}

	public void setNmPelanggan(String nmPelanggan) {
		this.nmPelanggan = nmPelanggan;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
	
	

}
