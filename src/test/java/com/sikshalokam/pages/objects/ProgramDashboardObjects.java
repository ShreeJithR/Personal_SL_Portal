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
     
     @FindBy(xpath="//span[normalize-space()='Project link consumption -FD 137']")
     public  WebElement projectlinkconsumptionfd137;
   //span[normalize-space()='Project link consumption -FD 137']
     
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
     
     @FindBy(xpath="//span[normalize-space()='Agra']")
     public  WebElement Agradistrict;
     
     @FindBy(xpath="//span[normalize-space()='Ambedkar Nagar']")
     public  WebElement Ambedkarnagardistrict;
     
   //span[.=' Agra '] //span[normalize-space()='Agra']   //span[normalize-space()='Ambedkar Nagar']
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[5]")
     public  WebElement organisationsDropdown;
     
     @FindBy(xpath="//span[normalize-space()='Staging Custodian Organization']")
     public  WebElement stagingcustodianorg;
     
     
     @FindBy(xpath="//span[normalize-space()='Pre-prod Custodian Organization']")
     public  WebElement preprodcustodianorg;
   //span[normalize-space()='Pre-prod Custodian Organization']
     
     @FindBy(xpath="//div[@id='mat-select-value-3']")         //(//div[@class='mat-select-arrow-wrapper'])[6]   //span[.='Select report']
     public  WebElement selectReportDropdown;                               //div[@id='mat-select-value-3'] //(//div[@class='mat-select-arrow-wrapper'])[6]
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Task Report']")
     public  WebElement taskReport;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Status Report']")
     public  WebElement statusReport;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Filtered task detail report']")
     public  WebElement filteredtaskReport;
     
     @FindBy(xpath="//button[normalize-space()='Request report']")
     public  WebElement requestReport;
     
     @FindBy(xpath="//div[normalize-space()='Are you sure you want to request this report?']")
     public  WebElement requestReportPasswordPopup;
     
     @FindBy(xpath="//input[@placeholder='Enter a password to request Report']")
     public  WebElement enterPassword;
   
     @FindBy(xpath="(//button[@aria-label='Open calendar'])[1]")
     public  WebElement startdate;
     
     @FindBy(xpath="(//button[@aria-label='Open calendar'])[2]")
     public  WebElement enddate;
     
     @FindBy(xpath="//button[@class='mat-calendar-previous-button mat-focus-indicator mat-icon-button mat-button-base']")
     public  WebElement Previousmonth;
     
     @FindBy(xpath="//div[normalize-space()='15']")
     public  WebElement date15;
     
     @FindBy(xpath="//div[normalize-space()='16']")
     public  WebElement date16;
     
     @FindBy(xpath="(//input[@data-placeholder='dd/mm/yyyy'])[1]")
     public  WebElement dateinput;
     
     @FindBy(xpath="//button[normalize-space()='Yes']")
     public  WebElement yesbutton;
     
     @FindBy(xpath="//button[normalize-space()='No']")
     public  WebElement nobutton;
   //button[normalize-space()='No']
   
     @FindBy(xpath="(//div[normalize-space()='Are you sure you want to request this report?'])[2]")
     public  WebElement requestReportYesNoPopup;
                    //span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-92 ng-star-inserted']
     @FindBy(xpath="//span[.='Select status']")
     public  WebElement selectstatusDropdown;
    
   //span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-92 ng-star-inserted']
     @FindBy(xpath="//span[normalize-space()='Started']")
     public  WebElement startedStatus;
     
     @FindBy(xpath="//span[normalize-space()='Submitted']")
     public  WebElement submittedStatus;
     
     @FindBy(xpath="//span[normalize-space()='Inprogress']")
     public  WebElement inprogressStatus;
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of tasks in the project']")
     public  WebElement mintasksinProject;
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of task evidence']")
     public  WebElement mintaskEvidence;
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of project evidence']")
     public  WebElement minprojectEvidence;
     
     
     
   //div[@id='mat-select-value-3']
   //label[normalize-space()='Minimum no. of tasks in the project']
   //label[normalize-space()='Minimum no. of task evidence']
   //label[normalize-space()='Minimum no. of project evidence']

   //span[normalize-space()='Started']
   //span[normalize-space()='Submitted']
   //span[normalize-space()='Inprogress']
 
   //span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-67 ng-star-inserted']
     //(//div[normalize-space()='Are you sure you want to request this report?'])[2]
     //button[normalize-space()='Yes']
     //(//input[@data-placeholder='dd/mm/yyyy'])[1]
   //div[.=' 15 ']
   //button[@class='mat-calendar-previous-button mat-focus-indicator mat-icon-button mat-button-base']
    //(//button[@aria-label='Open calendar'])[1]
   //input[@placeholder='Enter a password to request Report']
     
   //div[normalize-space()='Are you sure you want to request this report?']
   //button[.=' Request report ']  
}//span[@class='mat-select-placeholder mat-select-min-line ng-tns-c47-3 ng-star-inserted']
//span[@class='mat-option-text'][normalize-space()='Task Report']
//span[@class='mat-option-text'][normalize-space()='Status Report']
//span[@class='mat-option-text'][normalize-space()='Filtered task detail report']
		
		
		
		