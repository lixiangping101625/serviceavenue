package com.hlkj.service;

import com.hlkj.ItemService;
import com.hlkj.mapper.ItemMapper;
import com.hlkj.pojo.Item;
import com.hlkj.pojo.UnifyResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author Lixiangping
 * @createTime 2022年10月31日 11:08
 * @decription:
 */
@RestController
@Slf4j
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;

    @Override
    @GetMapping("listAll")
    public UnifyResponse listAll() {
        log.info("called listAll function");
        List<Item> list = itemMapper.selectAll();
        return UnifyResponse.buildSuccess(list);
    }

    @Override
    @GetMapping("info")
    public UnifyResponse detail(@RequestParam("id") Long id) {
        return UnifyResponse.buildSuccess(itemMapper.getDetail(id));
    }
}
