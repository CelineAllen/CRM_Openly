package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.BasePage;
import com.CRM_Openly.pages.DrivePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US100_drivePage_StepDefs {

    DrivePage drivePage = new DrivePage();

    @Given("user click on drive button in main page")
    public void user_click_on_drive_button_in_main_page() {


        drivePage.drive_btn.sendKeys(Keys.ENTER);

    }

    @Given("Verify the users view all modules in the Drive page.")
    public void verify_the_users_view_all_modules_in_the_drive_page(List<WebElement> topMenu) {


        BrowserUtils.getElementsText(topMenu);

    }


    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
    }
}
