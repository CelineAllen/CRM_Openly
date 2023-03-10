package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfigureMenu {

    public ConfigureMenu() {

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//span[normalize-space(text())='Configure menu']")
    public WebElement configureMenuNavigationButton;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[1]")
    public WebElement ConfigureMenuItemsOption;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[2]")
    public WebElement CollapseMenuOption;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[3]")
    public WebElement RemoveCurrentPageFromLeftMenuOption;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[4]")
    public WebElement AddCustomMenuItemOption;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[5]")
    public WebElement ChangePrimaryToolOption;

    @FindBy(xpath = "//div[@class='menu-popup-items']/span[6]")
    public WebElement ResetMenuOption;

    @FindBy(xpath = "//span[.='Save changes']")
    public WebElement SaveChangesButton;

    @FindBy(xpath = "//span[@class='menu-resize-btn']")
    public WebElement BackToMenu;

    @FindBy(xpath = "//span[.='Cancel']")
    public WebElement CancelButton;

    @FindBy(xpath = "//div[@class='left-menu-popup-close-item']")
    public WebElement ClosePopUp;








}