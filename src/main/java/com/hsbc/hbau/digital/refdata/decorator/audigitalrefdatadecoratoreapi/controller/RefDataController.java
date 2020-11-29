package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.controller;

import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config.Property;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config.CategoryConfig;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.exception.PropertyNotFoundException;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.model.ReferenceData;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.service.RefDataService;
import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.util.CategoryType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@RestController
public class RefDataController {
    @Autowired
    private RefDataService refDataService;

    @GetMapping(value = "/{category}")
    public ResponseEntity fetchReferenceData(@PathVariable String category) {
        ReferenceData result = null;
        try {
            result = refDataService.getStaticReferenceData(category);
        } catch (Exception e) {
            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(e.getMessage());
        }

        return ResponseEntity.ok(result);
    }
}
