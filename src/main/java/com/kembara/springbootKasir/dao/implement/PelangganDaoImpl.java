package com.kembara.springbootKasir.dao.implement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.kembara.springbootKasir.Repository.PelangganRepository;
import com.kembara.springbootKasir.dao.PelangganDao;
import com.kembara.springbootKasir.dto.pelangganDto;
import com.kembara.springbootKasir.model.EntityPelanggan;

public class PelangganDaoImpl implements PelangganDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private PelangganRepository pr;

	@Override
	public EntityPelanggan inputPelanggan(pelangganDto pelanggan) {
		String id="";
		Query query = em.createQuery("FROM Pelanggan order by id_pelanggan ");
		query.setMaxResults(1);
		if( query.getResultList().isEmpty()) {
			id="20001";
		}else {
			EntityPelanggan ep = (EntityPelanggan) query.getSingleResult();
			int tec = ep.getIdPelanggan();
			int idd = (tec)+1;
			id = String.valueOf(idd);
		}
		
		EntityPelanggan ep = setData(pelanggan);
		ep.setIdPelanggan(Integer.parseInt(id));
		return pr.save(ep);
	}

	private EntityPelanggan setData(pelangganDto pelanggan) {
		EntityPelanggan dataPelanggan = new EntityPelanggan();
		dataPelanggan.setIdPelanggan(pelanggan.getIdPelanggan());
		dataPelanggan.setNmPelanggan(pelanggan.getNmPelanggan());
		dataPelanggan.setDate(pelanggan.getDate());
		return dataPelanggan;
	}

	@Override
	public EntityPelanggan findById(int idPelanggan) {
		return pr.findById(idPelanggan);
	}
	
	
}
