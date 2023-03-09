package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.ChatAndCallsPage;
import com.CRM_Openly.pages.HomePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US98_chatAndCalls_stepDefs {

    HomePage homePage = new HomePage();
    ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();

    @Given("User can click the Chat and Calls tap on the right side taps")
    public void user_can_click_the_chat_and_calls_tap_on_the_right_side_taps() {
        homePage.selectOption(homePage.menuOptions,"Chat and Calls");
    }






    @Then("user sees sub modules below")
    public void userSeesSubModulesBelow(List<String> expectedSubModules) {
        List<String> actualSubModules= new ArrayList<>();
        for(WebElement each : chatAndCallsPage.subModules){
            actualSubModules.add(each.getAttribute("title").trim());
        }
        Assert.assertTrue(actualSubModules.containsAll(expectedSubModules));
    }
}
