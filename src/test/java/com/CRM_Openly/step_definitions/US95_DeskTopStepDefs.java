package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.DesktopOptionsPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;

import java.util.List;


public class US95_DeskTopStepDefs {

    DesktopOptionsPage desktopOptionsPage = new DesktopOptionsPage();


    @Given("User should scroll down")
    public void user_should_scroll_down() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("window.scrollBy(0,400)");

        Thread.sleep(3000);

    }


    @Then("User should see {string}")
    public void userShouldSee(String DesktopClient) {
        BrowserUtils.verifyElementDisplayed(desktopOptionsPage.DesktopClient);
    }

    @Then("User should see below options")
    public void userShouldSeeBelowOptions(List<String> options) {

    }
}

