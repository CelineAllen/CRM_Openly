package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.LoginPage;
import com.CRM_Openly.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import org.junit.Assert;

public class US92_LoginStepDefs {




    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username =null;
        String password =null;

        if(userType.equalsIgnoreCase("Human Resources")){
            username = ConfigurationReader.getProperty("humanResources_username");
            password = ConfigurationReader.getProperty("humanResources_password");
        }else if(userType.equalsIgnoreCase("Help Desk")){
            username = ConfigurationReader.getProperty("helpDesk_username");
            password = ConfigurationReader.getProperty("helpDesk_password");
        }else if(userType.equalsIgnoreCase("Marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }

    LoginPage loginPage=new LoginPage();
    @Given("user enters invalid credentials")
    public void userEntersInvalidCredentials() {
        loginPage.login("username","password");
    }
    @Given("Incorrect username or password should be displayed when a user enters the wrong username or password.")
    public void incorrectUsernameOrPasswordShouldBeDisplayedWhenAUserEntersTheWrongUsernameOrPassword() {
        String expectedErrorMsg = "Incorrect login or password";

        Assert.assertEquals(loginPage.errorMessage.getText(),expectedErrorMsg);

    }


}
