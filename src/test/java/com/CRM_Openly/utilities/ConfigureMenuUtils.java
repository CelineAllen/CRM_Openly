package com.CRM_Openly.utilities;

import com.CRM_Openly.pages.ConfigureMenu;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class ConfigureMenuUtils {


    public static void confirmAccessibility(WebElement optionToConfirm){

        ConfigureMenu configureMenu=new ConfigureMenu();
        BrowserUtils wait=new BrowserUtils();

        configureMenu.configureMenuNavigationButton.click();

        BrowserUtils.sleep(2);

        if (optionToConfirm.isDisplayed()) {

           optionToConfirm.click();

        }else{
           System.out.println("TEST FAILED!!!");

        }

       BrowserUtils.sleep(2);


    }
}
