package com.JPA.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.JPA.entity.Employee;

public interface employeeDao extends JpaRepository<Employee, Integer> {

}
