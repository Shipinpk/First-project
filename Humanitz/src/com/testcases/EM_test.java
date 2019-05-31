package com.testcases;

import org.testng.annotations.Test;

import com.projectlibrary.EmployeeMaster;

public class EM_test {
	
	EmployeeMaster Em=new EmployeeMaster();
	
	@Test
	
	public void verify_Employee_creation()
	{
		
		Em.Employee_creation();
	}
			

}
