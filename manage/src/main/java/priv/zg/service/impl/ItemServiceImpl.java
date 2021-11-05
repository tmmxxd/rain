package priv.zg.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import org.springframework.stereotype.Service;

import priv.zg.mapper.ItemMapper;
import priv.zg.pojo.Item;
import priv.zg.service.ItemService;
import priv.zg.vo.EasyUiTable;

import javax.annotation.Resource;
import java.util.List;

/**
 * 商品服务impl
 *
 * @author tsz
 * @date 2021/11/05
 */
@Service
public class ItemServiceImpl implements ItemService {

    @Resource
    private ItemMapper itemMapper;


    @Override
    public EasyUiTable findItemByPage(Integer page, Integer rows) {
        Page<Item> mpPage = new Page<>(page, rows);
        //按照更新时间降序排列
        QueryWrapper<Item> queryWrapper = new QueryWrapper<>();
        queryWrapper.orderByDesc("updated");
        IPage<Item> iPage = itemMapper.selectPage(mpPage, queryWrapper);
        long total = iPage.getTotal();
        List<Item> itemList = iPage.getRecords(); //分页结果
        return new EasyUiTable(total, itemList);
    }
}
