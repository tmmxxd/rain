package priv.zg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.stereotype.Service;
import priv.zg.mapper.ItemCatMapper;
import priv.zg.pojo.ItemCat;
import priv.zg.service.ItemCatService;
import priv.zg.vo.EasyUiTree;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类服务
 *
 * @author tsz
 * @date 2021/11/5
 */
@Service
public class ItemCatServiceImpl implements ItemCatService {

    @Resource
    private ItemCatMapper itemCatMapper;

    @Override
    public String findItemCatNameById(Long itemCatId) {
        return itemCatMapper.selectById(itemCatId).getName();
    }

    /**
     * 查询结果是VO对象
     * 问题:VO中的数据信息从哪里来?
     * 数据来源: VO的数据应该从数据库记录中转化而来.
     *
     * @param parentId 父id
     * @return {@link List}<{@link EasyUiTree}>
     */
    @Override
    public List<EasyUiTree> findItemCatListByParentId(Long parentId) {
        //1.动态获取数据库记录信息
        List<ItemCat> itemCatList = this.selectItemCatListByParentId(parentId);
        //2.定义空的VOList信息
        List<EasyUiTree> treeList = new ArrayList<>(itemCatList.size());
        //3.将itemCat对象转化为EasyUITree对象
        for (ItemCat itemCat : itemCatList) {
            Long id = itemCat.getId();
            String text = itemCat.getName();
            //如果是父级则closed,否则open
            String state = itemCat.getIsParent() ? "closed" : "open";
            EasyUiTree uiTree = new EasyUiTree(id, text, state);
            treeList.add(uiTree);
        }
        return treeList;
    }

    /**
     * 根据父级id查询所有子分类
     *
     * @param parentId 父id
     * @return {@link List}<{@link ItemCat}>
     */
    private List<ItemCat> selectItemCatListByParentId(Long parentId) {
        QueryWrapper<ItemCat> queryWrapper = new QueryWrapper<>();
        //(字段信息,查询的值)
        queryWrapper.eq("parent_id", parentId);
        return itemCatMapper.selectList(queryWrapper);
    }
}
