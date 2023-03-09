package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PollPage {
    public PollPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    //@FindBy(xpath = "//body[@contenteditable='true']")
    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement poll_body;

    @FindBy(id = "question_0")
    public WebElement txt_question;

    @FindBy(id="answer_0__0_")
    public WebElement txt_answer1;
    @FindBy(id="answer_0__1_")
    public WebElement txt_answer2;

    @FindBy(id = "blog-submit-button-save")
    public WebElement btn_send;
    



}
