package com.hlkj.service;

import com.hlkj.UserService;
import com.hlkj.user.mapper.UserMapper;
import com.hlkj.pojo.User;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年12月12日 17:41
 * @decription:
 */
@RestController
public class UserServiceImpl implements UserService {


    @Resource
    private UserMapper userMapper;

    @Override
    public List<User> listAll() {
        List<User> list = userMapper.list();
        return list;
    }

    @Override
    public User detail(@RequestParam(name = "userId") Long userId) {
        return userMapper.getDetail(userId);
    }
}
