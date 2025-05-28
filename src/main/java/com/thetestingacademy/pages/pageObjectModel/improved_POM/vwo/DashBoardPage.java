package com.thetestingacademy.pages.pageObjectModel.improved_POM.vwo;
import com.thetestingacademy.base.CommonToAllPage;
import com.thetestingacademy.utils.WaitHelpers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashBoardPage extends CommonToAllPage {
    WebDriver driver;

    public DashBoardPage(WebDriver driver) {
        this.driver = driver;
    }

    By userNameOnDashboard = By.cssSelector("[data-qa=\"lufexuloga\"]");
    private By DashboardTab = By.xpath("//*[@class=\"tabs-menu tabs-menu--gray\"]/li[1]/a");


    // Page Actions
    public String loggedInUserName() {
        WaitHelpers.visibilityOfElement(DashboardTab);
        clickElement(DashboardTab);
        return getText(userNameOnDashboard);
    }
}
