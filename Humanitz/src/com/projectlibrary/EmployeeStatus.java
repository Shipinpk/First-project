package com.projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.commonlibrary.Keywords;
import com.configration.BrowserDrivers;
import com.inputdata.EM_status_data;
import com.locators.EM_search;
import com.locators.EM_status_elements;

public class EmployeeStatus {
	
	public static void employee_status()
	{
		
		Keywords.wait_for_xpath(EM_status_elements.employee_details);
		Keywords.click_elements(EM_status_elements.employee_details);
		
		Keywords.wait_for_xpath(EM_status_elements.status_button);
		Keywords.click_elements(EM_status_elements.status_button);
		
		Keywords.wait_for_xpath(EM_status_elements.employee_status_value);
		Keywords.get_attribute(EM_status_elements.employee_status_value,EM_status_data.employee_value);
		
		Keywords.wait_for_xpath(EM_status_elements.exit_button);
		Keywords.click_elements(EM_status_elements.exit_button);
		
	}
	

}
