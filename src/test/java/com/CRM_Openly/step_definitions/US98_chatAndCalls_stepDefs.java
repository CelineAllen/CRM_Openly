package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.ChatAndCallsPage;
import com.CRM_Openly.pages.HomePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.List;

public class US98_chatAndCalls_stepDefs {

    HomePage homePage = new HomePage();
    ChatAndCallsPage chatAndCallsPage = new ChatAndCallsPage();

    @Given("User can click the Chat and Calls tap on the right side taps")
    public void user_can_click_the_chat_and_calls_tap_on_the_right_side_taps() {
        homePage.selectOption(homePage.menuOptions,"Chat and Calls");
    }




    @Then("user should be able to see four sub taps in chat and calls page Message, Notifications, Settings, Active Stream")
    public void userShouldBeAbleToSeeFourSubTapsInChatAndCallsPageMessageNotificationsSettingsActiveStream() {
        String actualmsg= chatAndCallsPage.btn_message.getAttribute("title");
        Assert.assertEquals(actualmsg,"Message(s) ");
        String actualntf= chatAndCallsPage.btn_notifications.getAttribute("title");
        Assert.assertEquals(actualntf,"Notifications");
        String actualstg= chatAndCallsPage.btn_settings.getAttribute("title");
        Assert.assertEquals(actualstg,"Settings");
        String actualact= chatAndCallsPage.btn_activeStream.getAttribute("title");
        Assert.assertEquals(actualact,"Active Stream");

    }
}
