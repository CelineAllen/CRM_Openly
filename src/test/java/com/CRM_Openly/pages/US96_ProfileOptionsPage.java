package com.CRM_Openly.pages;

import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US96_ProfileOptionsPage extends BasePage {

    public void US96_ProfileOptionsPage(){ PageFactory.initElements(Driver.getDriver(), this);}
//
//    @FindBy(name = "USER_LOGIN")
//    public WebElement userName;
//
//    @FindBy(name = "USER_PASSWORD")
//    public WebElement passWord;
//
    @FindBy(xpath = "//div[@id='user-block']")
    public WebElement profileClick;

   @FindBy(xpath ="//span[@class='menu-popup-item-text']" )
   public List<WebElement> profileOptions;

//    US96_ProfileOptionsPage pop=new US96_ProfileOptionsPage();
//    @When("user click on  profile")
//    public void user_click_on_profile() {
//
//        // Driver.getDriver().findElement(By.xpath("//div[@id='user-block']"));
//    }
//    @Then("Verify five options under profile")
//    public void verify_five_options_under_profile(List<WebElement> profileOptions) {
//
//
//        //Driver.getDriver().findElement(By.xpath("//div[@class='menu-popup']//span"));
//
//    }
}

