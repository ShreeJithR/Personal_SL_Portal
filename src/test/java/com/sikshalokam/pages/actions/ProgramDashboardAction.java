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
		 
		 // if else condition
		 public void selectProgram() throws Exception {
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdown);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		           
		            SikshaLokamClient.get().report().log(Status.INFO, "NO Program");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTestingProgram4point4);
		    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.programTestingProgram4point4);
		    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Testing Program 4.4 Program");
		        } else {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
		    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Testing 4.4 Program");
		        }
		        
		    }
		 
	
		 
		 public void clickOnSelectResourceDropdown() throws Exception {
			 //SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectresoursedropdown);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
			 Thread.sleep(2000);
	        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Resource Dropdown");
         }
		 
		 public void scrollandclickOnTesting4point4staging() throws Exception {
		 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.programTesting4point4);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.programTesting4point4);
	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Testing 4.4 Program");
		
		 }
		 
		 public void scrollandclickOnprojectlinkconsumptionfd98staging() throws Exception {
			 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd98);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd98);
		         SikshaLokamClient.get().report().log(Status.INFO, "Selected Project link consumption -FD 98");
             }
		 
		 public void verifyandclickConfirmbuttEnabledonProgramResourcePopup() throws Exception {
			 SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.confirmbuttonOnprogramresourcePopup);
			   Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.confirmbuttonOnprogramresourcePopup),"Confirm Button got Enabled on Program Resource Pop-up.");
			   Logger.logAndReportPass("Confirm Button got Enabled on Program Resource Pop-up.");
		    	SikshaLokamClient.get().gestures().click(programDashboardObjects.confirmbuttonOnprogramresourcePopup);
              }
		 
	
		 //to verify tabs on Progamdashboard page
		 public void verifyTabsOnProgramdashboardPage() throws Exception {
			 VerifyProgradDataset();
			 VerifyGraphs();
			 VerifyTables();
		 
		 }

	    	public void VerifyProgradDataset() throws Exception {
	            Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.Programdatasets),"Program Datasets tab is not Present.");
	    		Logger.logAndReportInfo("Program Datasets tab is Present .");
	    	}

   	    	public void VerifyGraphs() throws Exception {
   	            Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.Graphs),"Graphs tab is not Present.");
   	    		Logger.logAndReportInfo("Graphs tab is Present .");
   	    	}

   	    	public void VerifyTables() throws Exception {
   	            Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.Tables),"Tables tab is not Present.");
   	    		Logger.logAndReportInfo("Tables tab is Present .");
   	    	}
   	    	
   	    	//selecting district and organisation in staging
   	    	public void selectDistrictandOrgstaging() throws Exception {
   	    		selectDistrictStaging();
   	    		selectOrgStaging();
   		 }
   	    	public void selectDistrictStaging() throws Exception {
   	          SikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
		      //Thread.sleep(2000);
		      SikshaLokamClient.get().gestures().click(programDashboardObjects.Anantapurdistrict);
              SikshaLokamClient.get().report().log(Status.INFO, "Selected Ananthapur District");
              Thread.sleep(3000);
              SikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
              SikshaLokamClient.get().gestures().click(programDashboardObjects.Chittordistrict);
              SikshaLokamClient.get().report().log(Status.INFO, "Reselected Chittor District");
   	     }//Chittordistrict
   	    	
   	    	
   	    	public void selectOrgStaging() throws Exception {
     	          SikshaLokamClient.get().gestures().click(programDashboardObjects.organisationsDropdown);
  		      Thread.sleep(2000);
  		      SikshaLokamClient.get().gestures().click(programDashboardObjects.stagingcustodianorg);
                SikshaLokamClient.get().report().log(Status.INFO, "Selected Staging Custodian Organization");
     	     }
		 
   	     public void verifyProjectReports() throws Exception {
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
			 Thread.sleep(2000);
			  Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.taskReport),"Task Report type is not Present.");
	    		Logger.logAndReportInfo("Task Report type  is Present .");
	    		  Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
		    		Logger.logAndReportInfo("Status Report type is Present .");
		    		  Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.filteredtaskReport),"Filtered Task Report type is not Present.");
			    		Logger.logAndReportInfo("Filtered Task Report type  is Present .");
			 
	    }
		 
		 
		 
}