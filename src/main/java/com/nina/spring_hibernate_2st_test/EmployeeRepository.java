package com.nina.spring_hibernate_2st_test;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository  extends JpaRepository<Employee,Integer>{
	List<Employee> findByName(String name);

}
