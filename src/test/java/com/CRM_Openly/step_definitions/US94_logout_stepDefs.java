package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.BasePage;
import com.CRM_Openly.pages.HomePage;
import com.CRM_Openly.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US94_logout_stepDefs {

    HomePage homePage = new HomePage();

    @Given("User click the user profile button on the top right corner")
    public void user_click_the_user_profile_button_on_the_top_right_corner() {
        homePage.btn_userProfile.click();
    }
    @Then("the Log Out option should be displayed then user should navigate back to the login page")
    public void the_log_out_option_should_be_displayed_then_user_should_navigate_back_to_the_login_page() {
        String exceptedResult= "Log out";
        Assert.assertEquals(homePage.btn_logOut.getText(),exceptedResult);
    }
}
