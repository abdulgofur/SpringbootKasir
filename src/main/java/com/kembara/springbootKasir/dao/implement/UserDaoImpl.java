package com.kembara.springbootKasir.dao.implement;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.beans.factory.annotation.Autowired;

import com.kembara.springbootKasir.Repository.UserRepository;
import com.kembara.springbootKasir.dao.UserDao;
import com.kembara.springbootKasir.dto.UserDto;
import com.kembara.springbootKasir.model.EntityUser;

public class UserDaoImpl implements UserDao{
	
	@PersistenceContext
	private EntityManager em;
	
	@Autowired
	private UserRepository ur;
	
	@Override
	public EntityUser createUser(UserDto user) {
		String id="";
		Query query = em.createQuery("FROM Users order by id_user desc");
		query.setMaxResults(1);
		if (query.getResultList().isEmpty()) {
			id="40001";
		}else {
			EntityUser eu = (EntityUser) query.getSingleResult();
			int tac = eu.getIdUser();
			int idd = (tac)+1;
			id = String.valueOf(idd);
		}
		EntityUser eu = setData(user);
		eu.setIdUser(Integer.parseInt(id));
		return ur.save(eu);
	}

	private EntityUser setData(UserDto dto) {
		EntityUser user = new EntityUser();
		user.setIdUser(dto.getIdUser());
		user.setIdRole(dto.getIdRole());
		user.setNmUser(dto.getNmUser());
		user.setNik(dto.getNik());
		user.setPassword(dto.getPassword());
		return user;
	}

	@Override
	public EntityUser deleteUser(EntityUser user) {
		ur.delete(user);
		return user;
	}

	@Override
	public EntityUser findById(int idUser) {
		return ur.findById(idUser);
	}

	@Override
	public EntityUser updateUser(UserDto user) {
		EntityUser newUser = setData(user);
		return em.merge(newUser);
	}

	@Override
	public List<EntityUser> getListUser(int idUser) {
		return ur.findByIdUser(idUser);
	}

	@Override
	public List<EntityUser> getListUser() {
		Query query = em.createQuery("From Users");
		return query.getResultList();
	}

}
