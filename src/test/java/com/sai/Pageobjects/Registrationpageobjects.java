package com.sai.Pageobjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class Registrationpageobjects {
	
	public WebDriver ldriver;
	
	public Registrationpageobjects(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(how=How.XPATH,using="//body[1]/div[3]/div[1]/ul[1]/li[2]/a[1]")
	@CacheLookup
	WebElement newcust;
	@FindBy(how=How.NAME,using="name")
	@CacheLookup
	WebElement custname;
	@FindBy(how=How.NAME,using="dob")
	@CacheLookup
	WebElement custdob;
	@FindBy(how=How.NAME,using="addr")
	@CacheLookup
	WebElement custadd;
	@FindBy(how=How.NAME,using="city")
	@CacheLookup
	WebElement custcity;
	@FindBy(how=How.NAME,using="state")
	@CacheLookup
	WebElement custstate;
	@FindBy(how=How.NAME,using="pinno")
	@CacheLookup
	WebElement custpin;
	@FindBy(how=How.NAME,using="telephoneno")
	@CacheLookup
	WebElement custmno;
	@FindBy(how=How.NAME,using="emailid")
	@CacheLookup
	WebElement custemail;
	@FindBy(how=How.NAME,using="password")
	@CacheLookup
	WebElement custpwd;
	@FindBy(how=How.NAME,using="sub")
	@CacheLookup
	WebElement custsub;
	
	public void setcustnew()
	{
		newcust.click();
	}
	
	public void setcustname(String cname)
	{
		custname.sendKeys(cname);
	}
	public void setcustday(String cday)
	{
		custdob.sendKeys(cday);
	}
	public void setcustmon(String cmon)
	{
		custdob.sendKeys(cmon);
	}
	public void setcustyear(String cyear)
	{
		custdob.sendKeys(cyear);
	}
	public void setcustaddr(String caddr)
	{
		custadd.sendKeys(caddr);
	}
	public void setcustcity(String ccity)
	{
		custcity.sendKeys(ccity);
	}
	public void setcuststate(String cstate)
	{
		custstate.sendKeys(cstate);
	}
	public void setcustpin(String pin)
	{
		custpin.sendKeys(pin);
	}
	public void setcustmobile(String cmno)
	{
		custmno.sendKeys(cmno);
	}
	public void setcustemail(String cemail)
	{
		custemail.sendKeys(cemail);
	}
	public void setcustpass(String cpwd)
	{
		custpwd.sendKeys(cpwd);
	}
	public void setcustsub()
	{
		custsub.click();
	}

}
