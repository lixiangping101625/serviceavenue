package com.hlkj;

import com.hlkj.pojo.UnifyResponse;
import com.hlkj.pojo.User;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("detail")
    User detail(@RequestParam(name = "userId") Long userId);

    @PostMapping("/add")
    UnifyResponse save(@RequestBody User user);

    @GetMapping("delete")
    UnifyResponse delete(@RequestParam(name = "userId") Long userId);

}
