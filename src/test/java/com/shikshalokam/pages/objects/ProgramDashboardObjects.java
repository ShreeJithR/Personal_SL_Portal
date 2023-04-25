package com.shikshalokam.pages.objects;

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
     public  WebElement selectprogramdropdownonpopup;
  
     @FindBy(xpath="//span[.=' Testing 4.4 ']")
     public  WebElement programTesting4point4;
     
     
     @FindBy(xpath="//span[normalize-space()='Testing Program 4.4']")
     public  WebElement programTestingProgram4point4;
   //span[normalize-space()='Testing Program 4.4']
 
     @FindBy(xpath="(//span[.='Select resource'])[2]")
     public  WebElement selectresoursedropdownonpopup;
     
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[3]")
     public  WebElement selectresoursedropdown;
     
    // (//div[@class='mat-select-arrow-wrapper'])[3]
     
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
     
     
   //  /html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-datasets[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]
     
     @FindBy(xpath="/html[1]/body[1]/app-root[1]/div[1]/div[1]/main[1]/app-datasets[1]/div[2]/mat-tab-group[1]/div[1]/mat-tab-body[1]/div[1]/div[1]/div[1]/div[2]/div[1]/mat-form-field[1]/div[1]/div[1]/div[1]/mat-select[1]/div[1]/div[2]")         //(//div[@class='mat-select-arrow-wrapper'])[6]   //span[.='Select report']
     public  WebElement selectReportDropdown; 		 
    		 
    		 
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[6]")         //(//div[@class='mat-select-arrow-wrapper'])[6]   //span[.='Select report']
     public  WebElement selectReportDropdown1;   
     
     @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[7]")         //(//div[@class='mat-select-arrow-wrapper'])[6]   //span[.='Select report']
     public  WebElement selectReportDropdown2;
     
     //(//span[.='Status Report'])[1]
     //div[@id='mat-select-value-3'] //(//div[@class='mat-select-arrow-wrapper'])[6]
     
    // @FindBy(xpath="(//div[@class='mat-select-arrow-wrapper'])[7]")         //(//div[@class='mat-select-arrow-wrapper'])[6]   //span[.='Select report']
     //public  WebElement selectReportDropdown2;
     
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
     @FindBy(xpath="//div[.=' Your report has been requested and will be available to download after 24 hours ']")
     public  WebElement reportRequestedPopup;
     
     @FindBy(xpath="//button[normalize-space()='OK']")
     public  WebElement okButtonOnReportRequestedPopup;
     
     
   //button[normalize-space()='OK']
   //div[.=' Your report has been requested and will be available to download after 24 hours ']
   
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
     
     
     @FindBy(xpath="//span[normalize-space()='Completed']")
     public  WebElement completedStatus;
   //span[normalize-space()='Completed']
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of tasks in the project']")
     public  WebElement mintasksinProject;
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of task evidence']")
     public  WebElement mintaskEvidence;
     
     @FindBy(xpath="//label[normalize-space()='Minimum no. of project evidence']")
     public  WebElement minprojectEvidence;
     
     @FindBy(xpath="//span[contains(text(),'Observation with Rubrics – FD 98')]")
     public  WebElement obswithrubricstaging;
     
     @FindBy(xpath="//span[contains(text(),' Obs with rubric - FD 137 ')]")
     public  WebElement obswithrubricpreprod;
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Question Report']")
     public  WebElement questionReport;
     
     
     @FindBy(xpath="//span[@class='mat-option-text'][normalize-space()='Domain Criteria Report']")
     public  WebElement domaincriteriaReport;
     
     @FindBy(xpath="//span[contains(text(),' Observation without rubric targeted – FD 98 ')]")
     public  WebElement obswithoutrubricstaging;
     
     @FindBy(xpath="//span[contains(text(),' Obs without rubric - FD 137 ')]")
     public  WebElement obswithoutrubricpreprod;
     
     @FindBy(xpath="//span[normalize-space()='Survey 4.4 Reg Test - FD 235']")
     public  WebElement surveystaging;
     
     
     @FindBy(xpath="//span[normalize-space()='Survey Test Expiry -29/12/2021 -- FD 196']")
     public  WebElement surveypreprod;
     
     
   //span[normalize-space()='Survey Test Expiry -29/12/2021 -- FD 196']
    // (//span[normalize-space()='Survey FD-443 expiry - 24/06/2022'])[3]
   //span[contains(text(),' Obs without rubric - FD 137 ')]
   //span[contains(text(),' Observation without rubric targeted – FD 98 ')]
     
   //span[@class='mat-option-text'][normalize-space()='Question Report']
   //span[@class='mat-option-text'][normalize-space()='Domain Criteria Report']
     
     
   //span[contains(text(),' Obs with rubric - FD 137 ')]
   //span[contains(text(),'Observation with Rubrics – FD 98')]
   //label[normalize-space()='Minimum no. of project evidence']
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
		
		
		
		