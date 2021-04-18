package com.ijmeet.testCases;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.ijmeet.utilities.ReadConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
	ReadConfig readconf=new ReadConfig();
	
	public String baseURL=readconf.getapplication_url();
	public static WebDriver driver;
	public String U_email=readconf.get_email();
	public String pwd=readconf.get_password();
	public String meetname=readconf.get_meetName();
	public String meetDescription=readconf.get_meetDescription();
    public String email_user=readconf.get_MeetEmaiilInvite();
    public String pass=readconf.meetpassword();
	public static Logger logger;
	
	@BeforeClass
      public void setup()
    {
		WebDriverManager.chromedriver().setup();
	    driver =new ChromeDriver();
	    driver.manage().window().maximize();
	   logger =Logger.getLogger(BaseClass.class);
	   PropertyConfigurator.configure("Log4j.properties");
		      
     }
	//@AfterClass
	//public void  tear_down()
	//
   //  {
		
    //  driver.close();
    // }
}