package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.LoginPageFeatures;
import com.CRM_Openly.utilities.ConfigurationReader;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US93_LoginPageFeatures_StepDefs {

    LoginPageFeatures loginPageFeatures = new LoginPageFeatures();

    @Given("user is on the login page of the OpenlyCRM application")
    public void user_is_on_the_login_page_of_the_openly_crm_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
    }

    @When("user enter {string} and {string}")
    public void user_enter_and(String username, String password) {
        loginPageFeatures.LoginInput.sendKeys(username);
        loginPageFeatures.password.sendKeys(password);
    }

    @Then("user can check the {string} checkbox")
    public void user_can_check_the_checkbox(String string) {
       loginPageFeatures.rememberCheckbox.click();
        Assert.assertTrue(loginPageFeatures.rememberCheckbox.isSelected());
    }

    @Then("User can click the LogIn button")
    public void user_can_click_the_log_in_button() {
     Assert.assertTrue(loginPageFeatures.Login_btn.isEnabled());
     loginPageFeatures.Login_btn.click();
     }



}
