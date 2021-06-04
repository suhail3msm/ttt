package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class EmployeeBean {

	private String empID;
	

	private String empName;
	
	private String city;

	public EmployeeBean() {
		super();
	}

	public EmployeeBean(String empID, String empName, String city) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.city = city;
	}

	public String getEmpID() {
		return empID;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
}
