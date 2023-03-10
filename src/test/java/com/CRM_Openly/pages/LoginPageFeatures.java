package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageFeatures {

   public LoginPageFeatures(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "USER_REMEMBER")
    public WebElement rememberCheckbox;

    @FindBy(name = "USER_LOGIN")
    public WebElement LoginInput;


    @FindBy(name = "USER_PASSWORD")
    public WebElement password;

    @FindBy(className = "login-btn")
    public WebElement Login_btn;
}
