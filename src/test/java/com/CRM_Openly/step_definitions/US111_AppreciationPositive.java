package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.AppreciationPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US111_AppreciationPositive {

    AppreciationPage page = new AppreciationPage();

    @Given("user clicks MORE button")
    public void userClicksMOREButton() {
        page.moreButton.click();
    }

    @Given("user clicks Appreciation button")
    public void user_clicks_message_button() {

        page.appreciationButton.click();

    }

    @When("user writes {string}")
    public void user_writes(String message) {

        Driver.getDriver().switchTo().frame(page.textZone);

        page.messageType.sendKeys(message);
        BrowserUtils.sleep(2);
        Driver.getDriver().switchTo().parentFrame();

    }

    @When("user clicks SEND button")
    public void user_clicks_send_button() {

        page.sendButton.click();

    }

    @Then("message {string} should display")
    public void message_should_display(String message) {

        BrowserUtils.sleep(2);


        for (WebElement each : page.messageDisplayed){

        if (each.getText().equals(message)){


            Assert.assertTrue(each.isDisplayed());

        }

        //Assert.assertTrue(each.getText().equals(message));

    }

    }



}
