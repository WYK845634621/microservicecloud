package com.kingstar.serviceribbon.service;

import com.netflix.discovery.converters.Auto;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/13 14:39
 */
@Service
public class RibbonService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "errorOccur")
    public String call(String name){
        return restTemplate.getForObject("http://EURKA-CLIENT/hello?name=" + name, String.class);
    }

    public String errorOccur(String name){
        return "抱歉," + name + ",仿佛出现了一个错误...i am sorry for that";
    }
}
