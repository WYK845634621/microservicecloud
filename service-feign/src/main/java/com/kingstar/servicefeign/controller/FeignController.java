package com.kingstar.servicefeign.controller;

import com.kingstar.eurkaclient.entity.Indicator;
import com.kingstar.servicefeign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description 客户端
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/13 16:04
 */
@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;  //无视报错

    @GetMapping(value = "/hello")
    public String callByFeign(@RequestParam(value = "name") String name){
        return feignService.callByFeign(name);
    }

    @PostMapping(value = "/getAll")
    public List<Indicator> callByFeignGetAll(){
        return feignService.callByFeignGetAll();
    }
}
