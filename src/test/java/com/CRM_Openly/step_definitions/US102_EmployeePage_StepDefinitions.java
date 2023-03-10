package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.DrivePage;
import com.CRM_Openly.pages.EmployeePage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US102_EmployeePage_StepDefinitions {

    EmployeePage employeePage = new EmployeePage();
    DrivePage drivePage = new DrivePage();

    @Given("user clicks {string} page")
    public void user_clicks_page(String employee) {

       drivePage.selectOption(drivePage.menuOptions, employee);

    }
    @Then("user should see all modules as expected")
    public void user_should_see_all_modules_as_expected(List<String> modules) {

        List<WebElement> actualModules = employeePage.allModules;


               List<String> actualModulesString = new ArrayList<>();

               for (WebElement element : actualModules){

                   actualModulesString.add(element.getText());

               }



        Assert.assertEquals(BrowserUtils.getElementsText(employeePage.allModules), actualModulesString);

    }


}
