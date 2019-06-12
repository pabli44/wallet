package com.pvelilla.walletServer.walletServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation")
public class Operation {
	
	@Id
	@GeneratedValue
	private Long id;
	
	private Long userId;
	private int operationType;
	private double amount;
	private int currency;
	//private double 
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the userId
	 */
	public Long getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	/**
	 * @return the operatioType
	 */
	public int getOperationType() {
		return operationType;
	}
	/**
	 * @param operatioType the operatioType to set
	 */
	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}
	/**
	 * @return the amount
	 */
	public double getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(double amount) {
		this.amount = amount;
	}
	/**
	 * @return the currency
	 */
	public int getCurrency() {
		return currency;
	}
	/**
	 * @param currency the currency to set
	 */
	public void setCurrency(int currency) {
		this.currency = currency;
	}
}
