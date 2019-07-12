package com.kembara.springbootKasir.dao.implement;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.kembara.springbootKasir.Repository.ItemsRepository;
import com.kembara.springbootKasir.dao.ItemsDao;
import com.kembara.springbootKasir.dto.itemsDto;
import com.kembara.springbootKasir.model.EntityItems;

public class ItemDaoImpl implements ItemsDao {
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private ItemsRepository ir;

	@Override
	public EntityItems addItem(itemsDto item) {
		String id="";
		Query query = em.createQuery("FROM Items order by id_item desc");
		query.setMaxResults(1);
		
		if (query.getResultList().isEmpty()) {
			id="50001";
		}else {
			EntityItems ei = (EntityItems) query.getSingleResult();
			int tec = ei.getIdItem();
			int idd = (tec)+1;
			id = String.valueOf(idd);
		}
		
		EntityItems ei = setData(item);
		ei.setIdItem(Integer.parseInt(id));
		return ir.save(ei);
	}

	private EntityItems setData(itemsDto item) {
		EntityItems items = new EntityItems();
		items.setIdItem(item.getIdItem());
		items.setNmItems(item.getNmItems());
		items.setIdKategori(item.getIdKategori());
		items.setStock(item.getStock());
		items.setHarga(item.getHarga());
		return items;
	}

	@Override
	public EntityItems findById(int idItem) {
		return ir.findById(idItem);
	}
	
	
}
