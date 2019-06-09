package com.pvelilla.walletServer.walletServer.model;

public class Operation {
	private int idOperation;
	private int userId;
	private String amount;
	private int operationType;
	/**
	 * @return the idOperation
	 */
	public int getIdOperation() {
		return idOperation;
	}
	/**
	 * @param idOperation the idOperation to set
	 */
	public void setIdOperation(int idOperation) {
		this.idOperation = idOperation;
	}
	/**
	 * @return the userId
	 */
	public int getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(int userId) {
		this.userId = userId;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}
	/**
	 * @return the operationType
	 */
	public int getOperationType() {
		return operationType;
	}
	/**
	 * @param operationType the operationType to set
	 */
	public void setOperationType(int operationType) {
		this.operationType = operationType;
	}
}
