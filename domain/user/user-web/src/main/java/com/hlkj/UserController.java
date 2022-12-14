package com.hlkj;

//import com.com.hlkj.domain.user.UserRegisterSwitch;
import com.hlkj.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

//import com.com.hlkj.sharedpojo.pojo.UnifyResponse;

/**
 * @author Lixiangping
 * @createTime 2022年10月17日 17:40
 * @decription:
 */
@RestController
@RequestMapping("/user")
@Api(value = "商品接口", tags = "用户信息展示相关接口")
@Slf4j
public class UserController {
    @Resource
    private UserService userService;

    @ApiOperation(value = "查询所有", tags = "查询所有用户信息")
    @GetMapping("/listAll")
    public List<User> list(){

        return userService.listAll();
    }
    @GetMapping("/info/{id}")
    public User info(@PathVariable(name = "id") Long id){
        return userService.detail(id);
    }

}
