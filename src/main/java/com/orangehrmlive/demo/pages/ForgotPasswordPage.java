package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.google.common.base.Verify;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class ForgotPasswordPage extends Utility {
    @CacheLookup
    @FindBy(xpath = "//h6[text()='Reset Password']" )
    WebElement resetPasswordText;
   //This method to verify text "Reset Password" is display
    public String getResetPasswordText(){
        Reporter.log("Verify Reset Password text is displayed " + resetPasswordText.toString());
        String text = getTextFromElement(resetPasswordText);
        CustomListeners.test.log(Status.PASS,"Get resetPassword text");
       return text;
    }
}
