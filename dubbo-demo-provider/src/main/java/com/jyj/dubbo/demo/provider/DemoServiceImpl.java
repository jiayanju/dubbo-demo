package com.jyj.dubbo.demo.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.jyj.dubbo.demo.service.DemoService;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by george on 12/28/15.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello() {
        return "Hello Dubbo";
    }

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "], Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddressString());
        return "Hello " + name + ", response from provider: " + RpcContext.getContext().getLocalAddressString();
    }

    public String doWork(Integer number) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "], Call doWork, request from consumer: " + RpcContext.getContext().getRemoteAddressString());
        long sum = 0;
        for (int i = 0; i < number; i++) {
            sum += number;
        }
        return "doWork, sum " + sum + ", response from provider: " + RpcContext.getContext().getLocalAddressString();
    }
}
