package com.git.wuqf.dubbo.demo.tomcat.consumer;

import com.git.wuqf.dubbo.demo.api.DemoService;
import com.git.wuqf.dubbo.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by wuqf on 16-11-17.
 */
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private DemoService demoService;


    public User updateUser(User user){
        return demoService.updateUserInfo(user);
    }
}
