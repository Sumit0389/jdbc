package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class JdbcTraining22Application implements CommandLineRunner{
   @Autowired
	private StudentDao dao;
	
	public static void main(String[] args) {
		SpringApplication.run(JdbcTraining22Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(dao.createTable());
		
	}

}
