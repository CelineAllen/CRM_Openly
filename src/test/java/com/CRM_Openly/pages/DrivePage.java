package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DrivePage extends BasePage {

    public DrivePage(){

        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[.='Drive']")
    public WebElement drive_btn;

    @FindBy(id = "top_menu_id_docs")
    public List<WebElement> topMenu;






}
