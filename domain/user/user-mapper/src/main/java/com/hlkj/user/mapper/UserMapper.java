package com.hlkj.user.mapper;

import com.hlkj.common.mapper.MyMapper;
import com.hlkj.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

//import org.springframework.data.repository.query.Param;

/**
 * @author Lixiangping
 * @createTime 2022年10月17日 16:51
 * @decription:
 */
public interface UserMapper extends MyMapper<User> {

    List<User> list();

    User getDetail(@Param("id") Long id);

    User login(@Param("username") String username, @Param("password") String password);

}