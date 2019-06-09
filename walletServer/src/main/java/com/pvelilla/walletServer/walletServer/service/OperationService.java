package com.pvelilla.walletServer.walletServer.service;

import com.pvelilla.walletServer.walletServer.model.Users;

public interface OperationService {
	public default void deposit() throws Exception{
		
	}
	
	public default void withdraw() throws Exception{
		
	}
	
	public default void getBalance(Users u) throws Exception{
		
	}
}
