package com.hlkj;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 23:08
 * @decription:
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan(basePackages = "com.hlkj.mapper")
public class ItemApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(ItemApplication.class)
                .web(WebApplicationType.SERVLET)
                .run(args);
    }
}
