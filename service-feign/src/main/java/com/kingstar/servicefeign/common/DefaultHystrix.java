package com.kingstar.servicefeign.common;

import com.kingstar.eurkaclient.entity.Indicator;
import com.kingstar.servicefeign.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/15 10:05
 */
@Component
public class DefaultHystrix implements FeignService {       //实现所要容错的类
    @Override
    public String callByFeign(String name) {
        return "Feign端容错,抱歉" + name;
    }

    @Override
    public List<Indicator> callByFeignGetAll() {
        return null;
    }
}
