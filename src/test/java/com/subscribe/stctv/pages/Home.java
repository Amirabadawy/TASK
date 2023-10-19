package com.subscribe.stctv.pages;

import org.openqa.selenium.By;

import java.util.Arrays;
import java.util.List;

public class Home extends BasePage{
    private final By countryName = By.id("country-name");
    private final By litePlan = By.id("name-lite");
    private final By classicPlan = By.id("name-classic");
    private final By premiumPlan = By.id("name-premium");
    private final By liteCurrency = By.xpath("//*[@id= \"currency-lite\"]/i");
    private final By litePrice = By.id("currency-lite");
    private final By classicPrice = By.id("currency-classic");
    private final By classicCurrency = By.xpath("//*[@id='currency-classic']/i");
    private final By premiumPrice = By.id("currency-premium");
    private final By arrow = By.id("arrow");
    private final By Bahrain = By.id("bh");
    private final By KSA = By.id("sa");
    private final By Kuwait = By.id("kw");

    public void clickOnArrow(){
        waitUntilElementUntilIsClickable(arrow).click();
    }

    public void clickOnBahrain(){
        waitUntilElementUntilIsClickable(Bahrain).click();
    }

    public void clickOnKuwait(){
        waitUntilElementUntilIsClickable(Kuwait).click();
    }
    public String getCountryName() {
        return getElementText(countryName);
    }

    public String getLitePlan() {
        return getElementText(litePlan);
    }

    public String getLitePrice() {
        return getElementText(litePrice);
    }

    public String getClassicPlan() {
        return getElementText(classicPlan);
    }

    public String getClassicPrice() {
        return getElementText(classicPrice);
    }
    public String getPremiumPlan() {
        return getElementText(premiumPlan);
    }
    public String getPremiumPrice() {
        return getElementText(premiumPrice);
    }

    public List<String> getPrice(String planPrice) {
        String[] strParts= null;
        List<String> list = null;
//        strParts = planPrice.split("[SAR,/,month]");
        strParts = planPrice.split("[SAR |/|[ | ] |month]");
        list = Arrays.asList(strParts);
        return list;
    }

}
