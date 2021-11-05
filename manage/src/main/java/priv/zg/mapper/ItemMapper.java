package priv.zg.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Select;
import priv.zg.pojo.Item;

import java.util.List;

/**
 * 商品mapper
 *
 * @author tsz
 * @date 2021/11/05
 */
public interface ItemMapper extends BaseMapper<Item> {

    /**
     * 商品列表分页
     * 默认分页的排序规则 Id由小到大的方式排列,后台商品维护系统
     * 一定不会频繁维护之前旧商品, 应该按照更新时间进行降序排列
     *
     * @param start 开始
     * @param rows  行
     * @return {@link List}<{@link Item}>
     */
    @Select("SELECT * FROM tb_item ORDER BY updated DESC LIMIT #{start},#{rows}")
    List<Item> findItemByPage(Integer start, Integer rows);
}
