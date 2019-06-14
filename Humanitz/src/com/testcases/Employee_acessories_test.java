package com.testcases;

import org.testng.annotations.Test;

import com.projectlibrary.Employee_accessories;

public class Employee_acessories_test {
	
	Employee_accessories acess=new Employee_accessories();
	
	@Test
	public void verify_employee_accessories()
	{
		acess.employee_accessories_creation();
	}

}
