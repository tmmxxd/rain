package priv.zg.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * 树形结构vo对象
 *
 * @author tsz
 * @date 2021/11/5
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class EasyUiTree implements Serializable {

    private static final long serialVersionUID = -3374824151482249728L;
    /**
     * 节点id信息
     */
    private Long id;
    /**
     * 节点名称
     */
    private String text;
    /**
     * 节点状态  open/closed
     */
    private String state;
}
