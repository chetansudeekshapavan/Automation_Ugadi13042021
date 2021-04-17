package com.sai.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;
import com.sai.Pageobjects.Registrationpageobjects;

public class RegistrationTestcase extends BaseClass {
	
	@Test
	public void Registration() throws InterruptedException, IOException
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
		Registrationpageobjects rp=new Registrationpageobjects(driver);
		rp.setcustnew();
		Thread.sleep(5000);
		rp.setcustname("pavanjio");
		Thread.sleep(5000);
		rp.setcustday("24");
		Thread.sleep(5000);
		rp.setcustmon("08");
		Thread.sleep(5000);
		rp.setcustyear("1986");
		Thread.sleep(5000);
		rp.setcustaddr("markapur");
		Thread.sleep(5000);
		rp.setcustcity("vnk");
		Thread.sleep(5000);
		rp.setcuststate("AP");
		Thread.sleep(5000);
		rp.setcustpin("522647");
		Thread.sleep(5000);
		rp.setcustmobile("8328610590");
		Thread.sleep(5000);
		rp.setcustemail(custRandom()+"@gmail.com");
		Thread.sleep(5000);
		rp.setcustpass("pavan123");
		Thread.sleep(5000);
		rp.setcustsub();
		Thread.sleep(5000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
		}
		else
		{
			getScreencapture(driver,"Registration");
			Assert.assertTrue(false);
		}
	}

}
