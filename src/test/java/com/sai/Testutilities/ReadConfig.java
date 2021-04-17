package com.sai.Testutilities;

import java.io.FileInputStream;


import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig() 
	{
		try
		{
			FileInputStream fis=new FileInputStream("/Automation_Ugadi13042021/Properties/Config.properties");
			pro=new Properties();
			pro.load(fis);
		}catch(Exception e)
		{
			e.printStackTrace();
		}

}
	
	public String geturl()
	{
		String url=pro.getProperty("BaseURL");
		return url;
	}
	
	public String getUsername()
	{
		String uname=pro.getProperty("Username");
		return uname;
	}
	public String getPassword()
	{
		String password=pro.getProperty("Password");
		return password;
	}
	
	public String getchropath()
	{
		String chrpath=pro.getProperty("Chropath");
		return chrpath;
	}
}
