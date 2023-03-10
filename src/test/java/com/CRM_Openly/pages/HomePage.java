package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BasePage{
    public HomePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement btn_logOut;

    @FindBy(xpath = "//span[.='Poll']")
    public WebElement btn_poll;

    @FindBy(xpath = "(//span[@class='bx-vote-block-inp-substitute'])[1]")
    public WebElement radio_btn_firstAnswer;

    @FindBy(xpath = "(//button[.='Vote'])[1]")
    public WebElement btn_vote;

    @FindBy(xpath = "(//div[contains(@id,'blg-post-img')])[1]")
    public WebElement last_poll;
    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement pollMessageBox;

    @FindBy(xpath = "//div[@id='bx-html-editor-iframe-cnt-idPostFormLHE_blogPostForm']//iframe")
    public WebElement messageBoxIframe;



}
