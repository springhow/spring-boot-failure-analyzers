package com.springhow.examples.springbootfailureanalyzers;

public class MyCustomApplicationException extends RuntimeException {

    public MyCustomApplicationException(){
        super("I Like to Break Things!");
    }

}
