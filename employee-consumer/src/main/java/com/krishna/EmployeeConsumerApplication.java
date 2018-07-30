package com.krishna;

import java.io.IOException;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import com.krishna.controller.ConsumerClientController;

@SpringBootApplication
public class EmployeeConsumerApplication {

	public static void main(String[] args) throws RestClientException, IOException {
		ApplicationContext ctx = SpringApplication.run(
				EmployeeConsumerApplication.class, args);
		
		ConsumerClientController consumerClientController=ctx.getBean(ConsumerClientController.class);
		System.out.println(consumerClientController);
		consumerClientController.getEmployee();
		
	}
	
	
	public  ConsumerClientController  consumerControllerClient()
	{
		return  new ConsumerClientController();
	}
}
