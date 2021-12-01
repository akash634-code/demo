package com.JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.JPA.DAO.employeeDao;
import com.JPA.entity.Employee;


@SpringBootTest
class ApplicationTests {

	@Autowired
	private employeeDao empdao;
	
	
	
	
	@Test
	void contextLoads() {
		}
	
	@Test
	void testdata() {
		Employee emp = new Employee();
		emp.setName("vikash");
		empdao.save(emp);
	}

}
