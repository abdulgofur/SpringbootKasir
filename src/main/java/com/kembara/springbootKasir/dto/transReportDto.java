package com.kembara.springbootKasir.dto;

import java.util.Date;

import com.kembara.springbootKasir.model.EntityTransaksi;
import com.kembara.springbootKasir.model.EntityUser;

public class transReportDto {

	private int idReport;
	private EntityTransaksi idTransaksi;
	private EntityUser idUser;
	private Date date;
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
