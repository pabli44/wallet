package com.pvelilla.walletServer.walletServer;

import java.io.IOException;
import java.util.logging.Logger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.grpc.Server;
import io.grpc.ServerBuilder;
//import com.pvelilla.walletProto.proto;


@SpringBootApplication
public class WalletServerApplication {

	private static final Logger logger = Logger.getLogger(WalletServerApplication.class.getName());
	
	private Server server;
	
	public void start() throws IOException {
		int port = 8081;
		server = ServerBuilder.forPort(port)
//				.addService(new WalletServiceGrpc())
				.build()
				.start();
				
		logger.info("Server started, listening on " + port);
		
		Runtime.getRuntime().addShutdownHook(new Thread() {
		      @Override
		      public void run() {
		        // Use stderr here since the logger may have been reset by its JVM shutdown hook.
		        System.err.println("*** shutting down gRPC server since JVM is shutting down");
		        WalletServerApplication.this.stop();
		        System.err.println("*** server shut down");
		      }
		    });
	}
	
	
	private void stop() {
	    if (server != null) {
	    	server.shutdown();
	    }
	}
	
	public static void main(String[] args) {
		SpringApplication.run(WalletServerApplication.class, args);
	}

}
