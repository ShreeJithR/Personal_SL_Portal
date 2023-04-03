package com.sikshalokam.pages.objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProgramDashboardObjects {

	
	  @FindBy(xpath="(//div[@class='avatar-content'])[2]")
	    public  WebElement guestIcon;
      

     @FindBy(xpath="//li[.=' Program dashboard ']")
        public  WebElement programdashboard;
       
     @FindBy(xpath="//div[.=' Note: Please select program and resource name.']")
     public  WebElement programresourcePopup;

     @FindBy(xpath="(//span[.='Select program'])[2]")
     public  WebElement selectprogramdropdown;
  
     @FindBy(xpath="//span[.=' Testing 4.4 ']")
     public  WebElement programTesting4point4;
     
     
     @FindBy(xpath="//span[normalize-space()='Testing Program 4.4']")
     public  WebElement programTestingProgram4point4;
   //span[normalize-space()='Testing Program 4.4']
 
     @FindBy(xpath="(//span[.='Select resource'])[2]")
     public  WebElement selectresoursedropdown;
     
     @FindBy(xpath="//button[normalize-space()='Confirm']")
     public  WebElement confirmbuttonOnprogramresourcePopup;
     
     @FindBy(xpath="//span[normalize-space()='Project link consumption -FD 98']")
     public  WebElement projectlinkconsumptionfd98;
     
     @FindBy(xpath="//span[normalize-space()='Program datasets']")
     public  WebElement Programdatasets;
     
     @FindBy(xpath="//span[normalize-space()='Graphs']")
     public  WebElement Graphs;
     
     @FindBy(xpath="//span[normalize-space()='Tables']")
     public  WebElement Tables;
     
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[4]")
     public  WebElement districtDropdown;
     
     @FindBy(xpath="//span[normalize-space()='Anantapur']")
     public  WebElement Anantapurdistrict;
     
     @FindBy(xpath="//span[normalize-space()='Chittoor']")
     public  WebElement Chittordistrict;
     
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[5]")
     public  WebElement organisationsDropdown;
     
     @FindBy(xpath="//span[normalize-space()='Staging Custodian Organization']")
     public  WebElement stagingcustodianorg;
     
     
     @FindBy(xpath="//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-3 ng-star-inserted']")
     public  WebElement selectReportDropdown;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Task Report']")
     public  WebElement taskReport;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Status Report']")
     public  WebElement statusReport;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Filtered task detail report']")
     public  WebElement filteredtaskReport;
     
     
     
}//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-3 ng-star-inserted']
//span[@class='mat-option-text'][normalize-space()='Task Report']
//span[@class='mat-option-text'][normalize-space()='Status Report']
//span[@class='mat-option-text'][normalize-space()='Filtered task detail report']
		
		
		
		