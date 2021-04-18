package com.ijmeet.testCases;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ijmeet.pageobjects.Dashboardijmeet;
import com.ijmeet.pageobjects.LoginPageIJMEET;

public class Tc_login_Test_001 extends BaseClass
{
	/**
	* This Test case is used define sign in tab of IJmeet
	*Main page page of IJmeet
	* @author  Sarika Patil
	* @version 1.0
	* @since   5-04-2021*/
	
	@Test (priority=1)    
	public void signin_test()
	     {
		  driver.get(baseURL);
		  logger.info("Url is opened");
		  LoginPageIJMEET sign =new LoginPageIJMEET(driver);
		  sign.click_on_signin();
		  sign.enter_email(U_email);
		  logger.info("Entered User Name");
		  sign.set_password(pwd);
		  logger.info("Enterd Password");
		  sign.sign_inbtn();
	     }
	      public void i_want_to_verify_whether_user_navigated_to_home_page_or_not()
	      {
	      Assert.assertEquals(driver.getTitle(), "IJmeet");
	      logger.info("test case passed");
          }
	     /**
		* This Test case is used define Schedule Meeting tab and its operations of IJmeet
		*Dashboard page of IJmeet
		* @author  Sarika Patil
		* @version 1.0
	     * @param  
		* @since   5-04-2021*/
	 
	 @Test (priority=2)
	 public void dashboard_page()
	 {
		 Dashboardijmeet dsj=new Dashboardijmeet(driver);
		
		 dsj.schedule_meet();
		 dsj.meetName(meetname);
		 
		 logger.info("Entered Meeting Name");
		
		 
		driver.findElement(By.xpath("//textarea[@id='edit_description_1']")).sendKeys(meetDescription);
		dsj.meetemailinvite(email_user);
		logger.info("Entred Email invitation");
		dsj.dateSelection();
	    dsj.timeselection();
	   
	    dsj.meet_hour1();
	    dsj.meet_minute();
	    dsj.time_zone();
		dsj.languageName();
	    dsj.clickmeetpass();
	    dsj.meetPassword(pass);
	    dsj.meet_wait_room();
	    dsj.meet_videopart1();
	    dsj.meet_videopart();
	    dsj.meet_mutepart();
	    dsj.submit_meeting();
	 
     }
}