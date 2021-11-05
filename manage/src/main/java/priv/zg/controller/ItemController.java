package priv.zg.controller;

import org.springframework.stereotype.Controller;

import priv.zg.service.ItemService;

import javax.annotation.Resource;

/**
 * 商品服务
 *
 * @author tsz
 * @date 2021/11/05
 */
@Controller
public class ItemController {

    @Resource
    private ItemService itemService;


}
