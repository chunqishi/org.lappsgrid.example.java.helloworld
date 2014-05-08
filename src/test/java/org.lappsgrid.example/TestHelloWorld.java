package org.lappsgrid.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.After;
import org.junit.Before;
import org.lappsgrid.example.HelloWorld;


public class TestHelloWorld {

    HelloWorld hw = new HelloWorld();

    @Before
    public void setUp(){

    }

    @After
    public void tearDown(){

    }

    @Test
    public void test(){
        String res =  hw.hello("World");
        Assert.assertEquals("Wrong Format.", res, "Hello World! Hello World!");
    }
}