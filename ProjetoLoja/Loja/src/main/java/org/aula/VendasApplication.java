package org.aula;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VendasApplication {
    @Autowired

    @Qualifier("appID")
    private String appID;

    @Qualifier("appName")
    private String appName;

    @GetMapping("/hello")
    public String helloWorld(){
        return "TESTE " + appName + " e TESTE " + appID;
    }

    public static void main(String[] args) {


        SpringApplication.run(VendasApplication.class, args);
    }

}