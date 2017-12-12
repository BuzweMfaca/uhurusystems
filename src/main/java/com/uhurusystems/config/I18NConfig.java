package com.uhurusystems.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ReloadableResourceBundleMessageSource;

@Configuration
public class I18NConfig {

    @Bean
    public ReloadableResourceBundleMessageSource messageSource(){
        ReloadableResourceBundleMessageSource resesourceBundleMessageSource = new ReloadableResourceBundleMessageSource();
        resesourceBundleMessageSource.setBasename("classpath:i18n/messages");
        // Check for new messages every 30 minutes
        resesourceBundleMessageSource.setCacheSeconds(1800);
        return resesourceBundleMessageSource;

    }
}
