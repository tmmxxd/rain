package priv.zg.pojo;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * pojo基类，完成2个任务，2个日期，实现序列化
 *
 * @author tsz
 * @date 2021/11/05
 */
@Data
@Accessors(chain = true)
public class BasePojo implements Serializable {
    private Date created;
    private Date updated;

}
