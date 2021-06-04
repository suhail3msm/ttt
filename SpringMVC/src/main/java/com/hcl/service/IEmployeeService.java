package com.hcl.service;

import java.util.List;

import com.hcl.model.Employee;

public interface IEmployeeService {
	void addEmployee(Employee e);

	public List<Employee> getList();
    
}
