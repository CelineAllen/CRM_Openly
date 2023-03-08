package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ChatAndCallsPage {
    public ChatAndCallsPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(css = "div[title='Message(s) ']")
    public WebElement btn_message;
    @FindBy(css = "div[title='Notifications']")
    public WebElement btn_notifications;
    @FindBy(css = "div[title='Settings']")
    public WebElement btn_settings;
    @FindBy(css = "div[title='Activity Stream ']")
    public WebElement btn_activeStream;

    //@FindBy(css = "div[title]")
    //public List<WebElement> list_options;



}
