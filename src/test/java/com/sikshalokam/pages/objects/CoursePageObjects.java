package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CoursePageObjects {
	
	@FindBy(xpath = "(//a[normalize-space()='Courses'])[1]")
	public WebElement coursesButton;
	
	@FindBy(xpath = "//li[normalize-space()='Workspace']")
	public WebElement workspace;
	
	//li[normalize-space()='Workspace']
	
//	(//a[normalize-space()='Courses'])[1]

}
