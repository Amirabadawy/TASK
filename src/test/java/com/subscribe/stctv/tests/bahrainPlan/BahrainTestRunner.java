package com.subscribe.stctv.tests.bahrainPlan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\stc-tv\\src\\test\\java\\com\\subscribe\\stctv\\tests\\bahrainPlan\\BahrainPlan.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/BahrainPlans-Report.html"},
        monochrome = true
)
public class BahrainTestRunner extends AbstractTestNGCucumberTests {
}
