package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.service;

import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config.CategoryConfig;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config.Property;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.exception.PropertyNotFoundException;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.model.ReferenceData;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.util.CategoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
public class RefDataService {
    @Autowired
    private CategoryConfig categoryConfig;
    @Autowired
    private RestTemplate restTemplate;

    public ReferenceData getStaticReferenceData(String category) throws Exception {
        List<Property> properties = categoryConfig.getProperty();
        String url = "";
        Property property = properties.stream()
                .filter(prop -> prop.getName().toUpperCase().equalsIgnoreCase(category))
                .findFirst()
                .orElseThrow(() -> new PropertyNotFoundException(category + " Not Found"));
        if(property.getType().equalsIgnoreCase(CategoryType.STATIC.name())) {
            url = "https://devcluster.api.p2g.netd2.hsbc.com.hk/au-digital-static-refdata-eapi-sct-proxy/v1/isocountrycode/pub";
        }
        return restTemplate.getForObject(url, ReferenceData.class);
    }
}
