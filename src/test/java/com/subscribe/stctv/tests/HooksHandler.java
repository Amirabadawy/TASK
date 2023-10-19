package com.subscribe.stctv.tests;

import com.subscribe.stctv.driver.Driver;
import com.subscribe.stctv.read_properties.ReadProperties;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

import static com.subscribe.stctv.driver.Driver.initDriver;
import static com.subscribe.stctv.driver.Driver.setMaximizeBrowser;

public class HooksHandler extends BaseTest{
    public static String getBrowserName() throws IOException {
        return ReadProperties.setStcTVConfig().getProperty("browserName");
    }

    @BeforeTest(alwaysRun = true)
    protected void setUp() throws IOException {
        initDriver(getBrowserName());
        setMaximizeBrowser();
    }

    @AfterTest(alwaysRun = true)
    public void close() {
        Driver.closeDriver();
    }
}
