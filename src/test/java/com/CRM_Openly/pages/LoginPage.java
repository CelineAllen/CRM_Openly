package com.CRM_Openly.pages;


import com.CRM_Openly.utilities.Driver;
import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(name = "USER_LOGIN")
    public WebElement LoginInput;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement Login_btn;


    public void login(String userNameStr, String passwordStr) {
        LoginInput.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        Login_btn.click();
        // verification that we logged
    }

    @FindBy(className = "errortext")
    public WebElement errorMessage;

}
