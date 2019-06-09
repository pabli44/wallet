package com.pvelilla.walletServer.walletServer.model;

public class OperationTypes {
	private int idOperation;
	private String description;
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
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
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
