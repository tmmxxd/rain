package priv.zg.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import priv.zg.service.ItemService;
import priv.zg.vo.EasyUiTable;

import javax.annotation.Resource;

/**
 * 商品服务
 *
 * @author tsz
 * @date 2021/11/05
 */
@RestController
@RequestMapping("/item")
public class ItemController {

    @Resource
    private ItemService itemService;

    /**
     * url:http://localhost:8091/item/query?page=1&rows=50
     * args: 1.page=1 页数   2.rows 行数
     * 返回值: EasyUITable对象
     */
    @RequestMapping("/query")
    public EasyUiTable findItemByPage(Integer page, Integer rows) {
        return itemService.findItemByPage(page, rows);
    }
}
