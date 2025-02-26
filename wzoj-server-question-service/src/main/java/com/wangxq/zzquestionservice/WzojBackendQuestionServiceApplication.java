package com.wangxq.zzquestionservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.wangxq.zzquestionservice.mapper")
@EnableScheduling
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@ComponentScan("com.wangxq")
@EnableDiscoveryClient
@EnableFeignClients(basePackages = {"com.wangxq.zzserviceclient.service"})
public class WzojBackendQuestionServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(WzojBackendQuestionServiceApplication.class, args);
    }

}
