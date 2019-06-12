package com.pvelilla.walletServer.walletServer.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "operation_detail")
public class OperationDetail {
	
	@Id
	@GeneratedValue
	private Long id;
	
	//private 
}
