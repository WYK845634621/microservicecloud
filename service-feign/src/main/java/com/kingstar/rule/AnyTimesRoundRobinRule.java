package com.kingstar.rule;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.AbstractLoadBalancerRule;
import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.Server;
import org.springframework.beans.factory.annotation.Value;

import java.util.List;

/**
 * @Description     轮询并且五次
 * @Tips
 * @Author yikai.wang
 * @Date 2019/3/19 9:13
 */
public class AnyTimesRoundRobinRule extends AbstractLoadBalancerRule {

    @Value("${RoundRobinTimes}")
    private int roundRobinTimes;
    private int index = 0;
    private int count = 0;

    @SuppressWarnings({"RCN_REDUNDANT_NULLCHECK_OF_NULL_VALUE"})
    public Server choose(ILoadBalancer lb, Object key) {
        if (lb == null) {
            return null;
        } else {
            Server server = null;

            while(server == null) {
                if (Thread.interrupted()) {
                    return null;
                }

                List<Server> upList = lb.getReachableServers();
                List<Server> allList = lb.getAllServers();
                int serverCount = allList.size();
                if (serverCount == 0) {
                    return null;
                }

//                int index = this.rand.nextInt(serverCount);
//                server = (Server)upList.get(index);

                //轮循五次
                if (count < roundRobinTimes){
                    server = upList.get(index);
                    count++;
                }else {
                    index++;
                    count = 0;
                    if (index >= upList.size()){
                        index = 0;
                    }
                    server = upList.get(index);
                }


                if (server == null) {
                    Thread.yield();
                } else {
                    if (server.isAlive()) {
                        return server;
                    }

                    server = null;
                    Thread.yield();
                }
            }

            return server;
        }
    }

    @Override
    public Server choose(Object key) {
        return this.choose(this.getLoadBalancer(), key);
    }

    @Override
    public void initWithNiwsConfig(IClientConfig clientConfig) {
    }
}
