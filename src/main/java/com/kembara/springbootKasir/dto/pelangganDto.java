package com.kembara.springbootKasir.dto;

import java.util.Date;

public class pelangganDto {
	
	private int IdPelanggan;
	private String nmPelanggan;
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
