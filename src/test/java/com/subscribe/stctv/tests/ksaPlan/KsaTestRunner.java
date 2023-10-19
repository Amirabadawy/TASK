package com.subscribe.stctv.tests.ksaPlan;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features = "C:\\Users\\Amira\\IdeaProjects\\stc-tv\\src\\test\\java\\com\\subscribe\\stctv\\tests\\ksaPlan\\KSAPlan.feature",
        glue = {"com/stctv/subscribe/tests"},
        plugin = {"pretty","html:reports/KSAPlans-Report.html"},
        monochrome = true
)
public class KsaTestRunner extends AbstractTestNGCucumberTests {
}
