package com.jobsuggestbackend.application.User;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.boot.web.servlet.FilterRegistrationBean;

@Configuration
public class FilterConfig {

    @Bean
    public FilterRegistrationBean<UserContextCleanupFilter> userContextCleanupFilter() {
        FilterRegistrationBean<UserContextCleanupFilter> registrationBean = new FilterRegistrationBean<>();

        registrationBean.setFilter(new UserContextCleanupFilter());
        registrationBean.addUrlPatterns("/*"); // Apply to all URLs
        registrationBean.setOrder(1);          // Set filter order if multiple filters

        return registrationBean;
    }
}

