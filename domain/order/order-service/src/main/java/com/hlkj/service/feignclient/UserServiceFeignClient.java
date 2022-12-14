package com.hlkj.service.feignclient;

import com.hlkj.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年12月14日 17:19
 * @decription:
 */
@FeignClient(name = "domain-user-service")
public interface UserServiceFeignClient {

    @GetMapping("/user/listAll")
    List<User> listAll();

    @GetMapping("/user-api/detail")
    User detail(@RequestParam(name = "userId") Long userId);

    @GetMapping("/user/info/{id}")
    User info(@PathVariable(name = "id") Long id);

}
