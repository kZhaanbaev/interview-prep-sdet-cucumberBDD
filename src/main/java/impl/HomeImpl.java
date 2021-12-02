package impl;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.CommonPage;
import pages.HomePage;
import utils.ConfigReader;
import utils.SeleniumUtils;
import utils.WebDriverUtils;


public class HomeImpl implements CommonPage {
    HomePage page;

    public HomePage getPage(){
        if(page == null)
            page = new HomePage();
        return page;
    }


    public void navigateToHomepage(){
        WebDriverUtils.getDriver().get(ConfigReader.readProperty("url"));
    }

    public boolean isDashboardDisplayed(String dashboardName){
        String dashboardXpath = String.format(XPATH_DASHBOARD_BUTTON, dashboardName);
        return WebDriverUtils.getDriver().findElement(By.xpath(dashboardXpath)).isDisplayed();
    }

    public boolean doesStatementExist(String statement){
        for(WebElement element: getPage().allDoElements){
            if (element.getText().equalsIgnoreCase(statement))
                return true;
        }
        return false;
    }

    public void addStatement(String statement){
        SeleniumUtils.waitForElementVisibility(getPage().addDoBtn);
        getPage().addDoBtn.click();
        getPage().dosInput.click();
        getPage().dosInput.sendKeys(statement);
        getPage().enterBtn.click();
    }



}
