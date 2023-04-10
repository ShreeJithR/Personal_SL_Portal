package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.sikshalokam.client.SikshaLokamClient;
import com.sikshalokam.pages.objects.AdminDashboardObjects;
import com.sikshalokam.utils.logger.Logger;
import com.sikshalokam.utils.prop.PropUtlis;

public class AdminDashboardAction {
	
	AdminDashboardObjects adminDashboardObjects;
	
	 public AdminDashboardAction() throws Exception {
		 adminDashboardObjects = PageFactory.initElements(SikshaLokamClient.get().driver(), AdminDashboardObjects.class);
	    }
	      SoftAssert softAssert = new SoftAssert();

	    JavascriptExecutor js = (JavascriptExecutor) SikshaLokamClient.get().driver();
	    
	    String appUrl;
	    public String getEnvironmentValue() throws Exception {
	    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
	    }
	    
	    // switch to webview for inspect elements
	    public void switchToWebView() throws Exception {
	        Thread.sleep(5000);

	    }

	    public void clickOnadmindashboard() throws Exception {
			SikshaLokamClient.get().gestures().click(adminDashboardObjects.admindashboard);
     SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Admin Dashboard"); 
	    }
	    
	 
	   /* public void verifyTabs() throws Exception {
	    	Thread.sleep(5000);
	    	verifyReportstab();
	    	verifyDatasetstab();
	    }
*/	    
	    
	    public void verifyReportsandDatasetsTab() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.reportsTab),"Reports tab is not displayed.");
			Logger.logAndReportPass("Reports tab is displayed.");
			Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.datasetsTab),"Datasets tab is not displayed.");
			Logger.logAndReportPass("Datasets tab is displayed.");
		
		}
	    
	   /* public void verifyDatasetstab() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isDisplayed(adminDashboardObjects.datasetsTab),"Datasets tab is not displayed.");
			Logger.logAndReportPass("Datasets tab is displayed.");
		} */

		
	    public void verifyGlobalSearchfilter() throws Exception {
	       Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.globalSearchFilter),"Global Search Filter is not displayed.");
			Logger.logAndReportPass("Global Search Filter is displayed.");
			
		}
	    

	/*    public void searchAndSelectProjectReports() throws Exception {
	        SikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"test improve report");
	    	//adminDashboardObjects.globalSearchFilter.sendKeys("Improvement Project Report test");
	        Logger.logAndReportInfo("Searched for test improve report ");
	        Thread.sleep(2000);
	        SikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReport);
	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
	    }   */
	        
	        public void searchAndSelectProjectReports() throws Exception {
	   	         
	   	      if(getEnvironmentValue().contains("diksha")) {
		            SikshaLokamClient.get().report().log(Status.INFO, "NO ");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 SikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"New Improvement Projects Report Beta");
		 	    	
		 	        Logger.logAndReportInfo("Searched for New Improvement Projects Report Beta ");
		 	        Thread.sleep(2000);
		 	        SikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReportPreprod);
		 	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
		        } else {
		        	 SikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.globalSearchFilter,"test improve report");
		 	    	
		 	        Logger.logAndReportInfo("Searched for test improve report ");
		 	        Thread.sleep(2000);
		 	        SikshaLokamClient.get().gestures().click(adminDashboardObjects.impProjectReportStaging);
		 	        Logger.logAndReportInfo("Clicked on Improvement Project Report"); 
		        }
	    }
	    
	    public void verifySelectedReportInTableFormat() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.serialNoColumn),"Serial.No Column is not displayed.");
			Logger.logAndReportInfo("Serial.No Column is displayed.");
			Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.parameterColumn),"Parameter Column is not displayed.");
			Logger.logAndReportInfo("ParameterColumn is displayed.");
			Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.StatusColumn),"Status Column is not displayed.");
			Logger.logAndReportInfo("Status Column is displayed.");
			
		}
	    public void verifyLocalSearchfilter() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.localSearchFilter),"Local Search Filter is not displayed.");
			Logger.logAndReportPass("Local Search Filter is displayed.");
			
		}
	    
	    
	    public void searchAndSelectParameter() throws Exception {
	    	SikshaLokamClient.get().gestures().sendValueToTextBox(adminDashboardObjects.localSearchFilter,"up");
	        Logger.logAndReportInfo("Searched for up");
	        Thread.sleep(2000);
	        SikshaLokamClient.get().gestures().click(adminDashboardObjects.upPararmeter);
	        Logger.logAndReportInfo("Clicked on up Parameter");     
	    }
	    
	    public void verifyGraphsTab() throws Exception {
	        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(adminDashboardObjects.graphsTab),"Graphs tab is not displayed.");
			Logger.logAndReportPass("Graphs tab is is displayed.");
		
		}

	    

}
