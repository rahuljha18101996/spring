package com.demo.spring;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
public class TestBean {
    public TestBean() {
        System.out.println("Eager Loading");
    }

    public void test() {
        System.out.println("Test Method");
    }
}
