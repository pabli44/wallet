package com.pvelilla.walletServer.walletServer;

import java.util.concurrent.ExecutionException;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.SpringVersion;
import org.springframework.test.context.junit4.SpringRunner;

import com.pvelilla.walletServer.walletServer.service.IOperationService;
import com.pvelilla.walletServer.walletServer.service.OperationService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WalletServerApplicationTests {

	@Autowired
	private OperationService operationService;

	
	@Test
	public void defaultTest() {
		System.out.println("Hello World");
	}
	
	@Test
	public void contextLoads() {
		System.out.println("Spring Version: "+ SpringVersion.getVersion());
	}
	
	@Test
	public void executeTests() throws ExecutionException, InterruptedException {
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
        test11();
        test12();
    }
	
	@Test
	public void test1() throws ExecutionException, InterruptedException {
		operationService.withdraw(new Long(1), IOperationService.AMOUNT_200, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test2() throws ExecutionException, InterruptedException {
		operationService.deposit(new Long(1),  IOperationService.AMOUNT_100, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test3() throws ExecutionException, InterruptedException {
		operationService.getBalance(new Long(1));
	}
	
	@Test
	public void test4() throws ExecutionException, InterruptedException {
		operationService.withdraw(new Long(1), IOperationService.AMOUNT_200, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test5() throws ExecutionException, InterruptedException {
		operationService.deposit(new Long(1),  IOperationService.AMOUNT_100, IOperationService.CURRENCY_EUR);
	}
	
	@Test
	public void test6() throws ExecutionException, InterruptedException {
		operationService.getBalance(new Long(1));
	}
	
	@Test
	public void test7() throws ExecutionException, InterruptedException {
		operationService.withdraw(new Long(1), IOperationService.AMOUNT_200, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test8() throws ExecutionException, InterruptedException {
		operationService.deposit(new Long(1),  IOperationService.AMOUNT_100, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test9() throws ExecutionException, InterruptedException {
		operationService.getBalance(new Long(1));
	}
	
	@Test
	public void test10() throws ExecutionException, InterruptedException {
		operationService.withdraw(new Long(1), IOperationService.AMOUNT_200, IOperationService.CURRENCY_USD);
	}
	
	@Test
	public void test11() throws ExecutionException, InterruptedException {
		operationService.getBalance(new Long(1));
	}
	
	@Test
	public void test12() throws ExecutionException, InterruptedException {
		operationService.withdraw(new Long(1), IOperationService.AMOUNT_200, IOperationService.CURRENCY_USD);
		
	}

}
