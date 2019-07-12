package com.kembara.springbootKasir.dto;

import java.util.Date;

import com.kembara.springbootKasir.model.EntityItems;
import com.kembara.springbootKasir.model.EntityPelanggan;

public class transaksiDto {

	private int idTransaksi;
	private EntityItems idItem;
	private int qtyBeli;
	private Date tglTrans;
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
	public EntityPelanggan getIdPelanggan() {
		return idPelanggan;
	}
	public void setIdPelanggan(EntityPelanggan idPelanggan) {
		this.idPelanggan = idPelanggan;
	}
	
	
}
