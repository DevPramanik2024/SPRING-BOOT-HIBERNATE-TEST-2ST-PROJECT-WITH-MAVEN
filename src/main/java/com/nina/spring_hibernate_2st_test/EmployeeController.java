package com.nina.spring_hibernate_2st_test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeRepository erepo;
	@RequestMapping("/test")
	public String test()
	{
		return "this is test only";
	}
	
	@PostMapping("/save")
	public String save(@RequestBody Employee employee)
	{
		erepo.save(employee);
		return "this is test only";
	}
	
	
	@GetMapping("/all")
	public List<Employee> alldata()
	{
	return erepo.findAll();	
	}
	
	@GetMapping("/by/{name}")
	public List<Employee> byname(@PathVariable String name)
	{
		return erepo.findByName(name);
	}
}
