package com.sai.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;

public class LoginTestcase extends BaseClass {
	
	@Test
	public void Login() throws InterruptedException, IOException
	{
	
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(Username);
		logger.info("username entered");
		Thread.sleep(5000);
		lp.setPassword(Password);
		logger.info("passsword entered");
		Thread.sleep(5000);
		lp.submit();
		logger.info("loginbutton clicked");
		Thread.sleep(5000);
		if(driver.getPageSource().contains("Guru99 Bank Manager HomePage"))
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreencapture(driver,"Login");
			Assert.assertTrue(false);
		}
		
		
		
	}
	

}
