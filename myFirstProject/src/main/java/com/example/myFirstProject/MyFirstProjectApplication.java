package com.example.myFirstProject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyFirstProjectApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MyFirstProjectApplication.class, args);
	}
//	@Autowired  // field dependency  we can't use Final keyword
	private final PaymentService paymentService;

	public MyFirstProjectApplication(PaymentService paymentService) {
		this.paymentService = paymentService;
	}  // Constructor Dependency  // we can use final keyword
	@Override
	public void run(String... args) throws Exception {
		String payment = paymentService.pay();
		System.out.println("Payment done : "+payment);
	}
}
