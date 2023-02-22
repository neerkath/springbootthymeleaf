package com.springbootthymeleaf.springbootthymeleaf.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbootthymeleaf.springbootthymeleaf.model.Employee;

@Repository
public interface Employeerepository extends JpaRepository<Employee, Integer>{
}
