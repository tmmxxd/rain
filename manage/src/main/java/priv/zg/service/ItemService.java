package priv.zg.service;

import priv.zg.vo.EasyUiTable;

/**
 * 商品服务
 *
 * @author tsz
 * @date 2021/11/05
 */
public interface ItemService {

    /**
     * 商品分页查询
     *
     * @param page 页面
     * @param rows 行
     * @return {@link EasyUiTable}
     */
    EasyUiTable findItemByPage(Integer page, Integer rows);
}
