package com.kembara.springbootKasir.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "Transaksi")
@Table(name = "transaksi")
public class EntityTransaksi {
	
	@Id
	@Column(name = "id_transaksi")
	private int idTransaksi;
	
	@ManyToOne
	@JoinColumn(name = "id_item")
	private EntityItems idItem;
	
	@Column(name = "qty_beli")
	private int qtyBeli;
	
	@Column(name = "tgl_trans")
	private Date tglTrans;
	
	@ManyToOne
	@JoinColumn(name = "id_pelanggan")
	private EntityPelanggan idPelanggan;

	public int getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(int idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	

	public EntityItems getIdItem() {
		return idItem;
	}

	public void setIdItem(EntityItems idItem) {
		this.idItem = idItem;
	}

	public void setIdPelanggan(EntityPelanggan idPelanggan) {
		this.idPelanggan = idPelanggan;
	}

	public int getQtyBeli() {
		return qtyBeli;
	}

	public void setQtyBeli(int qtyBeli) {
		this.qtyBeli = qtyBeli;
	}

	public Date getTglTrans() {
		return tglTrans;
	}

	public void setTglTrans(Date tglTrans) {
		this.tglTrans = tglTrans;
	}

	
}
