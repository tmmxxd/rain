package priv.zg.service;

import priv.zg.vo.EasyUiTree;

import java.util.List;

/**
 * 商品分类服务
 *
 * @author tsz
 * @date 2021/11/5
 */
public interface ItemCatService {

    /**
     * 根据分类id查询分类名称
     *
     * @param itemCatId 分类id
     * @return {@link String}
     */
    String findItemCatNameById(Long itemCatId);

    /**
     * 根据父级id查询所有子分类
     *
     * @param parentId 父id
     * @return {@link List}<{@link EasyUiTree}>
     */
    List<EasyUiTree> findItemCatListByParentId(Long parentId);
}
