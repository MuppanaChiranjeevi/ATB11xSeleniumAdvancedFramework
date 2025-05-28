package com.thetestingacademy.pages.pageObjectModel.normal_POM.vwo;

import com.thetestingacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage {

    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    private By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    private By DashboardTab = By.xpath("//*[@class=\"tabs-menu tabs-menu--gray\"]/li[1]/a");
    // Page Actions
    public String loggedInUserName(){
        WaitHelpers.waitJVM(1000);
        driver.findElement(DashboardTab).click();
        return driver.findElement(userNameOnDashboard).getText();
    }
}
