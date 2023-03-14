package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public abstract class BasePage {

    public BasePage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='menu-item-link']")
    public List<WebElement> menuOptions;    // left panel options as a List

    public void selectOption(List<WebElement> selections, String selectionName) {

        for (WebElement each : selections) {
            if (each.getText().equalsIgnoreCase(selectionName.trim())) {
                each.click();
                break;

            }
        }
    }


    @FindBy(id = "user-block")
    public WebElement btn_userProfile;


}