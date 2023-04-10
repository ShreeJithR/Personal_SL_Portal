package com.sikshalokam.test;

import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.AdminDashboardAction;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageAction;
import com.sikshalokam.pages.actions.ProgramDashboardAction;
import com.sikshalokam.pages.actions.ReportPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import com.sikshalokam.utils.prop.PropUtlis;

public class AdminDashboardTest {
		Map<String, String> loginTestData;
	    Map<String, String> observationPageTestData;
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
	    
	    public ObservationPageAction getObservationPageActions() throws Exception {
	        return new ObservationPageAction();
	    }
	    
	    public ReportPageAction getReportPageActions() throws Exception {
	    	return new ReportPageAction();
	    }
	    
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    public void switchEnvironment() throws Exception {
	    	if(getEnvironmentValue().contains("preprod") || getEnvironmentValue().contains("prod")) {
	        	getLoginPageActions().clickOnExploreDiksha();
	        }}

	    	
	    	  @Test(description = "login as Admin ")
	    	    @Author(name = "SHREEJITH R")
	    	    public void adminDashboard() throws Exception {
	    	        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!H:I");
	    	       // observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
	    	        //getLoginPageActions().clickOnExploreDiksha();
	    	     /*   appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    	        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
	    	        {
	    	        	getLoginPageActions().clickOnExploreDiksha();
	    	        }  */
	    	        
	    	        switchEnvironment();
	    	        getLoginPageActions().BMCLSelection();
	    	        Thread.sleep(3000);
	    	        getLoginPageActions().clickOnGuest();
	    	        getLoginPageActions().clickOnLogin();
	    	        getLoginPageActions().enterUserName(loginTestData.get("userName"));
	    	        getLoginPageActions().enterPassword(loginTestData.get("password"));
	    	        //Thread.sleep(2000);
	    	        getLoginPageActions().clickOnLoginButton();
	    	        Thread.sleep(3000);
	    	        getProgramDashboardActions().clickOnProfileIcon();
	    	   
	    	        getAdminDashboardActions().clickOnadmindashboard();
	    	        getAdminDashboardActions().verifyReportsandDatasetsTab();
	    	        getAdminDashboardActions().searchAndSelectProjectReports();
	    	        getAdminDashboardActions().verifySelectedReportInTableFormat();
	    	        getAdminDashboardActions().searchAndSelectParameter();
	    	        getAdminDashboardActions().verifyGraphsTab();
	    	  }}
