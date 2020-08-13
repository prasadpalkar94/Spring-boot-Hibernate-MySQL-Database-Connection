package com.prasad.springBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prasad.springBoot.service.AccountService;


import com.prasad.springBoot.model.AccountModel;

@RestController
@RequestMapping("/api")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("/get")
	public List<AccountModel> get(){
		return accountService.get();
	}
	
	@PostMapping("/post")
	public AccountModel save(@RequestBody AccountModel acc) {
		accountService.save(acc);
		return acc;
	}
	
	@GetMapping("/getById/{id}")
	public AccountModel getById(@PathVariable int id) {
		return accountService.get(id);
	}
	
	@PutMapping("/put")
	public AccountModel update(@RequestBody AccountModel acc) {
		accountService.update(acc);
		return acc;
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		accountService.delete(id);
		return "deleted with :" +id;
	}
}
