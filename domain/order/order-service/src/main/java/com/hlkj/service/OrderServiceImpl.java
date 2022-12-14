package com.hlkj.service;

import com.hlkj.OrderService;
import com.hlkj.mapper.OrderMapper;
import com.hlkj.pojo.Order;
import com.hlkj.pojo.User;
import com.hlkj.service.feignclient.UserServiceFeignClient;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 20:22
 * @decription:
 */
@RestController
@Slf4j
public class OrderServiceImpl implements OrderService {

    @Resource
    private OrderMapper orderMapper;
    @Resource
    private UserServiceFeignClient userServiceFeignClient;

    @Override
    public List<Order> listAll() {
        return orderMapper.list();
    }

    @Override
    public Order detail(Long id) {
        Order order = orderMapper.getDetail(id);
        Long userId = order.getUserId();
        //feign 调用user服务
        User user = userServiceFeignClient.detail(id);
        User user2 = userServiceFeignClient.info(id);
        log.info("user -> {}", user);
        log.info("user2 -> {}", user2);
        return orderMapper.getDetail(id);
    }
}
