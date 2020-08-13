package com.prasad.springBoot.dao;

import java.util.List;

import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.prasad.springBoot.model.AccountModel;
@Repository
public class AccountDAOImpl implements AccountDAO {

	@Autowired
	private EntityManager entityManager;
	
	@Override
	public List<AccountModel> get() {
		Session currentSession = entityManager.unwrap(Session.class);
		Query<AccountModel> query = currentSession.createQuery("from AccountModel",AccountModel.class);
		List<AccountModel> list = query.getResultList();
		return list;
	}

	@Override
	public AccountModel get(int id) {
		Session currentSession = entityManager.unwrap(Session.class);
		AccountModel object = currentSession.get(AccountModel.class,id);
		return object;
	}

	@Override
	public void save(AccountModel account) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(account);	
	}
	
	@Override
	public void update(AccountModel account) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(account);	
	}


	@Override
	public void delete(int id) {
	Session currentSession = entityManager.unwrap(Session.class);
	AccountModel obj = currentSession.get(AccountModel.class, id);
	currentSession.delete(obj);
	}

}
