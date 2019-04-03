package com.kingstar.serviceribbon.controller;

import com.kingstar.serviceribbon.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/13 14:42
 */
@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hello")
    public String soaCall(@RequestParam(value = "name") String name){
        return ribbonService.call(name);
    }
}
