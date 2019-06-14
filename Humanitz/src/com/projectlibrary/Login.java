package com.projectlibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

import com.commonlibrary.Javascriptexe;
import com.commonlibrary.Keywords;
import com.configration.BrowserDrivers;
import com.inputdata.Login_data;
import com.locators.Login_elements;

public class Login {
	
	public void login_humanitz() throws InterruptedException
	{
		Keywords.wait_for_xpath(Login_elements.clientid);
		Keywords.enter_text(Login_elements.clientid,Login_data.clientid);
		
		//Keywords.wait_for_xpath(Login_elements.usercode);
		//Keywords.enter_text(Login_elements.usercode,Login_data.usercode);
		
		Javascriptexe.js.executeScript("document.getElementById('txtUserName1').focus();");
		
		Keywords.enter_text1(Login_elements.usercode,Login_data.usercode);
		
		//Keywords.wait_for_xpath(Login_elements.password);
		//Keywords.enter_text(Login_elements.password,Login_data.password);
		
		Keywords.enter_text1(Login_elements.password,Login_data.password);
		
	
		
		Keywords.click_elements(Login_elements.login);
		
		
		
		
			}

}
