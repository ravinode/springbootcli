package com.ravi.springcli;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootConsoleApplication implements CommandLineRunner {

	@Autowired
	Hello hello;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SpringApplication app = new SpringApplication(SpringBootConsoleApplication.class);
		app.run(args);
	}

	public void run(String... arg) throws Exception {
		// TODO Auto-generated method stub
            System.out.println(hello.getMessage());	
	}

}
