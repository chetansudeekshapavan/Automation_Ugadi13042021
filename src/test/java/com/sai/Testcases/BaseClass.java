package com.sai.Testcases;
import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.sai.Testutilities.ReadConfig;

public class BaseClass {
	
	ReadConfig rc=new ReadConfig();
	
	public  static WebDriver driver;
	
	public String baseURL=rc.geturl();
	public  String Username=rc.getUsername();
	public  String Password=rc.getPassword();
	
	public static Logger logger;
	
	
	@BeforeClass
	public void setup()
	{
		logger=Logger.getLogger("E:\\Automation_Ugadi13042021\\log4j.properties");
		PropertyConfigurator.configure("log4j.properties");
		System.setProperty("webdriver.chrome.driver", rc.getchropath());
		driver=new ChromeDriver();
		driver.get(baseURL);
		logger.info("url entered");
		driver.manage().window().maximize();
		
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	public void getScreencapture(WebDriver driver,String tname) throws IOException
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		File target=new File(System.getProperty("user.dir")+"/Screenshots/"+tname+".png");
		FileUtils.copyFile(source, target);
		
	}
	
	public String custRandom()
	{
		String email=RandomStringUtils.randomAlphanumeric(8);
		return email;
	}
	public static boolean isAlertpresent()
	{
		try
		{
		driver.switchTo().alert().accept();
		return true;
		}catch(NoAlertPresentException e)
		{
			System.out.println(e.getMessage());
			return false;
		}
		
		
	}
	}
	
	
	


