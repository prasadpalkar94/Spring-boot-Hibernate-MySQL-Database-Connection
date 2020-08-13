package com.prasad.springBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.prasad.springBoot.dao.AccountDAO;
import com.prasad.springBoot.model.AccountModel;
@Service
public class AccountServiceImpl implements AccountService {
	
	@Autowired
	private AccountDAO account;
	
	@Transactional
	@Override
	public List<AccountModel> get() {
		return account.get();
	}
	
	@Transactional
	@Override
	public AccountModel get(int id) {
		
		return account.get(id);
	}
	
	@Transactional
	@Override
	public void save(AccountModel obj) {
		account.save(obj);		
	}
	
	@Transactional
	@Override
	public void update(AccountModel obj) {
		account.update(obj);
	}
	
	@Transactional
	@Override
	public void delete(int id) {
		 account.delete(id);
	}

}
