package com.kembara.springbootKasir.dto;

import com.kembara.springbootKasir.model.EntityKatagori;

public class itemsDto {
	
	private int idItem;
	private String nmItems;
	private EntityKatagori idKategori;
	private int harga;
	private int stock;
	public int getIdItem() {
		return idItem;
	}
	public void setIdItem(int idItem) {
		this.idItem = idItem;
	}
	public String getNmItems() {
		return nmItems;
	}
	public void setNmItems(String nmItems) {
		this.nmItems = nmItems;
	}
	
	public EntityKatagori getIdKategori() {
		return idKategori;
	}
	public void setIdKategori(EntityKatagori idKategori) {
		this.idKategori = idKategori;
	}
	public int getHarga() {
		return harga;
	}
	public void setHarga(int harga) {
		this.harga = harga;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	
	
}
