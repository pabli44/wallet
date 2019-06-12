package com.pvelilla.walletServer.walletServer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvelilla.walletServer.walletServer.model.User;
import com.pvelilla.walletServer.walletServer.repository.UserRepository;

@Service
public class UserService implements IUserService {
	
	@Autowired
	private UserRepository repository;
	
	@Override
	public User findUserById(Long id) {
		User u = new User();
		Object oUser = repository.findById(id);
		u = (User)oUser;	
		return u;
	}
	
	public List<User> findAllUsers(){
		return repository.findAll();
	}
	
}
