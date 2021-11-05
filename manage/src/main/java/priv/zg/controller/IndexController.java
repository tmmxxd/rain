package priv.zg.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * restful风格页面跳转
 *
 * @author tsz
 * @date 2021/11/05
 */
@Controller
public class IndexController {

    @RequestMapping("/page/{moduleName}")
    public String module(@PathVariable String moduleName) {
        return moduleName;
    }
}
