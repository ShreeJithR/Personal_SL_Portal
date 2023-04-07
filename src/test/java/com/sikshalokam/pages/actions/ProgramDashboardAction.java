package com.sikshalokam.pages.actions;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

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
			 SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectprogramdropdownonpopup);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
	        SikshaLokamClient.get().report().log(Status.INFO, "Clicked on Select Program Dropdown");
	    }
		 
		 // if else condition
		 public void selectProgram() throws Exception {
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectprogramdropdownonpopup);
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
		 
		 public void selectProjectResource() throws Exception {
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdownonpopup);
			Thread.sleep(2000);
		        if(getEnvironmentValue().contains("diksha")) {
		            SikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
		        } else if(getEnvironmentValue().contains("preprod")) {
		        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd137);
		    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd137);
		    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Project Link Consumption -FD 137");
		        } else {
		        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.projectlinkconsumptionfd98);
					 SikshaLokamClient.get().gestures().click(programDashboardObjects.projectlinkconsumptionfd98);
				         SikshaLokamClient.get().report().log(Status.INFO, "Selected Project link consumption -FD 98");   
		        }
		        
		    }
		 
	
		 
		 public void clickOnSelectResourceDropdown() throws Exception {
			 //SikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(programDashboardObjects.selectresoursedropdown);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdownonpopup);
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
			 Thread.sleep(2000);
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
   	    	public void selectDistrictandOrgPD() throws Exception {
   	    		selectDistrictPD();
   	    		selectOrgPD();
   		 }
   	    	public void selectDistrictPD() throws Exception {
   	         SikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
		      //Thread.sleep(2000);
   	      if(getEnvironmentValue().contains("diksha")) {
	            SikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	SikshaLokamClient.get().gestures().click(programDashboardObjects.Ambedkarnagardistrict);
	              SikshaLokamClient.get().report().log(Status.INFO, "Selected Ambedkarnagar District");
	              Thread.sleep(3000);
	              SikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
	              SikshaLokamClient.get().gestures().click(programDashboardObjects.Agradistrict);
	              SikshaLokamClient.get().report().log(Status.INFO, "Reselected Agra District");
	        
	        } else {
			      SikshaLokamClient.get().gestures().click(programDashboardObjects.Anantapurdistrict);
	              SikshaLokamClient.get().report().log(Status.INFO, "Selected Ananthapur District");
	              Thread.sleep(3000);
	              SikshaLokamClient.get().gestures().click(programDashboardObjects.districtDropdown);
	              SikshaLokamClient.get().gestures().click(programDashboardObjects.Chittordistrict);
	              SikshaLokamClient.get().report().log(Status.INFO, "Reselected Chittor District");
	        }
	    }//Chittordistrict
   	    	
   	    	
   	    	public void selectOrgPD() throws Exception {
     	          SikshaLokamClient.get().gestures().click(programDashboardObjects.organisationsDropdown);
  		      Thread.sleep(2000);
  		    if(getEnvironmentValue().contains("diksha")) {
  		      SikshaLokamClient.get().report().log(Status.INFO, "No org");
     	     }else if(getEnvironmentValue().contains("preprod")) {
     	    	SikshaLokamClient.get().gestures().click(programDashboardObjects.preprodcustodianorg);
                SikshaLokamClient.get().report().log(Status.INFO, "Selected Pre-Prod Custodian Organization");
     	     } else {
                	SikshaLokamClient.get().gestures().click(programDashboardObjects.stagingcustodianorg);
                    SikshaLokamClient.get().report().log(Status.INFO, "Selected Staging Custodian Organization");
                }
  		    }
   	    	

   	    	public void selectdate() throws Exception {
   	    	
     	          SikshaLokamClient.get().gestures().click(programDashboardObjects.startdate);
     	         SikshaLokamClient.get().report().log(Status.INFO, "Clicked On Start Date picker");
     	        SikshaLokamClient.get().gestures().click(programDashboardObjects.Previousmonth);
     	       SikshaLokamClient.get().gestures().click(programDashboardObjects.date15);
     	      SikshaLokamClient.get().gestures().click(programDashboardObjects.enddate);
  	         SikshaLokamClient.get().report().log(Status.INFO, "Clicked On End Date picker");
  	        SikshaLokamClient.get().gestures().click(programDashboardObjects.Previousmonth);
  	       SikshaLokamClient.get().gestures().click(programDashboardObjects.date16); 

   	    	}
   	    	//dateinput 
		 
   	     public void verifyProjectReports() throws Exception {
   	    	 Thread.sleep(2000);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
			 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
			 Thread.sleep(2000);
			 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.taskReport),"Task Report type is not Present.");
	    	 Logger.logAndReportInfo("Task Report type  is Present .");
	         Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
		     Logger.logAndReportInfo("Status Report type is Present .");
		     Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.filteredtaskReport),"Filtered Task Report type is not Present.");
			 Logger.logAndReportInfo("Filtered Task Report type  is Present .");
			
	    }
   	     
   	  public void requestTaskreport() throws Exception {
   		 SikshaLokamClient.get().gestures().click(programDashboardObjects.taskReport);
   		 Logger.logAndReportPass("Selected Task Report .");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 SikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
   	  } 
   	  
  	public void requestStatusreport() throws Exception {	
  		 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
  		 
    		SikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
    	 Logger.logAndReportPass("Selected Status Report .");
    		Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
 		 Logger.logAndReportPass("Request Report button is Enabled.");
 		 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
     	 
  	
  	}
   	  // verify Project status filters
   	public void verifyProjectstatusfilters() throws Exception {	
		 
		 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportPass("Select Status Dropdown is Displayed");
		 softAssert.assertTrue(SikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
		 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
		 
		 //*****************@#$%^&@#$%^
		 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
    	 Logger.logAndReportInfo("Started Status is Present.");
    	 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.submittedStatus),"Submitted Status is not Present.");
	     Logger.logAndReportInfo("Submitted Status is Present.");
	     softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
		 Logger.logAndReportInfo("Inprogress Status is Present.");
		 //softAssert.assertAll();
		 Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().PressEsc(); 
     	  }
   	
   	
    public void requestFilteredTaskDetailreport() throws Exception {
    	Thread.sleep(2000);
    	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
    	 SikshaLokamClient.get().gestures().click(programDashboardObjects.filteredtaskReport);
    	 Logger.logAndReportPass("Selected Filtered Task Detail Report .");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		 
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintasksinProject),"Minimum no. of tasks in the project textfield is not Present.");
    	 Logger.logAndReportInfo("Minimum no. of tasks in the project textfield is Present.");
         Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.mintaskEvidence),"Minimum no. of task evidence textfield is not Present.");
	     Logger.logAndReportInfo("Minimum no. of task evidence textfield is Present.");
	     Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.minprojectEvidence),"Minimum no. of project evidence textfield is not Present.");
		 Logger.logAndReportInfo("Minimum no. of project evidence textfield is Present.");
		 
		
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 SikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    
    public void selectObswithrubrics() throws Exception {
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            SikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithrubricpreprod);
	    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.obswithrubricpreprod);
	    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected  Obs with rubric - FD 137 ')]");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithrubricstaging);
				 SikshaLokamClient.get().gestures().click(programDashboardObjects.obswithrubricstaging);
			         SikshaLokamClient.get().report().log(Status.INFO, "Selected Observation with Rubrics – FD 98')]");   
	        }
	        
	    }
    public void verifyobswithrubricReports() throws Exception {
	    	 Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
		 Thread.sleep(2000);
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Task Report type is not Present.");
   	 Logger.logAndReportInfo("Question Report type  is Present .");
        Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
	     Logger.logAndReportInfo("Status Report type is Present .");
	     Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.domaincriteriaReport),"Filtered Task Report type is not Present.");
		 Logger.logAndReportInfo("Domain Criteria Report type  is Present .");
		
   }
    //request status report and verify obs with rubric status filters
	public void requestobswithrubricStatusreport() throws Exception {	
	   	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 
	   		SikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	   	 Logger.logAndReportPass("Selected Status Report .");
	   		Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
			 Logger.logAndReportPass("Request Report button is Enabled.");
			 
			 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
			 Logger.logAndReportPass("Select Status Dropdown is Displayed");
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown);
			 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
			 
			 //*****************@#$%^&@#$%^
			 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
	    	 Logger.logAndReportInfo("Started Status is Present.");
	    	 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.completedStatus),"completed Status is not Present.");
		     Logger.logAndReportInfo("Completed Status is Present.");
		     softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.inprogressStatus),"Inprogress Status is not Present.");
			 Logger.logAndReportInfo("Inprogress Status is Present.");
			// softAssert.assertAll();
			 Thread.sleep(2000);
			 SikshaLokamClient.get().gestures().PressEsc(); 
			 
			 
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
			 Logger.logAndReportInfo("Clicked on Request Report.");
			 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
			 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
			 //***********
			Thread.sleep(2000);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
	     	 
	     	  } 
    
	//request status report and verify obs without rubric status filters
	public void requestobswithoutrubricStatusreport() throws Exception {	
	   	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
		 
	   		SikshaLokamClient.get().gestures().click(programDashboardObjects.statusReport);
	   	 Logger.logAndReportPass("Selected Status Report .");
	   		Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
			 Logger.logAndReportPass("Request Report button is Enabled.");
			 
			 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.selectstatusDropdown),"Select Status Dropdown is not Displayed");
			 Logger.logAndReportPass("Select Status Dropdown is Displayed");
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectstatusDropdown);
			 Logger.logAndReportInfo("Clicked on Select Status Dropdown.");
			 
			 //*****************@#$%^&@#$%^
			 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.startedStatus),"Started Status is not Present.");
	    	 Logger.logAndReportInfo("Started Status is Present.");
	    	 softAssert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.completedStatus),"completed Status is not Present.");
		     Logger.logAndReportInfo("Completed Status is Present.");
		   
			 //softAssert.assertAll();
			 Thread.sleep(2000);
			 SikshaLokamClient.get().gestures().PressEsc(); 
			 
			 
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
			 Logger.logAndReportInfo("Clicked on Request Report.");
			 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
			 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
			 //***********
			Thread.sleep(2000);
			 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
	     	 
	     	  } 
    
    
    public void requestQuestionreport() throws Exception {
  		 SikshaLokamClient.get().gestures().click(programDashboardObjects.questionReport);
  		 Logger.logAndReportPass("Selected Question Report .");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
		 Logger.logAndReportPass("Request Report button is Enabled.");
		
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportPasswordPopup),"Request Report Password Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Password Pop-up is Displayed");
		 SikshaLokamClient.get().gestures().sendValueToTextBox(programDashboardObjects.enterPassword,"Test1234");
		 Logger.logAndReportInfo("Entered password as : Test1234");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.yesbutton),"Yes button is not Enabled.");
		 Logger.logAndReportPass("Yes button is Enabled.");
		 //********
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
		 Thread.sleep(2000);
  	  } 
    
    public void requestDomainCriteriareport() throws Exception {	
      	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
   	 
      		SikshaLokamClient.get().gestures().click(programDashboardObjects.domaincriteriaReport);
      	 Logger.logAndReportPass("Selected Domain Criteria Report .");
      		Assert.assertTrue(SikshaLokamClient.get().gestures().isEnabled(programDashboardObjects.requestReport),"Request Report button is not Enabled.");
   		 Logger.logAndReportPass("Request Report button is Enabled.");
   		 
   		 SikshaLokamClient.get().gestures().click(programDashboardObjects.requestReport);
		 Logger.logAndReportInfo("Clicked on Request Report.");
		 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.requestReportYesNoPopup),"Request Report Yes No Pop-up is not Displayed");
		 Logger.logAndReportPass("Request Report Yes No Pop-up is Displayed");
		 //***********
		Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.nobutton);
    }
    
    public void selectObswithoutrubrics() throws Exception {
    	Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            SikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithoutrubricpreprod);
	    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.obswithoutrubricpreprod);
	    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Obs without rubric - FD 137");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.obswithoutrubricstaging);
				 SikshaLokamClient.get().gestures().click(programDashboardObjects.obswithoutrubricstaging);
			         SikshaLokamClient.get().report().log(Status.INFO, "Selected Observation without rubric targeted – FD 98 ");   
	        }
	        
	    }
    public void verifyobswitouthrubricReports() throws Exception {
   	 Thread.sleep(2000);
	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
	 Thread.sleep(2000);
	 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Task Report type is not Present.");
	 Logger.logAndReportInfo("Question Report type  is Present .");
   Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
    Logger.logAndReportInfo("Status Report type is Present .");
    }
    
    public void selectSurvey() throws Exception {
    	Thread.sleep(2000);
		 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectresoursedropdown);
		Thread.sleep(2000);
	        if(getEnvironmentValue().contains("diksha")) {
	            SikshaLokamClient.get().report().log(Status.INFO, "NO Resource");	
	        } else if(getEnvironmentValue().contains("preprod")) {
	        	 js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.surveypreprod);
	    		 SikshaLokamClient.get().gestures().click(programDashboardObjects.surveypreprod);
	    	        SikshaLokamClient.get().report().log(Status.INFO, "Selected Survey Test Expiry -29/12/2021 -- FD 196");
	        } else {
	        	js.executeScript("arguments[0].scrollIntoView(true);", programDashboardObjects.surveystaging);
				 SikshaLokamClient.get().gestures().click(programDashboardObjects.surveystaging);
			         SikshaLokamClient.get().report().log(Status.INFO, "Survey 4.4 Reg Test - FD 235");   
	        }
	        
	    }
    
    public void verifySurveyReports() throws Exception {
      	 Thread.sleep(2000);
   	 SikshaLokamClient.get().gestures().click(programDashboardObjects.selectReportDropdown);
   	 Logger.logAndReportInfo("Clicked on Select Report Dropdown");
   	 Thread.sleep(2000);
   	 Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.questionReport),"Task Report type is not Present.");
   	 Logger.logAndReportInfo("Question Report type  is Present .");
      Assert.assertTrue(SikshaLokamClient.get().gestures().isElementPresent(programDashboardObjects.statusReport),"Status Report type is not Present.");
       Logger.logAndReportInfo("Status Report type is Present .");
       }
   	
}