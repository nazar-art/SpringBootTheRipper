package com.example.demo.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class ProdNotificationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private NotificationProp notificationProp;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent contextRefreshedEvent) {
        notificationProp.getMails().forEach(System.out::println);
    }
}
