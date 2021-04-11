package com.springhow.examples.springbootfailureanalyzers;

import org.springframework.stereotype.Service;

@Service
public class HelloService {

    public HelloService() {
        throw new MyCustomApplicationException();
    }

    public String hello() {
        return "Hello There...!";
    }
}
