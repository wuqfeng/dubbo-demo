package com.git.wuqf.dubbo.demo.tomcat.provider;

import com.alibaba.dubbo.rpc.RpcContext;
import com.git.wuqf.dubbo.demo.api.DemoService;
import com.git.wuqf.dubbo.demo.model.User;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wuqf on 16-11-13.
 */
public class DemoServiceImpl implements DemoService {

    public String sayHello(String name) {
        System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] Hello " + name + ", request from consumer: " + RpcContext.getContext().getRemoteAddress());
        return "Hello " + name + ", response form provider: " + RpcContext.getContext().getLocalAddress();
    }

    public User updateUserInfo(User user) {
        user.setName(user.getName()+" updated");
        user.setAge(user.getAge()+1);
        System.out.println("["+user.toString()+"]");
        return user;
    }
}
