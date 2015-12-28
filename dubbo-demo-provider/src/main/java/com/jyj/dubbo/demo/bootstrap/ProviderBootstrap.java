package com.jyj.dubbo.demo.bootstrap;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by george on 12/28/15.
 */
public class ProviderBootstrap {
    public static void main(String [] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-demo-provider.xml");
        applicationContext.start();

        System.out.println("Provider started...");
        System.in.read();
    }
}
