package com.kembara.springbootKasir.dao.implement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.kembara.springbootKasir.Repository.TransaksiRepository;
import com.kembara.springbootKasir.dao.TransaksiDao;
import com.kembara.springbootKasir.dto.transaksiDto;
import com.kembara.springbootKasir.model.EntityTransaksi;

public class TransaksiDaoImpl implements TransaksiDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private TransaksiRepository tr;  
	
	
	@Override
	public EntityTransaksi createTrans(transaksiDto transaksi) {
		String id="";
		Query query = em.createQuery("FROM Transaksi order by id_transaksi desc");
		query.setMaxResults(1);
		if (query.getResultList().isEmpty()) {
			id="30001";
		}else {
			EntityTransaksi et = (EntityTransaksi) query.getSingleResult();
			int tec = et.getIdTransaksi();
			int idd = (tec)+1;
			id = String.valueOf(idd);
		}
		
		EntityTransaksi et = setData(transaksi);
		et.setIdTransaksi(Integer.parseInt(id));
		return tr.save(et);
	}


	private EntityTransaksi setData(transaksiDto transaksi) {
		EntityTransaksi trans = new EntityTransaksi();
		trans.setIdTransaksi(transaksi.getIdTransaksi());
		trans.setIdItem(transaksi.getIdItem());
		trans.setQtyBeli(transaksi.getQtyBeli());
		trans.setTglTrans(transaksi.getTglTrans());
		trans.setIdPelanggan(transaksi.getIdPelanggan());
		return trans;
	}


	@Override
	public EntityTransaksi findById(int idTransaksi) {
		return tr.findById(idTransaksi);
	}

}
