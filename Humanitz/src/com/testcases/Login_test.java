package com.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.commonlibrary.Browser;
import com.configration.BrowserDrivers;
import com.inputdata.Login_data;
import com.projectlibrary.Login;

public class Login_test {
	
	Login login=new Login();
	
	@Test
	
	public void verify_login() throws InterruptedException
	{
		Browser.open_chrome_browser();
		Browser.navigate_to(Login_data.url);
		
		login.login_humanitz();
		Assert.assertEquals(BrowserDrivers.driver.getCurrentUrl(),Login_data.expectedresult);
	}
	
	

}
