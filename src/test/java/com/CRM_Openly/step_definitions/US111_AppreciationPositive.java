package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.AppreciationPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class US111_AppreciationPositive {

    AppreciationPage page = new AppreciationPage();

    @Given("user clicks Message button")
    public void user_clicks_message_button() {

        page.messageButton.click();

    }

    @When("user writes {string}")
    public void user_writes(String message) {

        page.textZone.sendKeys(message);

    }

    @When("user clicks SEND button")
    public void user_clicks_send_button() {

        page.sendButton.click();

    }

    @Then("message should display")
    public void message_should_display() {



    }

    @Then("user should see negative message")
    public void user_should_see_negative_message() {



    }

}
