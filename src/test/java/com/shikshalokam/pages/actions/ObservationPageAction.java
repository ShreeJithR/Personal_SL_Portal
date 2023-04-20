package com.shikshalokam.pages.actions;

import static org.testng.Assert.assertFalse;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import com.aventstack.extentreports.Status;
import com.shikshalokam.client.ShikshaLokamClient;
import com.shikshalokam.pages.objects.LoginPageObjects;
import com.shikshalokam.pages.objects.ObservationPageObjects;
import com.shikshalokam.utils.logger.Logger;
import com.shikshalokam.utils.prop.PropUtlis;

public class ObservationPageAction {

	LoginPageObjects loginPageObjects = new LoginPageObjects();
    ObservationPageObjects observationPageObjects = new ObservationPageObjects();

    JavascriptExecutor js = (JavascriptExecutor) ShikshaLokamClient.get().driver();
//    js.executeScript("window.scrollBy(0,250)", "");
    
    SoftAssert softAssert = new SoftAssert();
    
    String appUrl;
    public String getEnvironmentValue() throws Exception {
    	return appUrl = PropUtlis.readConfig("webAppConfig", "appUrl");
    }
    
    public ObservationPageAction() throws Exception {
    	observationPageObjects = PageFactory.initElements(ShikshaLokamClient.get().driver(), ObservationPageObjects.class);
    }
        //******************Actions*********************************************************//
    		
