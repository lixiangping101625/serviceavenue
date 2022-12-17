package com.hlkj.service;

import com.hlkj.UserService;
import com.hlkj.pojo.UnifyResponse;
import com.hlkj.user.mapper.UserMapper;
import com.hlkj.pojo.User;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
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
        log.info("查询优化详情");
        User user = userMapper.getDetail(userId);
        log.info("查询结果：user -> {}", user);
        return user;
    }

    @Override
    public UnifyResponse save(User user) {
        log.info("save user -> {}", user);
        int i = userMapper.insert(user);
        return i==1 ? UnifyResponse.buildSuccess():UnifyResponse.buildFailed("新增用户失败");
    }

    @Override
    public UnifyResponse delete(Long userId) {
        log.info("删除用户：userId -> {}", userId);
        int i = userMapper.deleteByPrimaryKey(userId);
        return i==1 ? UnifyResponse.buildSuccess():UnifyResponse.buildFailed("删除用户失败");
    }
}
