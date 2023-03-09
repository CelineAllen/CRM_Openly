package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.BasePage;
import com.CRM_Openly.pages.DrivePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ISelect;

import java.util.ArrayList;
import java.util.List;

public class US100_drivePage_StepDefs {

    DrivePage drivePage = new DrivePage();

    @Given("user is on the main page")
    public void userIsOnTheMainPage() {
    }


    @When("user click on drive button in main page")
    public void userClickOnDriveButtonInMainPage() {

        drivePage.selectOption(drivePage.menuOptions, "Drive");
    }

    @Then("Verify the users view all modules in the Drive page.")
    public void verifyTheUsersViewAllModulesInTheDrivePage(List<String> expectedModules) {



        List<String> actualModules = new ArrayList<>();

        for (WebElement each : drivePage.topMenu) {
            actualModules.add(each.getText());
        }
    Assert.assertTrue(actualModules.containsAll(expectedModules));


    }
}
