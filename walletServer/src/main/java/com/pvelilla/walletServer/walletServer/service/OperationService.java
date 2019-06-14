package com.pvelilla.walletServer.walletServer.service;

public interface OperationService {
	
	public static final double AMOUNT_200 = 200;
	public static final double AMOUNT_100 = 100;
	public static final int CURRENCY_USD = 1;//"USD";
	public static final int CURRENCY_EUR = 2;//"EUR";
	public static final int CURRENCY_GBP = 3;//"GBP";

	public void deposit(Long userId, double amount, int currency);
	
	public void withdraw(Long userId, double amount, int currency);
	
	//get the operation by userId, and get all the operations of this user in USD, EUR, GBP
	public void getBalance(Long userId);
}
