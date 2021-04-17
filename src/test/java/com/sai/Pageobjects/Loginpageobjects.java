package com.sai.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Loginpageobjects {
	
	public WebDriver ldriver;
	
	public Loginpageobjects(WebDriver rdriver) {
		
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(how=How.NAME,using="uid")
	@CacheLookup
	WebElement username;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement password;
	@FindBy(how=How.NAME,using="btnLogin")
	@CacheLookup
	WebElement loginbtn;
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[15]/a[1]")
	@CacheLookup
	WebElement custlogout;
	
	public void setUsername(String uname)
	{
		username.sendKeys(uname);
	}
	public void setPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	public void submit()
	{
		loginbtn.click();
	}
	
	public void clogout()
	{
		custlogout.click();
	}
	

}
