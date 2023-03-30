package com.sikshalokam.test;

import org.testng.annotations.Test;
import java.util.Map;

import org.testng.annotations.Test;

import com.sikshalokam.annotation.Author;
import com.sikshalokam.pages.actions.LoginPageAction;
import com.sikshalokam.pages.actions.ObservationPageAction;
import com.sikshalokam.pages.actions.ProgramDashboardAction;
import com.sikshalokam.pages.actions.ReportPageAction;
import com.sikshalokam.pages.objects.ObservationPageObjects;
import com.sikshalokam.utils.gSheet.TestData;
import com.sikshalokam.utils.prop.PropUtlis;

public class ObservationPageTest {

	Map<String, String> loginTestData;
    Map<String, String> observationPageTestData;
    String appUrl;
    public LoginPageAction getLoginPageActions() throws Exception {
        return new LoginPageAction();
    }
    
    public ObservationPageAction getObservationPageActions() throws Exception {
        return new ObservationPageAction();
    }
    public ProgramDashboardAction getProgramDashboardActions() throws Exception {
        return new ProgramDashboardAction();
    }
    
    public ReportPageAction getReportPageActions() throws Exception {
    	return new ReportPageAction();
    }
    
    @Test(description = "login and verify observation tile")
    @Author(name = "Manjunatha K")
    public void loginAndVerifyObservationTile() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(5000);
        getObservationPageActions().verifyObservationTitle();
        getLoginPageActions().enterNameToSearchbox(observationPageTestData.get("observatonForVerifyObservationTile"));
        Thread.sleep(5000);
        getLoginPageActions().clickOnSerachButton();
        getObservationPageActions().clickOnObservationButton();
        getLoginPageActions().clickOnSearchedObservationTitle();
        //getObservationPageActions().clickOnObservationWithRub_SliderWithScore();
        getObservationPageActions().clickOnEntityDeleteOption();
        getObservationPageActions().clickOnEntityDeleteConfirmationYes();
        getObservationPageActions().clickOnAddSchoolButton();
        getObservationPageActions().selectFirstEntityAsSchool();
        //getObservationPageActions().selectHanumanahallyEntityAsSchool();
        getObservationPageActions().clickOnSubmitButtonOnAddEntityWindow();
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().clickOnObserveAgainYesConfirmation();
        getObservationPageActions().verifyObservation1Title();
        getObservationPageActions().clickOnObservation1();
        getObservationPageActions().verifyStartButtonFromObservation();
        getObservationPageActions().clickOnThreeDotEllipseOnObservation();
        getObservationPageActions().clickOnDeleteOptionFromThreeDotObservation();
        getObservationPageActions().clickOnYesConfirmationForObservationDelete();
       /* getObservationPageActions().clickOnBackButtonOnObservationPage();
        getObservationPageActions().clickOnObservationWithRub_SliderWithScore();
        getObservationPageActions().verifyThrashSymbolForEntityDelete(); */
        
    }
    
    @Test(description = "save and submit observation")
    @Author(name = "Manjunatha K")
    public void saveAndSubmitObservation() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!A:B");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(5000);
        getObservationPageActions().verifyObservationTitle();
        getObservationPageActions().clickOnObservationParentChild();
        getObservationPageActions().clickOnObserveAgainButton();
        getObservationPageActions().verifyObserveAgainPopupTitle();
        getObservationPageActions().clickOnObserveAgainYesConfirmation();
       // getObservationPageActions().clickOnObservation1();
        getObservationPageActions().clickOnStartButtonOnObservation();
        getObservationPageActions().verifyParent1QuestionTitle();
        getObservationPageActions().clickOnParent1QuestionFirstAnswer();
        getObservationPageActions().verifyParent1Child1QuestionTitle();
        getObservationPageActions().clickOnParent1Child1QuestionFirstAnswer();
        getObservationPageActions().verifyParent2QuestionTitle();
        getObservationPageActions().clickOnParent2QuestionSecondAnswer();
        getObservationPageActions().verifyParent2Child2QuestionTitle();
        getObservationPageActions().clickOnParent2Child2QuestionSecondAnswer();
        getObservationPageActions().verifyparent3QuestionTitle();
        getObservationPageActions().clickOnParent3QuestionFirstAnswer();
        getObservationPageActions().verifyParent3Child1QuestionTitle();
        getObservationPageActions().clickOnParent3Child1FirstAnswer();
        
        getObservationPageActions().clickOnSaveObservationForm();
        getObservationPageActions().clickOnSaveFormConirmationYes();
        getObservationPageActions().verifyFormSaveSuccessMsg(observationPageTestData.get("observationFormSaveSuccessMsg"));
        getObservationPageActions().clickOnContinueButtonOnSaveObservationForm();
        getObservationPageActions().clickOnSubmitButtonOnObservationSaveForm();
        getObservationPageActions().clickOnYesForSubmitFormConfirmation();
        getObservationPageActions().verifyFormSubmitSuccessMsg(observationPageTestData.get("observationFormSubmitSuccessMsg"));
        
        //for report tab
        //getObservationPageActions().clickOnOkButtonOnSubmitFormSuccess();
        //getLoginPageActions().clickOnProfileIcon();
        //getReportPageActions().clickOnMyReportsTab();
    }
    @Test(description = "To verify school enitity is not added by deafault")
    @Author(name = "SHREEJITH R")
    public void SchoolEntityNotAddedBydefault() throws Exception {
        loginTestData = TestData.getFullGoogleSheetDataAsMapString("LoginTestData!F:G");
        observationPageTestData = TestData.getFullGoogleSheetDataAsMapString("Observation!A:B");
        //getLoginPageActions().clickOnExploreDiksha();
        appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
        if(appUrl.contentEquals("https://preprod.ntp.net.in/"))
        {
        	getLoginPageActions().clickOnExploreDiksha();
        }
        getLoginPageActions().selectRoleHTAndOffical();
        getLoginPageActions().clickOnContinue();
        getLoginPageActions().clickOnBoardDropDown();
        getLoginPageActions().selectcbseOrNcertBoardOption();
        getLoginPageActions().verifySubmitButtonEnabled();
        Thread.sleep(2000);
        getLoginPageActions().clickOnSubmitButtonOnLocationWindow();
        //getLoginPageActions().BMCLSelection();
        getLoginPageActions().clickOnGuest();
        getLoginPageActions().clickOnLogin();
        getLoginPageActions().enterUserName(loginTestData.get("userName"));
        getLoginPageActions().enterPassword(loginTestData.get("password"));
        getLoginPageActions().clickOnLoginButton();
        Thread.sleep(2000);
        getProgramDashboardActions().clickOnProfileIcon();
        getLoginPageActions().selectProfile();
        getLoginPageActions().clickOnEdit();
        Thread.sleep(2000);
        getLoginPageActions().clickOnClear();
        Thread.sleep(2000);
        getLoginPageActions().selectState();
        getLoginPageActions().selectDistrict();
       // getLoginPageActions().clickOnSelectSubrole();
        //getLoginPageActions().selectDeo();
        //Thread.sleep(2000);
        getLoginPageActions().verifySubmitButtonEnabledonPersonaldetailspage();
        Thread.sleep(5000);
        getLoginPageActions().clickOnBackbutton();
        
        getObservationPageActions().verifyObservationButton();
        getObservationPageActions().clickOnObservationButton();
        Thread.sleep(2000);
        getObservationPageActions().clickOnSchoolEntityobsevation();  
       
        getObservationPageActions().verifySchoolentityisnotadded();
}}
