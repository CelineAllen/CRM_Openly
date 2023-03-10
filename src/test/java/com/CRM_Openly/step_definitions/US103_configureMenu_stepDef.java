package com.CRM_Openly.step_definitions;

import com.CRM_Openly.pages.ConfigureMenu;
import com.CRM_Openly.utilities.BrowserUtils;
import com.CRM_Openly.utilities.ConfigureMenuUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Alert;

public class US103_configureMenu_stepDef {

ConfigureMenu configureMenu=new ConfigureMenu();


    @Given("user navigates to configure menu")
    public void user_navigates_to_configure_menu() {
        configureMenu.configureMenuNavigationButton.isDisplayed();
    }

    @Then("user click on configure menu")
    public void user_click_on_configure_menu() {
       // configureMenu.configureMenuNavigationButton.click();
    }

    @Then("user is able to see Configure Menu Items option and click on it")
    public void user_is_able_to_see_configure_menu_items_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.ConfigureMenuItemsOption);
        configureMenu.SaveChangesButton.click();
    }
    @Then("user is able to see Collapse menu option and click on it")
    public void user_is_able_to_see_collapse_menu_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.CollapseMenuOption);
        configureMenu.BackToMenu.click();
    }
    @Then("user is able to see Remove current page from left menu option and click on it")
    public void user_is_able_to_see_remove_current_page_from_left_menu_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.RemoveCurrentPageFromLeftMenuOption);
        BrowserUtils.sleep(3);
        Assert.assertTrue(configureMenu.RemoveCurrentPageFromLeftMenuOption.isSelected());

    }

    @Then("user is able to see Add custom menu item option and click on it")
    public void user_is_able_to_see_add_custom_menu_item_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.AddCustomMenuItemOption);
        configureMenu.CancelButton.click();
    }
    @Then("user is able to see Change primary tool option and click on it")
    public void user_is_able_to_see_change_primary_tool_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.ChangePrimaryToolOption);
        configureMenu.ClosePopUp.click();
    }
    @Then("user is able to see Reset menu option and click on it")
    public void user_is_able_to_see_reset_menu_option_and_click_on_it() {
        ConfigureMenuUtils.confirmAccessibility(configureMenu.ResetMenuOption);

    }


}
