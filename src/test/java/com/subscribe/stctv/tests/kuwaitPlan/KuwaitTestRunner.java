package com.subscribe.stctv.tests.kuwaitPlan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\stc-tv\\src\\test\\java\\com\\subscribe\\stctv\\tests\\kuwaitPlan\\KuwaitPlan.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/KuwaitPlans-Report.html"},
        monochrome = true
)
public class KuwaitTestRunner extends AbstractTestNGCucumberTests {
}
