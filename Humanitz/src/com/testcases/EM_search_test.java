package com.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Javascriptexe;
import com.configration.BrowserDrivers;
import com.projectlibrary.Employee_search;

public class EM_search_test {
	
	Employee_search search=new Employee_search();
	
	
	@Test
	public void verify_employee_search() throws InterruptedException
	{
		
		
		search.employee_search();
		
		// BrowserDrivers.driver.findElement(By.xpath("//input[@id='ctl00_ContentPlaceHolder1_txtEmpCode']"));
		
		Assert.assertEquals(BrowserDrivers.driver.findElement(By.xpath("//*[contains(text(),'TE99')]")),BrowserDrivers.driver.findElement(By.xpath("//*[contains(text(),'TE99')]")));
	}

}
