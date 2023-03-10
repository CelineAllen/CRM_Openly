package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class AppreciationPage {

    public AppreciationPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//span[@id='feed-add-post-form-tab-message']")
    public WebElement messageButton;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement textZone;

    @FindBy(xpath = "//body[@style='min-height: 184px;']")
    public WebElement messageType;

    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    @FindBy(xpath = "//div[@id='feed-add-post-form-notice-blockblogPostForm']")
    public WebElement negativeMessage;

    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']")
    public List <WebElement> messageDisplayed;


}
