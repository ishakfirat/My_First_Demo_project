package com.navfort.step_definitions;

import com.navfort.pages.SalesManagerDashboardPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class DashboardPageVerifyStep_Definition {
    SalesManagerDashboardPage salesManagerDashboardPage= new SalesManagerDashboardPage();

    @Then("salesManager should see the Breadcrumb, Page Heading and Page Title of the Dashboard Page")
    public void salesmanager_Should_See_The_Breadcrumb_PageHeading_And_Page_Title_Of_The_Dashboard_Page() {

        String expectedBreadCrump="breadcrumb";
        String actualBreadCrumb=salesManagerDashboardPage.breadCrump.getAttribute("class");
        Assert.assertEquals("Bread crump verification Failed!!!",expectedBreadCrump,actualBreadCrumb);

        String expectedPageHeading="nav-multilevel main-menu";
        String actualPageHeading=salesManagerDashboardPage.pageHeading.getAttribute("class");
        Assert.assertEquals("PageHeading verification Failed!!!",expectedPageHeading,actualPageHeading);

        String expectedPageTitle="Dashboard";
        String actualPageTitle=salesManagerDashboardPage.dashboard.getText();
        Assert.assertEquals("Page title verification Failed!!!",expectedPageTitle,actualPageTitle);









    }




}
