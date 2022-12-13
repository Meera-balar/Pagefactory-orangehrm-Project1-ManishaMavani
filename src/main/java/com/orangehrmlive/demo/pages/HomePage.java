package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class HomePage extends Utility {
    //Verify the ‘Dashboard’ text is display
    @CacheLookup
    @FindBy(xpath = "//h6[text()='Dashboard']")
    WebElement dashboardText;
    //This method Verify the ‘Dashboard’ text is display
    public String getDashboardText(){
        Reporter.log("Verify Dashboard text is displayed" + dashboardText.toString());
        String text =  getTextFromElement(dashboardText);
        CustomListeners.test.log(Status.PASS,"Get Dashboard text");
        return text;
    }

}
