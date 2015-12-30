package com.jyj.dubbo.demo.controller;

import com.jyj.dubbo.demo.service.DemoService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

/**
 * Created by george on 12/30/15.
 */
@RestController
public class DubboDemoEndpoint {

    private static Logger LOG = LoggerFactory.getLogger(DubboDemoEndpoint.class);

    @Autowired
    private DemoService demoService;

    @RequestMapping("/hello")
    public String sayHello() {
        String result = demoService.sayHello("World" + new Random(System.currentTimeMillis()).nextInt());
        LOG.info(result);
        return result;
    }
}
