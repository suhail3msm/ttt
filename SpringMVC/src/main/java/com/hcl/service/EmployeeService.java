package com.hcl.service;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hcl.dao.EmployeeDAO;
import com.hcl.model.Employee;

@Service
public class EmployeeService implements IEmployeeService {

	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	@Transactional
	public void addEmployee(Employee e) {
		employeeDAO.addEmployee(e);

	}
	
	@Override
	@Transactional
	public List<Employee> getList() {
		return employeeDAO.getList();
	}
}
