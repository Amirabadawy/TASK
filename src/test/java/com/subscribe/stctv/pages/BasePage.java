package com.subscribe.stctv.pages;

import com.subscribe.stctv.driver.DriverManager;
import org.openqa.selenium.By;
import com.subscribe.stctv.tests.WaitUtils;

public class BasePage extends WaitUtils {
    public String getElementText(By by){
        return waitUntilElementIsPresence(by).getText();
    }

    public String getCurrentUrl(){
        return DriverManager.getWebDriver().getCurrentUrl();
    }
    public void back() {
        DriverManager.getWebDriver().navigate().back();
    }

    public String getAlertMessage(){
        waitUntilAlertIsPresence();
        return DriverManager.getWebDriver().switchTo().alert().getText();
    }

    public void clickOnOkInAlert(){
        DriverManager.getWebDriver().switchTo().alert().accept();
    }
}
