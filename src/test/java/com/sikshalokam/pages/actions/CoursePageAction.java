package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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
    	
}
