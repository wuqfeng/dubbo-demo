package com.git.wuqf;

import com.alibaba.dubbo.config.annotation.Reference;
import com.git.wuqf.dubbo.demo.api.DemoService;
import com.git.wuqf.dubbo.demo.model.User;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by wuqf on 16-11-13.
 */
@Component
public class DemoAction {

    @Reference
    private DemoService demoService;

    public void setDemoService(DemoService demoService) {
        this.demoService = demoService;
    }

    public void start() throws Exception {
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            try {
                String hello = demoService.sayHello("world" + i);
                System.out.println("[" + new SimpleDateFormat("HH:mm:ss").format(new Date()) + "] " + hello);
                User user=new User(i,"wuqf",11);
                user= demoService.updateUserInfo(user);
                System.out.print(user.toString());
            } catch (Exception e) {
                e.printStackTrace();
            }
            Thread.sleep(2000);
        }
    }
}
