package com.prasad.springBoot.service;

import java.util.List;

import com.prasad.springBoot.model.AccountModel;

public interface AccountService {
	List<AccountModel> get();

	AccountModel get(int id);

	void save(AccountModel account);

	void update(AccountModel obj);
	
	void delete(int id);
}
