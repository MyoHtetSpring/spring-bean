package com.myohtet.bean.di;

public class EmployeeService {

	private EmployeeDoc doc;

	public EmployeeService(EmployeeDoc doc) {
		super();
		this.doc = doc;
	}
    
	public void create(Employee e) {
		doc.insert(e);
	}
	
}
