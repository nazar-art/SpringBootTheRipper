package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.env.EnvironmentPostProcessor;
import org.springframework.core.env.ConfigurableEnvironment;

public class DevProfilerResolverEnvironmentPostProcessor implements EnvironmentPostProcessor {

    @Override
    public void postProcessEnvironment(ConfigurableEnvironment configurableEnvironment, SpringApplication springApplication) {
        if (configurableEnvironment.getActiveProfiles().length == 0) {
            if (System.getenv().get("OS").contains("Windows")) {
                configurableEnvironment.addActiveProfile("DEV");
            }
        }
    }
}
