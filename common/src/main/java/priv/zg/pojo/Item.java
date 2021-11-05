package priv.zg.pojo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;


/**
 * 商品实体类
 * {@code @JsonIgnoreProperties(ignoreUnknown = true)}表示JSON转化时忽略未知属性
 *
 * @author tsz
 * @date 2021/11/05
 */
@Data
@TableName("tb_item")
@Accessors(chain = true)
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Item extends BasePojo {

    /**
     * 商品id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 商品标题
     */
    private String title;
    /**
     * 商品卖点信息
     */
    private String sellPoint;
    /**
     * 商品价格 Long > dubbo
     */
    private Long price;
    /**
     * 商品数量
     */
    private Integer num;
    /**
     * 条形码
     */
    private String barcode;
    /**
     * 商品图片信息   1.jpg,2.jpg,3.jpg
     */
    private String image;
    /**
     * 表示商品的分类id
     */
    private Long cid;
    /**
     * 1正常，2下架
     */
    private Integer status;

    /**
     * 为了满足页面调用需求,添加get方法
     *
     * @return {@link String[]}
     */
    public String[] getImages() {

        return image.split(",");
    }
}
