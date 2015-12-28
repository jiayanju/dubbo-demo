package com.jyj.dubbo.demo.main;

import com.jyj.dubbo.demo.consumer.DemoAction;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by george on 12/28/15.
 */
public class ConsumerBootstrap {
    public static void main(String [] args) throws Exception {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("dubbo-demo-consumer.xml");
        applicationContext.start();

        System.out.println("Consumer started...");

        DemoAction demoAction = (DemoAction) applicationContext.getBean("demoAction");
        String reply = demoAction.sayHello();
        System.out.println("reply from server: " + reply);

        demoAction.start();
    }
}
