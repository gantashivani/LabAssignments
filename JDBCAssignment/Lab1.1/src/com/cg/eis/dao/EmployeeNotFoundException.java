package com.cg.eis.dao;

public class EmployeeNotFoundException extends RuntimeException {
	public EmployeeNotFoundException(final String msg){
        super(msg);
    }

}
