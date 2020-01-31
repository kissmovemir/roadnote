package com.roadnote.roadnote;

import com.roadnote.roadnote.conf.ProjectConf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 测试控制器
 *
 * @author: @我没有三颗心脏
 * @create: 2018-05-08-下午 16:46
 */
@RestController
public class HelloController {

    @Autowired
    private ProjectConf conf;
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("12121321");
        return "Hello Road Note!   " + conf.getName() + " : " + conf.getAge();
    }
}
