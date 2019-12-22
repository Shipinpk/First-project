package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inputdata.EM_data;
import com.projectlibrary.EmployeeMaster;

public class EM_test {
	
	EmployeeMaster Em=new EmployeeMaster();
	
	@Test
	
	public void verify_Employee_creation()
	{
		
		Em.Employee_creation();
		
		Assert.assertEquals(EM_data.employee_master_expected,EM_data.employee_master_expected);
	}
			

}
