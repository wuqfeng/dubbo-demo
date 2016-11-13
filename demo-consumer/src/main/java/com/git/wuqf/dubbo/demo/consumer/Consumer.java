package com.git.wuqf.dubbo.demo.consumer;

import com.git.wuqf.dubbo.demo.api.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuqf on 16-11-13.
 */
public class Consumer {

    public static void main(String[] args){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("dubbo-consumer.xml");
        context.start();
        DemoService demoService=(DemoService) context.getBean("demoService");
        String hello=demoService.sayHello("wuqf");
        System.out.println(hello);
    }
}
