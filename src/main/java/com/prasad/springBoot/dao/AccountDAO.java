package com.prasad.springBoot.dao;

import java.util.List;

import com.prasad.springBoot.model.AccountModel;

public interface AccountDAO {
List<AccountModel> get();

AccountModel get(int id);

void save(AccountModel account);

void delete(int id);

void update(AccountModel account);
}
