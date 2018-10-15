package com.jascola.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(DataProperties.class)
@ConditionalOnClass(DataService.class)
@ConditionalOnProperty(prefix = "data",value = "enabled",matchIfMissing = true)
public class DataServiceConfiguration {
    @Autowired
    private DataProperties dataProperties;

    @Bean
    @ConditionalOnMissingBean(DataService.class)
    public DataService service(){
        DataService service = new DataService();
        service.setMsg(dataProperties.getMsg());
        return service;
    }
}
