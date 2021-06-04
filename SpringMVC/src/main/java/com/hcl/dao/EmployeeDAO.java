package com.hcl.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.hcl.model.Employee;

@Repository
public class EmployeeDAO implements IEmployeeDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public void SetSessionFactory(SessionFactory s) {
		this.sessionFactory = s;

	}

	@Override
	public void addEmployee(Employee e) {
		Session ses = sessionFactory.getCurrentSession();
		ses.save(e);
	}
	
	@Override
	public List<Employee> getList() {
		Session session = sessionFactory.getCurrentSession();
		List<Employee> emp = null;
		try {
			emp = (List<Employee>)session.createQuery("from HCLEMP").list();

		} catch (HibernateException e) {
			e.printStackTrace();
		}
		return emp;
	}

}
