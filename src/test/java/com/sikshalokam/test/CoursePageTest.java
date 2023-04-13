package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.AdminDashboardAction;
import com.sikshalokam.pages.actions.CoursePageAction;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageAction;
import com.sikshalokam.pages.actions.ProgramDashboardAction;
import com.sikshalokam.pages.actions.ReportPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import com.sikshalokam.utils.prop.PropUtlis;

public class CoursePageTest {
	Map<String, String> loginTestData;
	Map<String, String> courseTestData;
	String appUrl;
	
	 public LoginPageAction getLoginPageActions() throws Exception {
	        return new LoginPageAction();
	    }
	    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
	        return new ProgramDashboardAction();
	    }
	    
	    public AdminDashboardAction getAdminDashboardActions() throws Exception {
	        return new AdminDashboardAction();
	    }
	    
	    public CoursePageAction getCoursePageActions() throws Exception {
	        return new CoursePageAction();
	    }
	    
	    
	    
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    public void switchEnvironment() throws Exception {
	    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
	        	getLoginPageActions().clickOnExploreDiksha();
	        }}
	
	    

  	  @Test(description = "Join Course")
  	    @Author(name = "SHREEJITH R")
  	    public void joinCourse() throws Exception {
  	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!J:K");
  	    
  	        
  	        switchEnvironment();
  	        getLoginPageActions().BMCLSelection();
  	        Thread.sleep(2000);
  	        getLoginPageActions().clickOnGuest();
  	        getLoginPageActions().clickOnLogin();
  	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
  	        getLoginPageActions().enterPassword(loginTestData.get("password"));
  	        //Thread.sleep(2000);
  	        getLoginPageActions().clickOnLoginButton();
  	        Thread.sleep(3000);
  	      getCoursePageActions().verifyCourseButton();
  	      getCoursePageActions().clickOnCoursesButton();
  	   // getProgramDashboardActions().clickOnProfileIcon();
  	 // getCoursePageActions().clickOnWorkspace();
  	    getCoursePageActions().searchForOngoinCourse();
  	  getCoursePageActions().verifyJoinCourseButtonisEnabled();
}
  	 
  	@Test(description = "Create and Publish Course")
	    @Author(name = "SHREEJITH R")
	    public void createCourseandPublish() throws Exception {
	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!J:K");
	        courseTestData = TestData.getFullGoogleSheetDataAsMapString("CourseTestData!A:B");
	    
	        
	        switchEnvironment();
	        getLoginPageActions().BMCLSelection();
	        Thread.sleep(2000);
	        getLoginPageActions().clickOnGuest();
	        getLoginPageActions().clickOnLogin();
	        getLoginPageActions().enterUserName(loginTestData.get("contentCreatorUser"));
	        getLoginPageActions().enterPassword(loginTestData.get("contentCreatorPwd"));
	        //Thread.sleep(2000);
	        getLoginPageActions().clickOnLoginButton();
	        getProgramDashboardActions().clickOnProfileIcon();
	     	getCoursePageActions().clickOnWorkspace();
	     	getCoursePageActions().clickCreateCourse();
	     	Thread.sleep(5000);
	     	getCoursePageActions().enterCourseTitle(courseTestData.get("courseTitle"));
	     	//Thread.sleep(20000);
	     	getCoursePageActions().fillMandatoryFields();
	     	Thread.sleep(20000);



  	}








}
