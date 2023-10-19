package com.subscribe.stctv.read_properties;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final String STCTV_CONFIG_PATH="src/main/java/stctv_config.properties";

    public static Properties setStcTVConfig() throws IOException {
        Properties configProperties = new Properties();
        FileInputStream inputStream = new FileInputStream(STCTV_CONFIG_PATH);
        configProperties.load(inputStream);
        return configProperties;
    }
}
