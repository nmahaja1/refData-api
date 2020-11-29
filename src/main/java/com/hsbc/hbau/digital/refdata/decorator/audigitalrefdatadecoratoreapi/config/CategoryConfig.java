package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@ConfigurationProperties("categorycode")
public class CategoryConfig {
    private List<Property> property;

    public List<Property> getProperty() {
        return property;
    }

    public void setProperty(List<Property> property) {
        this.property = property;
    }
}

