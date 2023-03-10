package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class MoreTabPage extends BasePage{


   public MoreTabPage(){
      PageFactory.initElements(Driver.getDriver(),this);
   }
@FindBy(xpath = "//span[@id='feed-add-post-form-link-text']")
   public WebElement more_tab;

   @FindBy(xpath = "//span[@class='menu-popup-item-text']")
   public List<WebElement> menu_popup;






   /*
    @FindBy(xpath = "//a[.='Drive']")
    public WebElement drive_btn;
    */





}
