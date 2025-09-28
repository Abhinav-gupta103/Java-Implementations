package com.example.demo.components;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class Test implements InitializingBean, DisposableBean {
    public void init() throws Exception {
        System.out.println("init method");
    }

    public void detroy() throws Exception {
        System.out.println("Destroy Method");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destroy method from DisposableBean");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("init method from InitializingBean");
    }

    @PostConstruct
    public void postContruct() throws Exception {
        System.out.println("init method from postContruct annotation");
    }

    @PreDestroy
    public void preDestroy() throws Exception {
        System.out.println("destroy method from preDestroy method");
    }
}
