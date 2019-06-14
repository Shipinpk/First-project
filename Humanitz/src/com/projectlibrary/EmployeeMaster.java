package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.configration.BrowserDrivers;
import com.inputdata.EM_data;
import com.locators.EM_elements;

public class EmployeeMaster {
	
	public static void Employee_creation()
	{
		
		Keywords.click_elements(EM_elements.hr);
		
		Keywords.click_elements(EM_elements.employeemaster);
		
		Keywords.wait_for_xpath(EM_elements.newbutton);
		Keywords.click_elements(EM_elements.newbutton);
		
		Keywords.wait_for_xpath(EM_elements.em_ref_code);
		Keywords.enter_text(EM_elements.em_ref_code,EM_data.em_ref_code);

		Keywords.wait_for_xpath(EM_elements.first_name);
		Keywords.enter_text(EM_elements.first_name,EM_data.first_name);
		
		Keywords.enter_text(EM_elements.middle_name,EM_data.middle_name);
		
		Keywords.enter_text(EM_elements.last_name,EM_data.last_name);
		
		//Keywords.enter_text(EM_elements.nationality,EM_data.nationality);
		Keywords.sendkeys_dropdown(EM_elements.nationality,EM_data.nationality,EM_elements.nationality_value);
		
		Keywords.click_elements(EM_elements.date_of_join);
		
		Keywords.calendar_click(EM_elements.calendar_name,EM_data.month,EM_elements.next_button,EM_elements.calendar_day,EM_data.date);
		
		//Keywords.dropdown_click(EM_elements.department,EM_data.department);
		Keywords.sendkeys_dropdown(EM_elements.department,EM_data.department,EM_elements.department_list);
		
		Keywords.sendkeys_dropdown(EM_elements.designation,EM_data.designation,EM_elements.designation_list);
		
		Keywords.dropdown_click(EM_elements.reporting_to,EM_data.reporting_to_value);
		
		//Keywords.wait_for_xpath(EM_elements.grade);
		Keywords.dropdown_click(EM_elements.grade,EM_data.grade);
		
		Keywords.wait_for_xpath(EM_elements.visa_info);
		Keywords.click_elements(EM_elements.visa_info);
		
		Keywords.dropdown_click(EM_elements.visa_status,EM_data.visa_status);
		
		Keywords.enter_text(EM_elements.visa_no,EM_data.visa_no);
		
		Keywords.dropdown_click(EM_elements.visa_location,EM_data.visa_location);
		
		Keywords.click_elements(EM_elements.date_of_issue);
		
		Keywords.calendar_click(EM_elements.date_of_issue_calendar,EM_data.date_of_issue_month,EM_elements.date_of_issue_next_button,EM_elements.date_of_issue_calendar_day,EM_data.date_of_issue_day);
		
		
		Keywords.click_elements(EM_elements.date_of_expiry);
		
		Keywords.calendar_click(EM_elements.date_of_expiry_calendar,EM_data.date_of_expiry_month,EM_elements.date_of_expiry_next_button,EM_elements.date_of_expiry_calendar_day,EM_data.date_of_expiry_day);
		
		Keywords.wait_for_xpath(EM_elements.save_button);
		Keywords.click_elements(EM_elements.save_button);
		
		BrowserDrivers.driver.switchTo().alert().accept();
		
		
		
	}

}
