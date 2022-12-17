package com.hlkj;

import com.hlkj.pojo.Order;
import com.hlkj.pojo.UnifyResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 20:19
 * @decription:
 */
@RequestMapping("order-api")
public interface OrderService {

    @GetMapping("listAll")
    List<Order> listAll();

    @GetMapping("detail")
    Order detail(@RequestParam("id") Long id);

    @GetMapping("delete")
    UnifyResponse delete(@RequestParam("id") Long id);

}
