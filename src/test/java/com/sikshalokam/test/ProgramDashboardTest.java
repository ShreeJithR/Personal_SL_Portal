package com.sikshalokam.test;

import org.testng.annotations.Test;
import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageAction;
import com.sikshalokam.pages.actions.ProgramDashboardAction;
import com.sikshalokam.pages.actions.ReportPageAction;
import com.sikshalokam.utils.gSheet.TestData;
import com.sikshalokam.utils.prop.PropUtlis;

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
    
    @Test(description = "login and verify observation tile")
    @Author(name = "SHREEJITH R")
    public void PMD() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!D:E");
       // observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
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
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        //Thread.sleep(2000);
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(5000);
        getProgramDashboardActions().clickOnProfileIcon();
   
        getProgramDashboardActions().clickOnprogramdashboard();
        getProgramDashboardActions().verifyProgramResourcePopup();
        getProgramDashboardActions().selectProgram();
        Thread.sleep(2000);
        getProgramDashboardActions().selectResource();
        Thread.sleep(5000);
       /* getProgramDashboardActions().clickOnSelectProgramDropdown();
        getProgramDashboardActions().scrollandclickOnTesting4point4staging();
        getProgramDashboardActions().clickOnSelectResourceDropdown();
       // Thread.sleep(2000);
        getProgramDashboardActions().scrollandclickOnprojectlinkconsumptionfd98staging();   */
        getProgramDashboardActions().verifyandclickConfirmbuttEnabledonProgramResourcePopup();
        getProgramDashboardActions().verifyTabsOnProgramdashboardPage();
        getProgramDashboardActions().selectDistrictandOrgPD();
        getProgramDashboardActions().verifyProjectReports();  
}}
