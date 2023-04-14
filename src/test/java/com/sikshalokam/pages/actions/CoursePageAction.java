package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
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
	    	//Logger.logAndReportInfo("Entered : AutomationIsKeyToSuccess ");
    		//Thread.sleep(2000);	
	    	SikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeDropdown);
    		Logger.logAndReportInfo("Clicked on coursetype ");
    		SikshaLokamClient.get().gestures().click(coursepageObjects.courseTypeTamilNadu);
    		//Logger.logAndReportInfo("Selected TamilNadu Course Type ");
    		SikshaLokamClient.get().gestures().PressEsc();
    		//Thread.sleep(2000);	
    		SikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectDropdown);
    		Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectAccountancy);
    		//Logger.logAndReportInfo("Selected Accountancy Subject " );
    		SikshaLokamClient.get().gestures().PressEsc();
    		
    		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectSyllabusDropdown);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.selectSyllabusDropdown);
    		Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectSyllabusTamilNadu);
    		SikshaLokamClient.get().gestures().PressEsc();
    		
    		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectMediumDropdown);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.selectMediumDropdown);
    		Logger.logAndReportInfo("Clicked on SelectSubject ");
    		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectMediumEnglish);
    		//SikshaLokamClient.get().gestures().PressEsc();
    		
     		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectClassDropdown);
    		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectClassDropdown);
     		Logger.logAndReportInfo("Clicked on SelectSubject ");
     		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectClass1);
    		
      		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectSubject1Dropdown);
     		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectSubject1Dropdown);
      		Logger.logAndReportInfo("Clicked on SelectSubject ");
      		 SikshaLokamClient.get().gestures().click(coursepageObjects.selectSubjectEnglish1);
      		 
       		js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.copyrightYear);
      		 SikshaLokamClient.get().gestures().sendValueToTextBox(coursepageObjects.copyrightYear, "2022");
	         SikshaLokamClient.get().report().log(Status.INFO, "Entered 2022 " );
    		
	    }
	    
	    public void clickAddChild() throws Exception {
    		SikshaLokamClient.get().gestures().click(coursepageObjects.addChild);
    		Logger.logAndReportInfo("Clicked on Add Child Button ");
    	}
	    
	    public void clickaddfromLibrary() throws Exception {
    		SikshaLokamClient.get().gestures().click(coursepageObjects.addfromLibrary);
    		Logger.logAndReportInfo("Clicked on Add from Library ");
    		Thread.sleep(2000);
    	}
	    
	    public void selectContentfromLibrary() throws Exception {
	    	js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.selectContent1);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.selectContent1);
    		Logger.logAndReportInfo("Selected content from Library ");
    		SikshaLokamClient.get().gestures().click(coursepageObjects.selectContentButton);
    		Logger.logAndReportInfo("Clicked on Select Content Button ");
    		Thread.sleep(2000);

    	}
	    
	    public void verifyWhereDoYouWantToAddThisContentPopup() throws Exception {
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.contentPopup);
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.contentPopup),"Where Do You Want To Add This Content Popup Pop-up is not displayed.");
			Logger.logAndReportPass("Where Do You Want To Add This Content Popup Pop-up  is displayed.");
			SikshaLokamClient.get().gestures().click(coursepageObjects.addContentButtonOnPopup);
    		Logger.logAndReportInfo("Clicked on Add Content On Popup ");
    		Thread.sleep(2000);

		}
	    
	    public void clickOnBackButton() throws Exception {
	    	js.executeScript("arguments[0].scrollIntoView(true);", coursepageObjects.backButton);
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.backButton);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.backButton);
    		Logger.logAndReportInfo("Clicked on Back Button ");
    	}
	    
	    public void verifyandClickOnSendForReviewButton() throws Exception {
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.sendforReview);
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.sendforReview),"Send For Review Button  is not displayed.");
			Logger.logAndReportPass("Send For Review Button is displayed.");
			SikshaLokamClient.get().gestures().click(coursepageObjects.sendforReview);
			Logger.logAndReportPass("Clicked On Send For Review Button.");
	    }
	    
	    public void verifyTandCPopupandClickOnAgreeandSubmit() throws Exception {
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.tAndcPopup);
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(coursepageObjects.tAndcPopup),"Terms and Condition Pop-up is not displayed.");
			Logger.logAndReportPass("Terms and Condition Pop-up  is displayed.");
			SikshaLokamClient.get().gestures().click(coursepageObjects.agreeTandC);
    		Logger.logAndReportInfo("Clicked on Agree TandC ");
    		
    		SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.submitButtonOnTandCPopup);
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(coursepageObjects.submitButtonOnTandCPopup),"Submit Button On Terms and Condition Pop up is not Enabled");
			Logger.logAndReportPass("Submit Button On Terms and Condition Pop up is Enabled");
    		Thread.sleep(2000);
    		SikshaLokamClient.get().gestures().click(coursepageObjects.submitButtonOnTandCPopup);
    		Logger.logAndReportInfo("Clicked on Submit Button on TandC Popup ");
    		Thread.sleep(2000);

		}
	    public void clickOnProfileiconAndLogout() throws Exception {
	    	SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(coursepageObjects.profileicon); 
	    	SikshaLokamClient.get().gestures().click(coursepageObjects.profileicon);
	    	Logger.logAndReportInfo("Clicked on Profile Icon ");
	    	Thread.sleep(2000);
	    	SikshaLokamClient.get().gestures().click(coursepageObjects.logout);
	    	Logger.logAndReportInfo("Clicked on Logout");
	    	Thread.sleep(2000);
	    	
	    	
    	}
}
