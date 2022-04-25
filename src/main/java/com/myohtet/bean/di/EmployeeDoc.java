package com.myohtet.bean.di;

public class EmployeeDoc {
	
  public void insert(Employee e) {
	  
	  System.out.println(""" 
	  		Employee name is %s,
	  		Employee email is %s,
	  		""".formatted(e.getName(),e.getEmail()));
  }
	
}
