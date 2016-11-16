package com.git.wuqf.dubbo.demo.api;

import com.git.wuqf.dubbo.demo.model.User;

/**
 * Created by wuqf on 16-11-13.
 */
public interface DemoService {

    String sayHello(String name);
    User updateUserInfo(User user);
}
