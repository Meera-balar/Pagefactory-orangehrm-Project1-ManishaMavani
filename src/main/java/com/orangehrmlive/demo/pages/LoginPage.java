package com.orangehrmlive.demo.pages;

import com.aventstack.extentreports.Status;
import com.orangehrmlive.demo.customlisteners.CustomListeners;
import com.orangehrmlive.demo.utility.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class LoginPage extends Utility {
    @CacheLookup
    @FindBy(name = "username")
    WebElement userNameField;
    @CacheLookup
    @FindBy(name = "password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(xpath = "//button[text()=' Login ']")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//p[text()='Forgot your password? ']")
    WebElement forgotPasswordLink;

    //This method to enter username
    public void enterUserName(String username){
        Reporter.log("Enter username " + username + " to username field " + userNameField.toString());
        sendTextToElement(userNameField,username);
        CustomListeners.test.log(Status.PASS,"Enter Username " + username);
    }
    //This method to enter password
    public void enterPassword(String password){
        Reporter.log("Enter password " + password + " to password field " + passwordField.toString());
        sendTextToElement(passwordField,password);
        CustomListeners.test.log(Status.PASS,"Enter Password " + password);
    }
    //This method to click on login button
    public void clickOnLoginButton(){
        Reporter.log("Clicking on Login Button " + loginButton.toString());
        clickOnElement(loginButton);
        CustomListeners.test.log(Status.PASS,"Click on loginButton");
    }
    //This method to click on forget password link
    public void clickOnForgotPasswordLink(){
        Reporter.log("Clicking on Forgot Password Link " + forgotPasswordLink.toString());
        clickOnElement(forgotPasswordLink);
       CustomListeners.test.log(Status.PASS,"Click on forgotPassword link");
    }
}
