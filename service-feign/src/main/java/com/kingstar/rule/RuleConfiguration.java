package com.kingstar.rule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description 自定负载均衡规则,默认是轮训
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/18 17:34
 */
@Configuration
public class RuleConfiguration {
    @Bean
    public IRule myRule(){
        return new AnyTimesRoundRobinRule();        //随机
    }
}
