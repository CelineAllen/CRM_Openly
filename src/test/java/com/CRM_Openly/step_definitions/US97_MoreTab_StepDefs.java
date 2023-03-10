package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.MoreTabPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class US97_MoreTab_StepDefs {


    MoreTabPage moreTabPage = new MoreTabPage();
    @Given("user clicks MORE tab")
    public void user_clicks_more_tab() {

    moreTabPage.more_tab.click();


    }


    @And("user should see all  options")
    public void userShouldSeeAllOptions(List<String> expectedOptions) {

        List<String> actualOptions = new ArrayList<>();

        for (WebElement eachOption : moreTabPage.menu_popup) {
            actualOptions.add(eachOption.getText());

            System.err.println(eachOption.getText());
        }



      // System.out.println("actualOptions = " + actualOptions);
     //   System.out.println("expectedOptions = " + expectedOptions);


        Assert.assertEquals(expectedOptions,actualOptions);

    }
}
