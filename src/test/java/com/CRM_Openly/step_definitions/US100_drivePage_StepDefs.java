package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.BasePage;
import com.CRM_Openly.pages.DrivePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;

import java.util.List;

public class US100_drivePage_StepDefs {

    DrivePage drivePage = new DrivePage();
    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
    }

    @Given("user click on drive button in main page")
    public void user_click_on_drive_button_in_main_page() {


        drivePage.selectOption(drivePage.menuOptions,"Drive");

    }

    @Given("Verify the users view all modules in the Drive page.")
    public void verify_the_users_view_all_modules_in_the_drive_page(List<WebElement> topMenu) {




        Assert.assertEquals(BrowserUtils.getElementsText(topMenu),topMenu);



    }



}
