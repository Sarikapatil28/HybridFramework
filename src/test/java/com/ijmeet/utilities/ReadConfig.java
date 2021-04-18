package com.ijmeet.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.Reader;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
	File src=new File("./Configuration/config.properties");
	
	
		try{
			FileInputStream fis=new FileInputStream(src);
			
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e) {
			System.out.println("Exception is"+e.getMessage());
		}
		
		
	}
	public String getapplication_url()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	public String get_email()
	{
		String uname=pro.getProperty("U_email");
		return uname;
	}
	public String get_password()
	{
		String upass=pro.getProperty("pwd");
		return upass;
	}
	public String get_meetName()
	{
		String meetn=pro.getProperty("meetname");
		return meetn;
	}
	public String get_meetDescription()
	{
		String meetD=pro.getProperty("meetDescription");
		return meetD;
	}
	public String get_MeetEmaiilInvite()
	{
		String meetemail=pro.getProperty("email_user");
		return meetemail;
	}
	public String language_name()
	{
		String lan=pro.getProperty("english");
		return lan;
	}
	public String meetpassword()
	{
		String lan=pro.getProperty("pass");
		return lan;
	}
	
	
}