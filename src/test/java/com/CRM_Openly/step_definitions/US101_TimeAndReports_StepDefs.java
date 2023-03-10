package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.BasePage;
import com.CRM_Openly.pages.LoginPage;
import com.CRM_Openly.pages.LoginPageFeatures;
import com.CRM_Openly.pages.TimeAndReportsPage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class US101_TimeAndReports_StepDefs extends BasePage {

    LoginPage loginPage = new LoginPage();
    TimeAndReportsPage timeAndReportsPage = new TimeAndReportsPage();

//    @Given("user enter {string} and {string} and click the LogIn button")
//    public void userEnterAndAndClickTheLogInButton(String username, String password) {
//        loginPage.login(username,password);
//
//    }

    @When("user click on {string} button in main page")
    public void userClickOnButtonInMainPage(String menuOption) {
        selectOption(menuOptions, menuOption);
    }


    @Then("Verify the users view all modules in the Time and Reports page")
    public void verifyTheUsersViewAllModulesInTheTimeAndReportsPage(List<String> modules) {
        List<String> actualText = BrowserUtils.getElementsText(timeAndReportsPage.options);
       // System.out.println(actualText);
       // System.out.println(modules);

        Assert.assertTrue(actualText.equals(modules));

    }
}
