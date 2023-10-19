package com.subscribe.stctv.tests;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class PlansStepDefs extends BaseTest{

    @When("click on arrow button in home page")
    public void clickOnSearchButton(){
        browser.stcTv.home.clickOnArrow();
    }

    @When("click on Bahrain country in popUp")
    public void clickOnBahrainCountry(){
        browser.stcTv.home.clickOnBahrain();
    }

    @When("click on Kuwait country in popUp")
    public void clickOnKuwaitCountry(){
        browser.stcTv.home.clickOnKuwait();
    }

    @Then("country Name {string} should be displayed in home page")
    public void KSACountryShouldBeDisplayed(String countryName){
        Assert.assertEquals(browser.stcTv.home.getCountryName(),countryName);
    }

    @Then("plan type should be lite {string} in home page")
    public void planTypeShouldBeDisplayedLite(String planType){
        Assert.assertEquals(browser.stcTv.home.getLitePlan(), planType);
    }

    @Then("plan type should be classic {string} in home page")
    public void planTypeShouldBeDisplayedClassic(String planType){
        Assert.assertEquals(browser.stcTv.home.getClassicPlan(),planType);
    }

    @Then("plan type should be premium {string} in home page")
    public void planTypeShouldBeDisplayedPremium(String planType){
        Assert.assertEquals(browser.stcTv.home.getPremiumPlan(),planType);
    }


    @Then("price of lite plan should be {string} in home page")
    public void priceOfLitePlanShouldBe(String planPrice){
//        list = browser.stcTv.home.getPrice(browser.stcTv.home.getLitePrice().getText());
//        list.toString();
//        Assert.assertEquals(list, planPrice);
        Assert.assertTrue(browser.stcTv.home.getLitePrice().contains(planPrice));
    }

    @Then("currency should be {string} in home page")
    public void currencyShouldBe(String currency){
        Assert.assertTrue(browser.stcTv.home.getLitePrice().contains(currency));
    }

    @Then("price of classic plan should be {string} in home page")
    public void priceOfClassicPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTv.home.getClassicPrice().contains(planPrice));
    }

    @Then("price of premium plan should be {string} in home page")
    public void priceOfPremiumPlanShouldBe(String planPrice){
        Assert.assertTrue(browser.stcTv.home.getPremiumPrice().contains(planPrice));
    }
}
