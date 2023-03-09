package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.AppreciationPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.beans.Visibility;
import java.time.Duration;

public class US111_AppreciationNegative {

    AppreciationPage page = new AppreciationPage();

    @Given("user clicks Message button")
    public void user_clicks_message_button() {

        page.messageButton.click();

    }

    @When("user clicks SEND button")
    public void user_clicks_send_button() {

        page.sendButton.click();

    }

    @Then("user should see {string} message")
    public void user_should_see_negative_message(String negativeMessage) {

        BrowserUtils.waitForVisibility(page.negativeMessage, 3);

        Assert.assertEquals(page.negativeMessage, negativeMessage);


    }

}
