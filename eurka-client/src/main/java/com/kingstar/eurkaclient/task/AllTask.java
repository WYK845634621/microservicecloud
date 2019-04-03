package com.kingstar.eurkaclient.task;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Description
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/18 14:03
 */
@EnableScheduling
public class AllTask {
    @Scheduled(fixedRate = 60000)
    public void scheduledTask(){
        System.out.println("============================this is task========================");
    }
}
