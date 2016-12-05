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
}
