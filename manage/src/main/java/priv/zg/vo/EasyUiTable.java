package priv.zg.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import priv.zg.pojo.Item;

import java.io.Serializable;
import java.util.List;

/**
 * 封装vo对象
 *
 * @author tsz
 * @date 2021/11/5
 */
@Data
@Accessors(chain = true)
@NoArgsConstructor
@AllArgsConstructor
public class EasyUiTable implements Serializable {
    /**
     * 序列号作用:
     * 对象在进行网络传输的过程中,必须实现序列号的接口.
     * 原理:
     * 对象需要传输时,需要转化为字节数组
     * <p>
     * 用途:
     * 1.VO最终形成String字符串(JSON串).  可以不序列号
     * 2.VO对象的传递			 必须序列号
     */
    private static final long serialVersionUID = 2579697189705714713L;

    /**
     * 表示记录总数
     */
    private Long total;
    /**
     * 每页的数据
     */
    private List<Item> rows;
}
