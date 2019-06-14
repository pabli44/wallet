package com.pvelilla.walletServer.walletServer.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pvelilla.walletServer.walletServer.model.Operation;
import com.pvelilla.walletServer.walletServer.repository.OperationRepository;

@Service
public class IOperationService implements OperationService{

	@Autowired
	private OperationRepository repository;

	@Override
	public void deposit(Long userId, double amount, int currency){
		Operation op;

		try {
			op = new Operation();
			op.setUserId(userId);
			op.setAmount(amount);
			op.setCurrency(currency);

			repository.save(op);
		}catch(Exception e) {
			System.out.println("Unknown currency"); //Unknown currency
		}

	}

	@Override
	public void withdraw(Long userId, double amount, int currency) {
		int res = 1;
		double amountFromUser = 0;
		List <Operation> listOperationsByUser; 
		Operation op = null;

		try {
			listOperationsByUser = (List<Operation>)repository.findAll().stream().filter(uo -> uo.getUserId().equals(userId)).collect(Collectors.toList());

			if(listOperationsByUser.size()>0) {
				for(int i=0;i<listOperationsByUser.size();i++) {
					op = listOperationsByUser.get(i);
					if(listOperationsByUser.get(i).getCurrency()==currency) {
						amountFromUser += listOperationsByUser.get(i).getAmount();
					}
				}
			}

			if(currency!= 1 && currency!= 2 && currency!= 3) {
				res = 2; //Unknown currency
			}

			if(amountFromUser < amount) {
				res = 3; //insufficient funds
			}else {
				op.setAmount(amountFromUser - amount);
				repository.save(op);
			}
			
			

			if(res==1) {
				System.out.println("Ok");
			}else if(res==2) {
				System.out.println("Unknown currency");
			}else if(res==3) {
				System.out.println("insufficient funds");
			}

		}catch(Exception e) {

		}


	}

	@Override
	public void getBalance(Long userId) {
		List<Operation> listOperationBalanceByUser;
		Map<String, Object> MapEachCurrencyByUser = new HashMap<>();

		double amountCurrencyUSD = 0;
		double amountCurrencyEUR = 0;
		double amountCurrencyGBP = 0;


		try {
			listOperationBalanceByUser =  (List<Operation>)repository.findAll().stream().filter(uo -> uo.getUserId() == userId).collect(Collectors.toList());
			MapEachCurrencyByUser = new HashMap<String, Object>();


			for(int i=0;i<listOperationBalanceByUser.size();i++) {
				 if(listOperationBalanceByUser.get(i).getCurrency()==IOperationService.CURRENCY_USD) {
					 amountCurrencyUSD += amountCurrencyUSD;
				 }

				 if(listOperationBalanceByUser.get(i).getCurrency()==IOperationService.CURRENCY_EUR) {
					 amountCurrencyEUR += amountCurrencyEUR;
				 }

				 if(listOperationBalanceByUser.get(i).getCurrency()==IOperationService.CURRENCY_GBP) {
					 amountCurrencyGBP += amountCurrencyGBP;
				 }
			}

			MapEachCurrencyByUser.put("currencyAmountUSD", amountCurrencyUSD);
			MapEachCurrencyByUser.put("currencyAmountEUR", amountCurrencyEUR);
			MapEachCurrencyByUser.put("currencyAmountGBP", amountCurrencyGBP);			

			System.out.println("***** These are the balances ******");
			System.out.println("USD: "+ MapEachCurrencyByUser.get("currencyAmountUSD"));
			System.out.println("EUR: "+ MapEachCurrencyByUser.get("currencyAmountEUR"));
			System.out.println("GBP: "+ MapEachCurrencyByUser.get("currencyAmountGBP"));

		}catch(Exception e) {

		}


	}
	
}