package com.demo.spring.controllers;

import com.demo.spring.TestBean;
import com.demo.spring.config.MailConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@PropertySource("classpath:custom.properties")
/*
* @PropertySource
* Get value from custom properties file
* */

//@Scope("prototype")
/*
* request
* session
* prototype
* singleton
* */
public class TestController {
    public TestController() {
        System.out.println("Testtttt Controller");
    }

    @Autowired
    private TestBean mybean;

    /*
    * Value
    * Get value from application.properties
    * */
//    @Value("${mail.froms}")
//    private String from;
//    @Value("${mail.hosts}")
//    private String host;
//    @Value("${mail.ports}")
//    private String port;
//
//    @Autowired
//    MailConfig config;

    @GetMapping("/")
    public String Get() {
        mybean.test();
//        System.out.println(from);
//        System.out.println(host);
//        System.out.println(port);
//        System.out.println(config);
        return "";
    }
}
