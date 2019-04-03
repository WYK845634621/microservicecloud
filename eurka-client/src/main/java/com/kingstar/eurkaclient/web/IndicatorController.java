package com.kingstar.eurkaclient.web;


import com.kingstar.eurkaclient.entity.Indicator;
import com.kingstar.eurkaclient.service.IndicatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author yikai.wang
 * @since 2019-03-14
 */
@Controller
public class IndicatorController {

    @Autowired
    private IndicatorService indicatorService;

    @PostMapping("/all")
    @ResponseBody
    public List<Indicator> findAll(){
        return indicatorService.selectList(null);
    }
}

