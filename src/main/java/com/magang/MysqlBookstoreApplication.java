package com.magang;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class MysqlBookstoreApplication implements CommandLineRunner{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public static void main(String[] args) {
		SpringApplication.run(MysqlBookstoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String sql = "INSERT INTO users (fullname,email,password)VALUES(?,?,?)";
		int result = jdbcTemplate.update(sql,"Test","test@gmail.com","1234567890");
		if(result>0) {
			System.out.println("A new row has been inserted");
		}
		
	}

}
