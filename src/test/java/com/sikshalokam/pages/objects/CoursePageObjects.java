package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePageObjects {
	
	@FindBy(xpath = "(//a[normalize-space()='Courses'])[1]")
	public WebElement coursesButton;
	
	@FindBy(xpath = "//li[normalize-space()='Workspace']")
	public WebElement workspace;
	
	@FindBy(xpath = "//input[@id='keyword']")
	public WebElement searchfield;
	
	@FindBy(xpath = "//button[@title='Search in undefined']")
	public WebElement searchbutton;
	
	@FindBy(xpath = "//bdi[normalize-space()='Automation testing course ML']")          //h4[@title='Automation testing course ML']
	public WebElement ongoingCourse;
	
	@FindBy(xpath = "//button[normalize-space()='Join Course']")
	public WebElement joinCourseButton;
	
	@FindBy(xpath = "//span[normalize-space()='Course']")
	public WebElement createCourse;
	
	@FindBy(xpath = "//input[@placeholder='Title']")
	public WebElement coursetitle;
	
	@FindBy(xpath = "//input[@placeholder='Enter Keywords']")
	public WebElement enterKeywords;
	
	@FindBy(xpath = "//div[@class='sb-dropdown']//select[@id='sb-dropdown']")
	public WebElement courseTypeDropdown;
	
	@FindBy(xpath = "(//option[.='State (Tamil Nadu)'])[1]")
	public WebElement courseTypeTamilNadu;
	//(//option[.='State (Tamil Nadu)'])[1]
	
	//div[@class='sb-dropdown']//select[@id='sb-dropdown']
	
	//input[@placeholder='Enter Keywords']
	
	//input[@placeholder='Title']
	
	//span[normalize-space()='Course']
	//h4[@title='Automation testing course ML']
	
	
	//input[@id='keyword']
	
	//li[normalize-space()='Workspace']
	
//	(//a[normalize-space()='Courses'])[1]

}
