package com.kembara.springbootKasir.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity(name = "transReport")
@Table(name = "trns_report")
public class EntitytransReport {

	@Id
	@Column(name = "id_report")
	private int idReport;
	
	@ManyToOne
	@JoinColumn(name = "id_transaksi")
	private EntityTransaksi idTransaksi;
	
	@ManyToOne
	@JoinColumn(name = "id_user")
	private EntityUser idUser;
	
	@Column(name = "date")
	private Date date;
	
	@Column(name = "total")
	private int total;

	public int getIdReport() {
		return idReport;
	}

	public void setIdReport(int idReport) {
		this.idReport = idReport;
	}

	

	public EntityTransaksi getIdTransaksi() {
		return idTransaksi;
	}

	public void setIdTransaksi(EntityTransaksi idTransaksi) {
		this.idTransaksi = idTransaksi;
	}

	public EntityUser getIdUser() {
		return idUser;
	}

	public void setIdUser(EntityUser idUser) {
		this.idUser = idUser;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
	
	
}
