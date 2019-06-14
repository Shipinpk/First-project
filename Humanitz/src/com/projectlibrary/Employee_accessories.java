package com.projectlibrary;

import com.commonlibrary.Keywords;
import com.inputdata.Employee_accesories_data;
import com.locators.Employee_accessories_path;

public class Employee_accessories {
	
	public static void employee_accessories_creation()
	{
		Keywords.wait_for_xpath(Employee_accessories_path.employee_acessories_icon);
		Keywords.click_elements(Employee_accessories_path.employee_acessories_icon);
		
		Keywords.wait_for_xpath(Employee_accessories_path.employee_acess_new_button);
		Keywords.click_elements(Employee_accessories_path.employee_acess_new_button);
		
		Keywords.sendkeys_dropdown(Employee_accessories_path.employee_code,Employee_accesories_data.employee_code,Employee_accessories_path.employee_code_list);

	
	}

}
