package com.git.wuqf.dubbo.demo.provider;

import com.git.wuqf.dubbo.demo.api.DemoService;

/**
 * Created by wuqf on 16-11-13.
 */
public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "hello world ,hello "+name+".";
    }
}
