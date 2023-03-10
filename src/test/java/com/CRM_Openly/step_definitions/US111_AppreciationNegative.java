package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.AppreciationPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;

public class US111_AppreciationNegative {

    AppreciationPage page = new AppreciationPage();

    @Given("user clicks button Message")
    public void user_clicks_button_message() {

        page.messageButton.click();

    }
    @Given("user clicks button SEND")
    public void user_clicks_button_send() {
       page.sendButton.click();
    }


    @Then("user should see {string} message")
    public void user_should_see_negative_message(String negativeMessage) {

        BrowserUtils.waitForVisibility(page.negativeMessage, 3);

        Assert.assertEquals(page.negativeMessage.getText(), negativeMessage);


    }

}
