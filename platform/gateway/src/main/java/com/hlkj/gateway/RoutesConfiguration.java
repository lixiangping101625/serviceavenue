package com.hlkj.gateway;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;

/**
 * @author Lixiangping
 * @createTime 2022年11月13日 23:13
 * @decription:
 */
@Configuration
public class RoutesConfiguration {

    @Bean
    @Order
    public RouteLocator routes(RouteLocatorBuilder builder){
        return builder.routes()
                //用户微服务路由
                .route("user-service-route", r -> r.path("/user/**")
//                        .filters(f -> f.filter(authFilter))
                        .uri("lb://domain-user-service"))
                .route("item-service-route", r -> r.path("/item/**")
                        .uri("lb://domain-item-service"))
                .build();
    }

}
