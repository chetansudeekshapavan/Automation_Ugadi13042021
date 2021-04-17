package com.sai.Testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.sai.Pageobjects.Loginpageobjects;
import com.sai.Testutilities.XLUtils;

public class Login_DDT extends BaseClass {
	
	@Test(dataProvider="Logintest")
	public void LoginDDT(String sai,String sudeeksha) throws InterruptedException
	{
		Loginpageobjects lp=new Loginpageobjects(driver);
		lp.setUsername(sai);
		logger.info("username entered");
		Thread.sleep(5000);
		lp.setPassword(sudeeksha);
		logger.info("passsword entered");
		Thread.sleep(5000);
		lp.submit();
		logger.info("loginbutton clicked");
		Thread.sleep(5000);
		
		if(isAlertpresent()==true)
		{
			Assert.assertTrue(false);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
		}
		else
		{
			Assert.assertTrue(true);
			lp.clogout();
			Thread.sleep(5000);
			driver.switchTo().alert().accept();
			Thread.sleep(5000);
			driver.switchTo().defaultContent();
			Thread.sleep(5000);
			
		}
	}
	
	
	
	
	
	@DataProvider(name="Logintest")
	public String [][] getData() throws IOException
	{
		String path="/Automation_Ugadi13042021/src/test/java/com/sai/Testdata/LoginDataTest.xlsx";
		int rowcount=XLUtils.getRowCount(path, "Sheet1");
		int colcount=XLUtils.getCellCount(path, "Sheet1", 1);
		
		String logindata[][]=new String[rowcount][colcount];
		
		for(int i=1;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				logindata[i-1][j]=XLUtils.getCellData(path, "Sheet1", i, j);
			}
		}
		return logindata;
	}
	
	
	

}
