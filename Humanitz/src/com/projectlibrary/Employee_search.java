package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.EM_search_data;
import com.locators.EM_search;

public class Employee_search {
	
	public static void employee_search() throws InterruptedException
	{
		Keywords.wait_for_xpath(EM_search.hr);
		Keywords.click_elements(EM_search.hr);
		
		Keywords.wait_for_xpath(EM_search.employeemaster);
		Keywords.click_elements(EM_search.employeemaster);
		
		Keywords.enter_text(EM_search.employee_code_search,EM_search_data.employee_code);
		
		Keywords.click_elements(EM_search.search_button);
		
		Thread.sleep(3000);
		
	}
	
	

}
