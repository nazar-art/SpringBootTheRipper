package com.example.demo;

import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

public class ProfileSentinelApplicationInitializer implements ApplicationContextInitializer {
    @Override
    public void initialize(ConfigurableApplicationContext configurableApplicationContext) {
        if (configurableApplicationContext.getEnvironment().getActiveProfiles().length == 0) {
            throw new IllegalStateException("You can not work without any Profiles !!!");
        }
    }
}
