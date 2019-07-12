package com.kembara.springbootKasir.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Items")
@Table(name = "items")
public class EntityItems {
	
	@Id
	@Column(name = "id_item")
	private int idItem;
	
	@Column(name = "nm_item")
	private String nmItems;
	
	@ManyToOne
	@JoinColumn(name = "id_kategori")
	private EntityKatagori idKategori;
	
	@Column(name = "harga")
	private int harga;
	
	@Column(name = "stock")
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
