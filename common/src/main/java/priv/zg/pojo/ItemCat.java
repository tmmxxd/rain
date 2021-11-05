package priv.zg.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

/**
 * 编辑商品分类信息
 *
 * @author tsz
 * @date 2021/11/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@TableName("tb_item_cat")
public class ItemCat extends BasePojo {

    private static final long serialVersionUID = -8545814285854506950L;

    /**
     * 商品分类id号 设置主键并且自增
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 父级分类Id 如果有父子级关系,可以使用parentId进行关联
     */
    private Long parentId;
    /**
     * 名称
     */
    private String name;
    /**
     * 商品分类状态
     */
    private Integer status;
    /**
     * 排序号
     */
    private Integer sortOrder;
    /**
     * 是否为父级 tinyint 0 false /1 true
     */
    private Boolean isParent;

}
