package com.kingstar.eurkaclient.web;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/13 14:19
 */
@Controller
public class TestController {

    @Value("${server.port}")
    private String port;
    @Value("${spring.application.name}")
    private String appName;

    @ResponseBody
    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "name") String name){
        return "this is from " + appName + ":" + port + ".....hello : " +name;
    }
}
