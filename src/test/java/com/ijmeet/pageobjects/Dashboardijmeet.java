package com.ijmeet.pageobjects;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Dashboardijmeet {
	/**
	 * This class is used define the locators and action methods Dashboard page of
	 * IJmeet
	 * 
	 * @author Sarika Patil
	 * @version 1.0
	 * @since 5-04-2021
	 */

	WebDriver driver;

	public Dashboardijmeet(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[@class='inner-auth-form-transparent-mirror']/child::button")

	@CacheLookup

	WebElement sceduleMeet;

	public void schedule_meet() {
		sceduleMeet.click();
	}

	@FindBy(id = "edit_topic")
	WebElement meetNAME;

	public void meetName(String meetname) {
		meetNAME.sendKeys(meetname);
	}
	/*
	 * @FindBy(xpath="//textarea[@id='edit_description_1']") WebElement
	 * meetDescription;
	 * 
	 * public void meetDescrption(String meetDescription) {
	 * meetNAME.sendKeys(meetDescription); }
	 */

	@FindBy(xpath = "//input[@class='multiple_emails-input text-left']")

	WebElement email_invite;

	public void meetemailinvite(String email_user) {
		email_invite.sendKeys(email_user);
	}

	@FindBy(id = "edit_start_end_date")

	WebElement date_selection;

	public void dateSelection() {

		date_selection.click();

		WebElement month = driver.findElement(By.className("monthselect"));
		Select monthCombo = new Select(month);
		monthCombo.selectByVisibleText("May");

		WebElement year = driver.findElement(By.className("yearselect"));
		Select yearCombo = new Select(year);
		yearCombo.selectByVisibleText("2022");
		// this will find all matching nodes in calendar
		List<WebElement> allDates = driver.findElements(By.xpath("//table[@class='table-condensed']"));

		// Click on date 7 or any other date of your choice
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[1]/table/tbody/tr[2]/td[7]")).click();

	}
	
	 @FindBy(css="#m_schedule_time_n")
	 WebElement time;
	  
	 // @FindBy(xpath="//*[@id=\"meeting-home-timepicker\"]/div/div/span/img")
	 // WebElement imageclock;
	  public void timeselection() 
	  { 
		  time.click();
		  }
	 

	@FindBy(id = "edit_hour")
	WebElement meethour;

	public void meet_hour1() {
		meethour.click();
		Select monthCombo = new Select(meethour);
		monthCombo.selectByVisibleText("03");
	}

	@FindBy(id = "edit_minute")
	WebElement meetminute;

	public void meet_minute() {
		meetminute.click();
		Select monthCombo = new Select(meetminute);
		monthCombo.selectByVisibleText("60");
	}

	@FindBy(id = "edit_timezone")
	WebElement timezone;

	public void time_zone() {
		meetminute.click();
		Select monthCombo = new Select(timezone);
		monthCombo.selectByVisibleText("(GMT+04:00) Indian/Mauritius");
	}

	

	
	 @FindBy(xpath="//select[@id='email_template_language']/child::option")
	  WebElement language;
	 
	 public void languageName() { language.click(); }
	 
		@FindBy(xpath = "//input[@name='req_meeting_password']")
		WebElement check1;

		public void clickmeetpass() {

			WebElement element = driver.findElement(By.xpath("//input[@name='req_meeting_password']"));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			// check1.click();
		}

		@FindBy(id = "edit_meeting_password")
		WebElement meetpass;

		public void meetPassword(String pass) {

			meetpass.sendKeys(pass);

		}
		@FindBy(id = "edit_enable_waiting")
		WebElement meetwaitroom;

		public void meet_wait_room() {

			WebElement element = driver.findElement(By.id("edit_enable_waiting"));
			Actions act = new Actions(driver);
			act.moveToElement(element).click().build().perform();
			//meetwaitroom.click();

		}
		
		@FindBy(id="edit_host_video")
		WebElement editvideoparticipant;
		
		public void meet_videopart1()
		{
			Actions act = new Actions(driver);
			act.moveToElement(editvideoparticipant).click().build().perform();
		}
		@FindBy(id="edit_participant_video")
		WebElement slide;
		public void meet_videopart()
		{
			Actions act = new Actions(driver);
			act.moveToElement(slide).click().build().perform();
          
		}
		
		@FindBy(id="meet_participant_upon_enter")
		WebElement mutepart;
		public void meet_mutepart()
		{
			Actions act = new Actions(driver);
			act.moveToElement(mutepart).click().build().perform();
          
			
		}
		@FindBy(id="submitmeeting")
		WebElement submitmeet;
		public void submit_meeting()
		{
			submitmeet.click();
		}
		
		}
		

