package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.configration.BrowserDrivers;
import com.projectlibrary.EmployeeMaster;

public class EM_test {

	EmployeeMaster Em=new EmployeeMaster();

	@Test

	public void verify_Employee_creation()
	{

		Em.Employee_creation();

	
		Assert.assertEquals(BrowserDrivers.driver.findElement(By.xpath("//*[contains(text(),'TE99')]")),BrowserDrivers.driver.findElement(By.xpath("//*[contains(text(),'TE99')]")));
	}


}
