package com.hlkj;

import com.hlkj.pojo.Order;
import com.hlkj.pojo.UnifyResponse;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 20:28
 * @decription:
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private OrderService orderService;

    @GetMapping("/listAll")
    public UnifyResponse listAll(){
        List<Order> orders = orderService.listAll();
        return UnifyResponse.buildSuccess(orders);
    }

    @GetMapping("/detail/{id}")
    public UnifyResponse detail(@PathVariable("id") Long id){
        Order order = orderService.detail(id);
        return UnifyResponse.buildSuccess(order);
    }

    @GetMapping("/delete")
    UnifyResponse delete(@RequestParam("id") Long id){
        return orderService.delete(id);
    }
}
