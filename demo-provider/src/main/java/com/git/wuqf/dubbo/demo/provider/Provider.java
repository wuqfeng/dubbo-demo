package com.git.wuqf.dubbo.demo.provider;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by wuqf on 16-11-13.
 */
public class Provider {
    public static void main(String[] args) throws Exception {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:dubbo-provider.xml"});
        context.start();

        System.out.println("新浪微博：疯狂的杨中仁.");

        System.in.read(); // 按任意键退出
    }
}
