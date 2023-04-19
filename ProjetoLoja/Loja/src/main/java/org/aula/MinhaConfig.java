package org.aula;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MinhaConfig{

    @Bean(name = "appName")
    public String applicationName(){
        return "Loja Virtual da Aula";
    }

    @Bean(name = "appID")
    public String applicationID(){
        return "ID = 123456789";
    }
}