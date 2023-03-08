package com.navfort.step_definitions;

import com.navfort.pages.SalesManagerDashboardPage;
import com.navfort.pages.SalesManagerLoginPage;
import com.navfort.utilities.ConfigurationReader;
import com.navfort.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SalesManagerLoginStep_definitions {
    SalesManagerLoginPage salesManagerLoginPage= new SalesManagerLoginPage();
    SalesManagerDashboardPage salesManagerDashboardPage= new SalesManagerDashboardPage();

    @Given("salesManager is on the login page of NavFort application")
    public void sales_manager_is_on_the_login_page_of_nav_fort_application() {
        Driver.getDriver().get(ConfigurationReader.getProperty("sales.manager.url"));

    }
    @When("salesManager enter username {string}")
    public void sales_manager_enter_username(String username) {
        salesManagerLoginPage.inputUsername.sendKeys(username);


    }
    @When("salesManager enter password {string}")
    public void sales_manager_enter_password(String password) {
        salesManagerLoginPage.inputPassword.sendKeys(password);

    }
    @When("salesManager click LOG İN button")
    public void sales_manager_click_log_in_button() {
        salesManagerLoginPage.loginBtn.click();

    }
    @Then("salesManager should see the dashboard page")
    public void sales_manager_should_see_the_dashboard_page() {
        String expectedPageHeader="Dashboard";
        String actualPageHeader=salesManagerDashboardPage.dashboard.getText();
        Assert.assertEquals("Dashboard page verification Failed!!!",expectedPageHeader,actualPageHeader);


    }
    @Then("salesManager should not be able to login")
    public void sales_manager_should_not_be_able_to_login() {
        String expectedHeader="Login";
        String actualHeader= salesManagerLoginPage.loginPageHeader.getText();

        Assert.assertEquals("Negative login scenario Failed!!!",expectedHeader,actualHeader);


    }



}
