package com.pvelilla.walletServer.walletServer.service;

import java.util.List;

import com.pvelilla.walletServer.walletServer.model.User;

public interface IUserService {
	public User findUserById(Long id);
	public List<User> findAllUsers();
}
