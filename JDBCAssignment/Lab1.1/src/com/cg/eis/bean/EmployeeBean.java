package com.cg.eis.bean;

import java.io.Serializable;

public class EmployeeBean implements Serializable {
	private int empId;
	private String empDesg;
	private float empSal;
	private String scheme;
	private String empName;

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDesg() {
		return empDesg;
	}

	public void setEmpDesg(String empDesg) {
		this.empDesg = empDesg;
	}

	public float getEmpSal() {
		return empSal;
	}

	public void setEmpSal(float empSal) {
		this.empSal = empSal;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setScheme(String scheme) {
		this.scheme = scheme;
	}

	public String getScheme() {
		return scheme;
	}

}
