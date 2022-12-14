package com.hlkj.mapper;

import com.hlkj.common.mapper.MyMapper;
import com.hlkj.pojo.Order;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 20:11
 * @decription:
 */
public interface OrderMapper extends MyMapper<Order> {

    List<Order> list();
    Order getDetail(@Param("id") Long id);

}
