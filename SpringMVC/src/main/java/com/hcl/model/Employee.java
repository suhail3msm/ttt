package com.hcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "HCLEMP")
public class Employee {
	
	@Id
	@Column(name = "EmpID")
	private String empID;
	
	@Column(name = "EmpName")
	private String empName;
	
	@Column(name = "City")
	private String city;

	public Employee() {
		super();
	}

	public Employee(String empID, String empName, String city) {
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
