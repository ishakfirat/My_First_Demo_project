package com.navfort.pages;

import com.navfort.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesManagerDashboardPage {
    public SalesManagerDashboardPage(){
        PageFactory.initElements(Driver.getDriver(),this);

    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement dashboard;

    @FindBy(xpath = "//div[@id='breadcrumb']/ul")
    public WebElement breadCrump;

    @FindBy(xpath = "//div[@id='main-menu']/ul")
    public WebElement pageHeading;














}
