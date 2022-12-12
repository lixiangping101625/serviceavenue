package com.hlkj;

import com.hlkj.pojo.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年12月12日 17:38
 * @decription:
 */
@RequestMapping("user-api")
public interface UserService {


    @GetMapping("listAll")
    List<User> listAll();

}