    	public void clickOnObservationButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationButton);
    		Thread.sleep(1000);
    		Logger.logAndReportInfo("Clicked on the observation button");
    	}
    	
    	public void clickOnUpdateButtonOnProfileUpdatePopup() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the update button on profile update popup");
    	}
    	
    	
    	public void clickOnUdateButtonOnPersonalDetailsWindow() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.profileUpdatePopupButton);
    		Logger.logAndReportInfo("Clicked on the submit button on personal details window.");
    	}
    	
    	public void clickOnObservationWithRub_SliderWithScore() throws Exception {
    		//js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observationWithRubic);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationWithRubic);
    		Logger.logAndReportInfo("Clicked on the observation with rub only slider with score.");
    	}
    	
    	public void clickOnEntityDeleteOption() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteButtonForEntity);
    		Logger.logAndReportInfo("Clicked on the entity delete option");
    	}
    	
    	public void clickOnEntityDeleteConfirmationYes() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForEntityDelete);
    		Logger.logAndReportInfo("Clicked on the yes confirmation for entity deletion.");
    	}
    	
    	public void clickOnAddSchoolButton() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.addSchoolForEntity);
    		Logger.logAndReportInfo("Clicked on the Add School Button ");
    		Thread.sleep(2000);
    	}
    	
    	public void selectFirstEntityAsSchool() throws Exception {
        	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.firstEntity);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.firstEntity);
    		Logger.logAndReportInfo("Selected first entity for the school.");
    	}
    	
    	public void selectHanumanahallyEntityAsSchool() throws Exception {
        	ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.hanumanahalliEntity);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.hanumanahalliEntity);
    		Logger.logAndReportInfo("Selected hanumanahally entity for the school.");
    	}
    	
    	public void clickOnSubmitButtonOnAddEntityWindow() throws Exception {
        	ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonOnAddEntityWindow);
    		Logger.logAndReportInfo("Clicked on the submit button on add entity window.");
    		Thread.sleep(1000);
    	}
    	
    	public void selectAddedEntity() throws Exception {
        	ShikshaLokamClient.get().gestures().click(observationPageObjects.addedEntity);
    		Logger.logAndReportInfo("Clicked on Added Entity.");
    		Thread.sleep(1000);
    	}
    	
    	public void clickOnObserveAgainButton() throws Exception {
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.observeAgainButton);;
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observeAgainButton);
    		Logger.logAndReportInfo("Clicked on the observe again button.");
    	}
    	
    	public void clickOnObservation1() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observation1Title);
    		Logger.logAndReportInfo("Clicked on the observation 1 Title.");
    	}
    	public void clickOnObserveAgainYesConfirmation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationObserveAgain);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observeAgainButton);
    		Logger.logAndReportInfo("Clicked on the yes button for obsere again button.");
    	}
    	
    	public void clickOnThreeDotEllipseOnObservation() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.observeAgainButton);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.threeDotOnObservation);
    		Logger.logAndReportInfo("Clicked on the three dot on observation. ");
    		Thread.sleep(2000);
    	}
    	
    	public void clickOnDeleteOptionFromThreeDotObservation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.deleteOptionForObservation);
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.deleteOptionForObservation);
    		//js.executeScript("arguments[0].click();", observationPageObjects.deleteOptionForObservation);
    		Logger.logAndReportInfo("Clicked on the delete option from observation three dot ellipse.");
    		Thread.sleep(2000);
    	}
    	
    	public void clickOnYesConfirmationForObservationDelete() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForObservationDelete);
    		Logger.logAndReportInfo("Clicked on the yes confirmation for deleting observation.");
    		Thread.sleep(3000);
    	}
    	public void clickOnBackButtonOnObservationPage() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.backButton);
    		Logger.logAndReportInfo("Clicked on the back button on the observation page.");
    	}
    	
    	public void clickOnStartButtonOnObservation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.startButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the start button from observation.");
    	}
    	
    	public void clickOnObservationParentChild() throws Exception {
    		//ShikshaLokamClient.get().gestures().waitTillTheElementIsVisibleAndClickable(observationPageObjects.parentChildObservation);
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parentChildObservation);
    		Logger.logAndReportInfo("Clicked on the parent child observation.");
    	}
    	
    	//parent child actions
    	/*public void clickOn1stAnswerFor1stParent() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1firstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent1 first answer");
    	}
    	
    	public void clickOnParent1Child1FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the child 1 question first answer ");
    	}*/
    	
    	public void clickOnSaveObservationForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.saveButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the save button on observation question form");
    	}
    	
    	public void clickOnSaveFormConirmationYes() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSaveForm);
    		Logger.logAndReportInfo("Clicked on the Yes confirmation to save observation form.");
    	}
    	
    	/*public void clickOnQ2ParentSecondAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2SecondAnswer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parenet 2 question second answer");
    	}
    	
    	public void clickOnParent2Child2firstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer");
    	}
    	
    	public void clickOnParent3FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1Answer);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1Answer);
    		Logger.logAndReportInfo("Clicked on the parent 3 first answer.");
    	}
    	
    	public void clickOnParent3FirstChildFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	*/
    	// parent child click operations
    	public void clickOnParent1QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1QuestionfirstAnswer);
    		Logger.logAndReportInfo("Clicked on the Parent 1 question first answer.");;
    	}
    	
    	public void clickOnParent1Child1QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent1Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 1 child 1 first answer.");
    	}
    	
    	public void clickOnParent2QuestionSecondAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2QuestionSecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 question second answer.");
    	}
    	
    	public void clickOnParent2Child2QuestionSecondAnswer() throws Exception {
    		js.executeScript("arguments[0].click();", observationPageObjects.parent2Child2SecondAnswer);
    		//ShikshaLokamClient.get().gestures().click(observationPageObjects.parent2Child2SecondAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 2 child 2 second answer ");
    	}
    	
    	public void clickOnParent3QuestionFirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3QuestionFirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 question first answer.");
    	}
    	
    	public void clickOnParent3Child1FirstAnswer() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.parent3Child1FirstAnswer);
    		Logger.logAndReportInfo("Clicked on the parent 3 child 1 first answer.");
    	}
    	
    	
    	public void clickOnSubmitButtonOnQuestionForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on observation form.");
    	}
    	
    	public void clickOnContinueButtonOnSaveObservationForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.continueButtonOnFormSavePopup);
    		Logger.logAndReportInfo("Clicked on the continue button on observation form save");
    	}
    	
    	public void clickOnSubmitButtonOnObservationSaveForm() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.submitButtonForObservation);
    		Logger.logAndReportInfo("Clicked on the submit button on Observation form.");
    	}
    	
    	public void clickOnYesForSubmitFormConfirmation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.yesConfirmationForSubmitForm);
    		Logger.logAndReportInfo("Clicked on the yes confirmation on submitting the form.");
    	}
    	
    	public void clickOnOkButtonOnSubmitFormSuccess() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.okButtonOnFormSubmitSuccessMsg);
    		Logger.logAndReportInfo("Clicked on the Ok button on form submit success msg.");
    	}
    	
    	public void clickOnSearchedObservationTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.observationTitleForSearch);
    		Logger.logAndReportInfo("Clicked on the serached observation title.");
    	}
    	
  /*  	public void clickOnSearchedObsworubric2() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.Obsworubric2);
    		Logger.logAndReportInfo("Clicked on the obsworubric2."); 
    	} */
    	
    	
    	public void selectSchoolEntityobservation() throws Exception {
               if(getEnvironmentValue().contains("diksha")) {
                ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
                ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
            } else if(getEnvironmentValue().contains("preprod")) {
                ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsPreprod);
                ShikshaLokamClient.get().report().log(Status.INFO, "Testing project 5.1observation 5B 928.");
            } else {
            	ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsStaging);
                ShikshaLokamClient.get().report().log(Status.INFO, "Solution with rubrics -File button – FD-429");        	
            }
        }
    	
    	public void selectBlockEntityobservation() throws Exception {
            if(getEnvironmentValue().contains("diksha")) {
             ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
             ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
         } else if(getEnvironmentValue().contains("preprod")) {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsPreprod);
             ShikshaLokamClient.get().report().log(Status.INFO, "Infrastructure Assessment- Furniture.");
         } else {
         	ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsStaging);
             ShikshaLokamClient.get().report().log(Status.INFO, "QA solution - entity type block - FD 335']");        	
         }
     }
    	
    	
    	public void selectCreditAndLicenceobservation() throws Exception {
            if(getEnvironmentValue().contains("diksha")) {
             ShikshaLokamClient.get().gestures().click(loginPageObjects.alappuzhaDistrict);
             ShikshaLokamClient.get().report().log(Status.INFO, "Alappuzha District Selected.");
         } else if(getEnvironmentValue().contains("preprod")) {
             ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsPreprod);
             ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation.");
         } else {
         	ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceObsStaging);
             ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation");        	
         }
     }
    	
    	 public void clickOnSchoolEntityobsevation() throws Exception {
    		ShikshaLokamClient.get().gestures().click(observationPageObjects.SchoolEnityNotAddedObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Solution with rubrics -File button – FD-429");
    		
    		 }
    	 
    	 public void clickOnBlockEntityobsevation() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.BlockEnityNotAddedObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "QA solution - entity type block - FD 335']");
    		
    		 }
    	 
    	 public void clickOnCreditAndLicenceobservation() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceObsStaging);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Credits And License Observation");
    		
    		 }
    	
    	 
    	 public void clickOnCreditAndLicencedropdown() throws Exception {
    		 ShikshaLokamClient.get().gestures().click(observationPageObjects.CerditsAndLicenceDroapdown);
    	        ShikshaLokamClient.get().report().log(Status.INFO, "Clicked on Credits And License Dropdown");
    	 }
    		
    	 
    	 
    	//******************Verify*********************************************************//
    	
    	public void verifyObservationButton() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationButton),"Observation button is not displayed.");
    		Logger.logAndReportPass("Observation button is displayed succesfully");
    	}
    
    	public void verifyObservationTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().waitForElementToAppear(observationPageObjects.observationTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationTitle),"Observation title is not displayed.");
    		Logger.logAndReportPass("Observation title is displayed succesfully.");
    	}
    
    	public void verifyObservationDetailsTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observationDetailsTitle),"Observation Details title is not displayed.");
    		Logger.logAndReportPass("Observation Details title is displayed succesfully.");
    	}
    	
    	public void verifyObserveAgainPopupTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observeAgainTitle),"Observe again title is not displayed.");
    		Logger.logAndReportPass("Observe again title is displayed succesfully.");
    	}
    	public void verifyObservation1Title() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.observation1Title),"Observation 1 title is not displayed.");
    		Logger.logAndReportPass("Observation 1 title is displayed succesfully.");
    		Thread.sleep(2000);
    	}
    	
    	public void verifyStartButtonFromObservation() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.startButtonForObservation),"Start button for the observation is not displayed.");
    		Logger.logAndReportPass("Start button for the observation is displayed succesfully.");
    	}
    	
    	public void verifyThrashSymbolForEntityDelete() throws Exception {
    		Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.backButton), "Back button is not available on page");
    		Logger.logAndReportPass("Back symbol on observation is displayed succesfully.");
    	}
    	/**
    	//parent child verify
    	public void oldverifyParent1QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent1Question);
    		Logger.logAndReportPass("Q1 parent question is displayed succesfully");
    	}
    	
    	public void verifyParent1QuestionChild1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child1Question);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child1Question);
    		Logger.logAndReportPass("parent 1 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionChild2QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.child2Question);
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.child2Question);
    		Logger.logAndReportPass("Parent 2 Child 2 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3QuestionTitle() throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.parent3Question);
    		Logger.logAndReportPass("Parent 3 Question title is displayed succesfully.");
    	}
    	**/
    	//new parent child verify actions
    	public void verifyParent1QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent1QuestionTitle),"Parent 1 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 1 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent1Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent1Child1Question);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent1Child1Question),"Parent 1 child 1 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 1 child 1 Question is displayed succesfully.");
    	}
    	
    	public void verifyParent2QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent2QuestionTitle),"Parent 2 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyParent2Child2QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent2Child2QuestionTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent2Child2QuestionTitle),"Parent 2 Child 2 Question title is not displayed.");
    		Logger.logAndReportPass("Parent 2 Child 2 Question title is displayed succesfully.");
    	}
    	
    	public void verifyparent3QuestionTitle() throws Exception {
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent3QuestionTitle),"Parent 3 question title title is not displayed.");
    		Logger.logAndReportPass("Parent 3 question title is displayed succesfully.");
    	}
    	
    	public void verifyParent3Child1QuestionTitle() throws Exception {
    		js.executeScript("arguments[0].scrollIntoView(true);", observationPageObjects.parent3Child1QuestionTitle);
            Assert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.parent3Child1QuestionTitle),"Parent 3 child 1 question title is not displayed.");
    		Logger.logAndReportPass("Parent 3 child 1 question title is displayed succesfully.");
    	}
    	
    	public void verifyFormSaveSuccessMsg(String SuccessMsg) throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSaveTitle);
    		String actualSuccesMsg = ShikshaLokamClient.get().gestures().getText(observationPageObjects.formSaveTitle);
    		ShikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Save success Msg is not matching..");
    		Logger.logAndReportPass("Form save success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyFormSubmitSuccessMsg(String SuccessMsg) throws Exception {
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.formSubmitSuccesMsg);
    		String actualSuccesMsg = ShikshaLokamClient.get().gestures().getText(observationPageObjects.formSubmitSuccesMsg);
    		ShikshaLokamClient.get().getAsserts().assertEquals(SuccessMsg.trim(), actualSuccesMsg.trim(),
    				"Form Submit success Msg is not matching..");
    		Logger.logAndReportPass("Form submit success msg is matched and displayed succesfully.");
    	}
    	
    	public void verifyObservationName(String actualObservationName) throws Exception {
    		Thread.sleep(2000);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.observtionDetailsTitle);
    		ShikshaLokamClient.get().gestures().isDisplayed(observationPageObjects.ObservationName);
    		String presentObservationName =ShikshaLokamClient.get().gestures().getText(observationPageObjects.ObservationName);
    		ShikshaLokamClient.get().getAsserts().assertEquals(actualObservationName.trim(), presentObservationName.trim(), "Observation Name not matching..");
    		Logger.logAndReportPass("Observation name is matched and displayed succesfully.");
    	}
    	
    /*	public boolean verifyNoelement() throws Exception {
            try
            {
               if(observationPageObjects.observationform.isDisplayed())
               {
               return false;
               }
               return false;
            }
            catch(Exception e)
            {
            	Logger.logAndReportPass("No entity added by default");
                return true;
            }
    	}  */
    	
 	   public void xyz() throws Exception {  
 		  Assert.assertNotEquals(observationPageObjects.observationform, null, "Entity added by default");
	    	Logger.logAndReportInfo("No entity added by default");
 	   	
	    	//Assert.assertTrue(observationPageObjects.observationform.isDisplayed(),"yes");{
	    	//Logger.logAndReportPass("No entity added by default");              
 	   }
    	
    
    	
    	public void verifySchoolentityisnotadded() throws Exception {  
    		  Assert.assertTrue(ShikshaLokamClient.get().gestures().verifyNoelement(observationPageObjects.observationform),"Entity added by default");
   	    	Logger.logAndReportPass("No School entity added by default");
        }
   	    	public void verifyBlockentityisnotadded() throws Exception {  
      		  Assert.assertTrue(ShikshaLokamClient.get().gestures().verifyNoelement(observationPageObjects.observationform),"Entity added by default");
     	    	Logger.logAndReportPass("No Block entity added by default");
          }   
   	    
   	    	//Assert.assertEquals(0, wd.findElements(By.locator("locator")).size());

   	    	//credits and license contents verification
   	    	public void verifyCreditsandLicensecontents() throws Exception {
   	    		VerifyAuthor();
   	    		VerifyCreatedBy();
   	    		VerifyPublishedonby();
   	    		VerifyCreadtedon();
   	    		VerifyUpdatedon();
   	    		VerifyCreditslink();
   	    		VerifyLicenseterms();
   	    		softAssert.assertAll();
   	    		
   	    		Logger.logAndReportPass("Credits and License Contents are Verified");
   	    		
   	    	}
   	    	

   	    	public void VerifyAuthor() throws Exception {
   	    		//SoftAssert softAssert = new SoftAssert();
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.author),"Author Section is not Present.");
   	    		Logger.logAndReportInfo("Author Section is Present .");
   	    		
   	    	}
           
   	    	public void VerifyCreatedBy() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.createdby),"Created By Section is not Present.");
   	    		Logger.logAndReportInfo("Created By Section is Present .");
   	    	
   	    	}
             
   	    	public void VerifyPublishedonby() throws Exception {
   	    	  if(getEnvironmentValue().contains("diksha")) {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonDikshaBy),"Published On Diksha By Section is not Present .");
  	             ShikshaLokamClient.get().report().log(Status.INFO, "Published On Diksha By Section is Present .");
  	           
   	         } else if(getEnvironmentValue().contains("preprod")) {
   	        	softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonDikshaBy),"Published On Diksha By Section is not Present .");
   	             ShikshaLokamClient.get().report().log(Status.INFO, "Published On Diksha By Section is Present .");
   	          
   	         } else {
   	        	softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.publishedonSunbirdBy),"Published On Sunbird By Section is not Present .");
   	        	ShikshaLokamClient.get().report().log(Status.INFO, "Published On Sunbird By Section is Present ."); 
   	        	
   	         	      	
   	         }
   	     } 
   	    	
   	    	public void VerifyCreadtedon() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.creadtedon),"Created On Section is not Present.");
   	    		Logger.logAndReportInfo("Created On Section is Present .");
   	    		
   	    	}
   	    	

   	    	public void VerifyUpdatedon() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.updatedon),"Updated On Section is not Present.");
   	    		Logger.logAndReportInfo("Updated On Section is Present .");
   	    		
   	    	}
   	    	
   	    	public void VerifyCreditslink() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.creditslink),"Credits link is not Present.");
   	    		Logger.logAndReportInfo("Credits link is Present .");
   	    		
   	    	}
   	    	
   	    	public void VerifyLicenseterms() throws Exception {
   	    		softAssert.assertTrue(ShikshaLokamClient.get().gestures().isElementPresent(observationPageObjects.licenseterms),"License terms section is not Present.");
   	    		Logger.logAndReportInfo("License terms section is Present .");
   	    		
   	    	}
   	  
}

