package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.AdminDashboardObjects;
import com.sikshalokam.pages.objects.CoursePageObjects;
import com.sikshalokam.utils.logger.Logger;
import com.sikshalokam.utils.prop.PropUtlis;

public class CoursePageAction {
	CoursePageObjects coursepageObjects;
	
	 public CoursePageAction() throws Exception {
		 coursepageObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), CoursePageObjects.class);
	    }
	      SoftAssert softAssert = new SoftAssert();

	    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    
	    public void verifyCourseButton() throws Exception {
            Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.coursesButton),"Course button is not displayed.");
    		Logger.logAndReportPass("Course button button is displayed succesfully");
    	}
	    
	    public void clickOnCoursesButton() throws Exception {
    		SikshaLokamClient.get().gestures().click(coursepageObjects.coursesButton);
    		Logger.logAndReportInfo("Clicked on the Courses button");
    	}
	    
	    public void clickOnWorkspace() throws Exception {
    		SikshaLokamClient.get().gestures().click(coursepageObjects.workspace);
    		Logger.logAndReportInfo("Clicked on the Workspace");
    	}
	    public void searchForOngoinCourse() throws Exception {
    		SikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.searchfield, "do_2137730803486720001382");
    		SikshaLokamClient.get().gestures().click(coursepageObjects.searchbutton);
    		Logger.logAndReportInfo("Searched for Automation testing course");
    		//Thread.sleep(2000);
    		 SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.ongoingCourse);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.ongoingCourse);
    		Logger.logAndReportInfo("Selected Automation testing course");
    		Thread.sleep(2000);
    	}
	    public void verifyJoinCourseButtonisEnabled() throws Exception {
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.joinCourseButton);
	    	Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(coursepageObjects.joinCourseButton),"Join Button not Enabled for Ongoin Course.");
			   Logger.logAndReportPass("Join Button is Enabled for Ongoin Course.");
    		
    	}
	    public void clickCreateCourse() throws Exception {
    		SikshaLokamClient.get().gestures().click(coursepageObjects.createCourse);
    		Logger.logAndReportInfo("Clicked on the Course Button in Myworkspace Page");
    	}
	    //selectAllandDelete
	    public void enterCourseTitle(String courseName) throws Exception {
	    	 //SikshaLokamClient.get().gestures().click(coursepageObjects.coursetitle);
	    	// SikshaLokamClient.get().gestures().selectAllandDelete();
	    	SikshaLokamClient.get().gestures().clear(coursepageObjects.coursetitle);
	         SikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.coursetitle, courseName);
	         SikshaLokamClient.get().report().log(Status.INFO, "Entered course name is : " + courseName );
	    }
	    
	    public void fillMandatoryFields() throws Exception {
	    	//SikshaLokamClient.get().gestures().click(coursepageObjects.coursetitle);
	    	SikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.enterKeywords, "AutomationIsKeyToSuccess");
	    	Logger.logAndReportInfo("Entered AutomationIsKeyToSuccess ");
    		SikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeDropdown);
    		Logger.logAndReportInfo("Clicked on coursetype ");
    		//Thread.sleep(5000);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeTamilNadu);
    		Logger.logAndReportInfo("Selected TamilNadu Course Type ");
    		SikshaLokamClient.get().gestures().PressEsc();
	    }
}
