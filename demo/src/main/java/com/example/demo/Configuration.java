package com.example.demo;

import com.example.demo.listener.NotificationProp;
import com.example.demo.listener.ProdNotificationListener;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@EnableConfigurationProperties(NotificationProp.class)
public class Configuration {
    @Bean
    @Profile("PROD")
    @ConditionalOnMissingBean(name = "prodNotificationListener")
    @ConditionalOnProperty(name = "prod.notification", matchIfMissing = true, havingValue = "true")
    public ProdNotificationListener listener() {
        return new ProdNotificationListener();
    }
}
