package com.atguigu.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContextConfig
 * @Description TODO
 * @Author Rwenjie
 * @Date 2021/1/18 20:37
 **/

@Configuration
public class ApplicationContextConfig {

    //applicationContext.xml <bean id="" class="">
    @Bean
    @LoadBalanced //使用LoadBalanced注解赋予RestTemplate负载均衡能力
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
