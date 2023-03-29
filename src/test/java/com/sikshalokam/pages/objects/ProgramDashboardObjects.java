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
 
     @FindBy(xpath="(//span[.='Select resource'])[2]")
     public  WebElement selectresoursedropdown;
     
     
     
     
     
}
		
		
		
		
		