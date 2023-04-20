package com.shikshalokam.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;


import java.util.Map;

import com.shikshalokam.annotation.Author;
import com.shikshalokam.pages.actions.LoginPageAction;
import com.shikshalokam.pages.actions.ObservationPageAction;
import com.shikshalokam.pages.actions.ProgramDashboardAction;
import com.shikshalokam.pages.actions.ReportPageAction;
import com.shikshalokam.utils.gSheet.TestData;
import com.shikshalokam.utils.prop.PropUtlis;

public class ProgramDashboardTest {
	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    String appUrl;
   
    
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
        return new ProgramDashboardAction();
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
    
    @Test(description = "login as Program manager and verify types of reports")
    @Author(name = "SHREEJITH R")
    public void programDashboardPM() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
       // observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
      /*  appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }  */
        switchEnvironment();
        getLoginPageActions().BMCLSelection();  
        
       /* getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        Thread.sleep(2000);
        getLoginPageActions().clickOnSubmitButtonOnCourseWindow();
        Thread.sleep(2000);
       
        getLoginPageActions().clickOnSubmitButtonOnLocationWindow();  */
        Thread.sleep(3000);
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userNamePM"));
        getLoginPageActions().enterPassword(loginTestData.get("passwordPM"));
        //Thread.sleep(2000);
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(3000);
        getProgramDashboardActions().clickOnProfileIcon();
   
        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyProgramResourcePopup();
        getProgramDashboardActions().selectProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().selectProjectResource();
       // Thread.sleep(5000);
       /* getProgramDashboardActions().clickOnSelectProgramDropdown();
        getProgramDashboardActions().scrollandclickOnTesting4point4staging();
        getProgramDashboardActions().clickOnSelectResourceDropdown();
       // Thread.sleep(2000);
        getProgramDashboardActions().scrollandclickOnprojectlinkconsumptionfd98staging();   */
       
        getProgramDashboardActions().verifyandclickConfirmbuttEnabledonProgramResourcePopup();
        getProgramDashboardActions().verifyTabsOnProgramdashboardPage();
        getProgramDashboardActions().selectDistrictandOrgPD();
        //getProgramDashboardActions().selectdate();
        getProgramDashboardActions().verifyProjectReports();  
        getProgramDashboardActions().requestTaskreport();
        //Thread.sleep(2000);
      getProgramDashboardActions().requestStatusreport();
        
        getProgramDashboardActions().requestFilteredTaskDetailreport();
        
        getProgramDashboardActions(). selectObswithrubrics();
        getProgramDashboardActions().verifyobswithrubricReports();
        getProgramDashboardActions().requestQuestionreport();
       getProgramDashboardActions().requestStatusreport();
        getProgramDashboardActions().requestDomainCriteriareport();
        
        getProgramDashboardActions().selectObswithoutrubrics();
        getProgramDashboardActions().verifyobswitouthrubricReports();
        getProgramDashboardActions().requestQuestionreport();
      getProgramDashboardActions().requestStatusreport();
        getProgramDashboardActions().selectSurvey();
        getProgramDashboardActions().verifySurveyReports();
        getProgramDashboardActions().requestQuestionreport();
        getProgramDashboardActions().requestStatusreport();
      
    }
}