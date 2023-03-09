package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.HomePage;
import com.CRM_Openly.pages.PollPage;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class US107_Poll_stepDefs {
    HomePage homePage = new HomePage();
    PollPage pollPage= new PollPage();

    @Given("user click poll tab on the home page")
    public void user_click_poll_tab_on_the_home_page() {
        homePage.btn_poll.click();

    }

    @Then("user enter the data in to poll body")
    public void user_enter_the_data_in_to_poll_body() {
        //WebDriver driver = new ChromeDriver();
        //driver.switchTo().frame(1);
        pollPage.poll_body.sendKeys("title of question");
        BrowserUtils.sleep(2);

    }

    @Then("user enter the question in question box")
    public void user_enter_the_question_in_question_box() {
        pollPage.txt_question.sendKeys("question");
    }

    @Then("user enter one answer in first answer box")
    public void user_enter_one_answer_in_first_answer_box() {
        pollPage.txt_answer1.sendKeys("answer1");
    }

    @Then("user enter one answer in second answer box")
    public void user_enter_one_answer_in_second_answer_box() {
        pollPage.txt_answer2.sendKeys("answer2");
    }

    @Then("user click the send button and it create a poll under activity stream")
    public void user_click_the_send_button_and_it_create_a_poll_under_activity_stream() {
        pollPage.btn_send.click();
    }

    @Given("user should see the poll under the activity stream")
    public void user_should_see_the_poll_under_the_activity_stream() {
        homePage.last_poll.isDisplayed();

    }

    @Then("user select one answer in the poll")
    public void user_select_one_answer_in_the_poll() {
        homePage.radio_btn_firstAnswer.click();

    }

    @Then("user click the vote button")
    public void user_click_the_vote_button() {
        homePage.btn_vote.click();

    }
}
