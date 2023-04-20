package com.shikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.pages.objects.ReportPageObjects;
import com.shikshalokam.utils.logger.Logger;

public class ReportPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();
    ReportPageObjects reportPageObjects = new ReportPageObjects();
    
    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
    
    public ReportPageAction() throws Exception {
    	reportPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ReportPageObjects.class);
    }
        //******************Actions*********************************************************//
    
    	public void clickOnMyReportsTab() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.myReportsFromProfile);
    		Logger.logAndReportInfo("Clicked on the my reports tab .");
    	}
    
    	public void clickOn1stReport() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.myReportPage1stReport);
    		Logger.logAndReportInfo("Clicked on the 1st report from my report section.");
    	}
    	
    	public void clickOnExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.exportAsButtonInReport);
    		Logger.logAndReportInfo("Clicked on the export as button in report.");
    	}
    
    	public void moveonExportAsButton() throws Exception {
    		ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.exportAsButtonInReport);
    		Thread.sleep(5000);
    		Logger.logAndReportInfo("Moved on to the export as button.");
    	}
    	public void clickOnPDFButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(reportPageObjects.pdfButton);
    		Logger.logAndReportInfo("Clicked on the pdf button.");
    	}
    
    	//******************Verify*********************************************************//
    	
    	public void verifyMyReportsTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.myReportsTitle),"My reports title is not displayed.");
    		Logger.logAndReportPass("My reports title is displayed succesfully. ");
    	}
    
    	public void verifyEntityFilterOption() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.entityFilterForReport),"Entity Filter for report is not displayed.");
    		Logger.logAndReportPass("Entity Filter for report is displayed succesfully.");
    	}
    	
    	public void verifyQuestionTabInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.questionTabFromReport),"Question Tab inside the report is not displayed.");
    		Logger.logAndReportPass("Question Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyCriteriaTabInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.critiriaTabFromReport),"Criteria Tab inside the report is not displayed.");
    		js.executeScript("arguments[0].scrollIntoView(true);", reportPageObjects.critiriaTabFromReport);
    		Logger.logAndReportPass("Criteria Tab inside the report is displayed succesfully.");
    	}
    	
    	public void verifyExportAsButtonInReport() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.exportAsButtonInReport),"Export button is not displayed.");
    		Logger.logAndReportPass("Export button is displayed succesfully.");
    	}
    	
    	public void verifyPdfButtonInReport() throws Exception {
    		//ShikshaLokamClient.get().gestures().moveToElement(reportPageObjects.pdfButton);
    		//Assert.assertTrue(ShikshaLokamClient.get().gestures().isDisplayed(reportPageObjects.pdfButton));
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButton),"PDF Button is not displayed.");
    		Logger.logAndReportPass("PDF Button is displayed succesfully.");
    	}
    	
    	public void verifyPdfButtonInReportBoolean() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(reportPageObjects.pdfButton));
    		Logger.logAndReportPass("Pdf button is displayed.");
    	}
}
