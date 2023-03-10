package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.LoginPage;
import com.CRM_Openly.pages.US96_ProfileOptionsPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.ConfigurationReader;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class US96_UserProfileOptions_stepDef {
    US96_ProfileOptionsPage pop=new US96_ProfileOptionsPage();

    LoginPage login=new LoginPage();

    @Given("the user go to login page")
    public void the_user_go_to_login_page() {
        Driver.getDriver().get("https://qa.openlycrm.com/");
    }
    @When("login with username as {string}")
    public void login_with_username_as(String userName) {
      login.LoginInput.sendKeys(ConfigurationReader.getProperty("helpDesk_username"));

    }
    @When("password as {string}")
    public void password_as(String string) {
     login.password.sendKeys(ConfigurationReader.getProperty("helpDesk_password"));
       login.Login_btn.click();

      //pop.submitBtn.click();
    }
    @When("user click on  profile")
    public void user_click_on_profile() {
        BrowserUtils.sleep(5);
        pop.profileClick.click();
//        Alert alert= Driver.getDriver().switchTo().alert();
//        alert.accept();
//        BrowserUtils.sleep(1);

    }
    @Then("Verify five options under profile")
    public void verify_five_options_under_profile(List<String> expProfileOptions) {
        List<String> actProfileOptions= new ArrayList<>();
        for(WebElement each : pop.profileOptions){
            actProfileOptions.add(each.getText());
            System.out.println(each.getText());
        }

        Assert.assertEquals(expProfileOptions, actProfileOptions);


        for(String each: expProfileOptions){
            System.err.println(each+" Expected options");
    }


    }


}
