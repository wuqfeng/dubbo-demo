package com.git.wuqf.dubbo.demo.provider;

import com.alibaba.dubbo.config.annotation.Service;
import com.git.wuqf.dubbo.demo.api.DemoService;

/**
 * Created by wuqf on 16-11-13.
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService{

    public String sayHello(String name) {
        return "hello world ,hello "+name+".";
    }
}
