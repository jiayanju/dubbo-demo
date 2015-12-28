package com.jyj.dubbo.demo.consumer;

import com.jyj.dubbo.demo.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by george on 12/28/15.
 */
public class DemoAction {

    private DemoService demoService;

    public String sayHello() {
        return demoService.sayHello();
    }

    public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String hello = demoService.sayHello("World" + i);
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
            Thread.sleep(1000);
        }
    }

    public DemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
