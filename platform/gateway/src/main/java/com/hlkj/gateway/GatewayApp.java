package com.hlkj.gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author Lixiangping
 * @createTime 2022年11月13日 23:09
 * @decription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class GatewayApp {

    public static void main(String[] args) {
        SpringApplication.run(GatewayApp.class, args);
    }

}
