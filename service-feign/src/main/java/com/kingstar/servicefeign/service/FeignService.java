package com.kingstar.servicefeign.service;

import com.kingstar.eurkaclient.entity.Indicator;
import com.kingstar.servicefeign.common.DefaultHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


/**
 * @Description 面向接口
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/13 16:01
 */
@FeignClient(value = "eurka-client", fallback = DefaultHystrix.class)   //指定出错类
public interface FeignService {
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    String callByFeign(@RequestParam("name") String name);

    @RequestMapping(value = "/all",method = RequestMethod.POST)
    List<Indicator> callByFeignGetAll();
}
