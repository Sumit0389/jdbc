package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
   
	@Autowired
	private JdbcTemplate jdbcTemplate;
  
	public StudentDao()
	{
		
		System.out.println("Constructor Calles");
	}
	
	public int  createTable()
	{
		String query="CREATE TABLE User(id int primary key,"
				+ "name varchar(100)";
		int update = this.jdbcTemplate.update(query);
		return update;
	}
}
