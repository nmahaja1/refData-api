package com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi;

import com.hsbc.hbau.digital.refdata.decorator.audigitalrefdatadecoratoreapi.config.CategoryConfig;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@Configuration
public class AuDigitalRefdataDecoratorEapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuDigitalRefdataDecoratorEapiApplication.class, args);
	}

	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}

//	@Bean
//	public CategoryConfig categoryConfig(){
//		return new CategoryConfig();
//	}

}
