package com.hcl.dao;

import java.util.List;

import org.hibernate.SessionFactory;

import com.hcl.model.Employee;
import com.hcl.model.EmployeeBean;

public interface IEmployeeDAO {
	public void SetSessionFactory(SessionFactory s);
	void addEmployee(Employee e);
	public List<Employee> getList();
}
