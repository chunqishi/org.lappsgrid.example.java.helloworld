package org.lappsgrid.example;

public class HelloWorld implements IHello {

    public String hello(String name) {
        return "Hello World! Hello " + name + "!";
    }
}