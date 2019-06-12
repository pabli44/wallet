package com.pvelilla.walletServer.walletServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pvelilla.walletServer.walletServer.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
