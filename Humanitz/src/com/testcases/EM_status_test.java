package com.testcases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.configration.BrowserDrivers;
import com.inputdata.EM_status_data;
import com.projectlibrary.EmployeeStatus;

public class EM_status_test {
	
	EmployeeStatus status=new EmployeeStatus();
	
	@Test
	
	public void status_verify()
	{
		status.employee_status();
		//String value1=BrowserDrivers.driver.findElement(By.xpath("//select[@id='ctl00_ContentPlaceHolder1_tp1_TabContainer1_TabPanel8_DdlEmployeeStatus']")).getAttribute("value1");
		
		Assert.assertEquals(EM_status_data.employee_value_orginal,"On Duty");
		
	}
}