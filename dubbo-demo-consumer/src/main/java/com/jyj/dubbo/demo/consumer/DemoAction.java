package com.jyj.dubbo.demo.consumer;

import com.jyj.dubbo.demo.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

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
            Random random = new Random(System.currentTimeMillis());
            int randomInt = random.nextInt();
            String result = "";
            if (randomInt % 2 == 0) {
                result = demoService.sayHello("World" + i);
            } else {
                result = demoService.doWork(randomInt);
            }
            System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + result);
            Thread.sleep(100);

        }
    }

    public DemoService getDemoService() {
        return demoService;
    }

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }
}
