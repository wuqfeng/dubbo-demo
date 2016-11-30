package com.git.wuqf.dubbo.demo.tomcat.consumer;

import com.alibaba.dubbo.common.URL;
import com.alibaba.dubbo.rpc.RpcContext;
import com.git.wuqf.dubbo.demo.api.DemoService;
import com.git.wuqf.dubbo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by wuqf on 16-11-17.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/user")
    public @ResponseBody
    User updateUser(){
        User user=new User(1,"wuqf",4);
        user= demoService.updateUserInfo(user);
        boolean isConsumerSide = RpcContext.getContext().isConsumerSide();
        String serverPort=RpcContext.getContext().getRemoteAddressString();
        List<URL> application=RpcContext.getContext().getUrls();
        return user;
    }
}
