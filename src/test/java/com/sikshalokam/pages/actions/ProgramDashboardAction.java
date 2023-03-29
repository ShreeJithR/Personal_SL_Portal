package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.LoginPageObjects;
import com.sikshalokam.pages.objects.ProgramDashboardObjects;
import com.sikshalokam.utils.logger.Logger;
import com.sikshalokam.utils.prop.PropUtlis;

public class ProgramDashboardAction {
	
	ProgramDashboardObjects programDashboardObjects;
	
	 public ProgramDashboardAction() throws Exception {
		 programDashboardObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), ProgramDashboardObjects.class);
	    }

	    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    // switch to webview for inspect elements
	    public void switchToWebView() throws Exception {
	        Thread.sleep(5000);

	    }

	
	 public void clickOnProfileIcon() throws Exception {
				SikshaLokamClient.get().gestures().click(programDashboardObjects.guestIcon);
	        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on User Icon");
	    }
	 
	 public void clickOnprogramdashboard() throws Exception {
			SikshaLokamClient.get().gestures().click(programDashboardObjects.programdashboard);
     SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Program Dashboard");
	 }
	 

		public void verifyProgramResourcePopup() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.programresourcePopup),"Select Program and Resource Pop-up is not displayed.");
			Logger.logAndReportPass("Select Program and Resource Pop-up is displayed. succesfully");
		}
		
		 public void clickOnSelectProgramDropdown() throws Exception {
			 SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectprogramdropdown);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdown);
	        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Dropdown");
	    }
		 
		 public void scrollandclickOnTesting4point4() throws Exception {
		 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Testing 4.4 Program");
		
		 }
		 
		 public void clickOnSelectResourceDropdown() throws Exception {
			 //SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectresoursedropdown);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
	        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Resource Dropdown");
}
}
