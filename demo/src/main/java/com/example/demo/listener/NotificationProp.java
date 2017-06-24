package com.example.demo.listener;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@Data
@ConfigurationProperties(prefix = "prod")
public class NotificationProp {

    private List<String> mails;

    private boolean notification;
}
