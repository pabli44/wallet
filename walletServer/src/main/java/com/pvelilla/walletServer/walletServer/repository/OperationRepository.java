package com.pvelilla.walletServer.walletServer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pvelilla.walletServer.walletServer.model.Operation;

@Repository
public interface OperationRepository extends JpaRepository<Operation, Long>{
		
}
