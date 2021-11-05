package priv.zg.config;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 将给对象交给Spring容器管理之后,如果需要可以直接注入引用.
 * springBoot整合MybatisPlus时执行分页操作时,自动的完成注入
 * 前提是需要提前实例化对象
 * {@code @Configuration} 表示当前类是一个配置文件
 *
 * @author tsz
 * @date 2021/11/5
 */
@Configuration
public class MybatisPlusConfig {

    /**
     * 需要实现一个MP的分页的拦截器对象,交给Spring容器管理
     *
     * @return {@link PaginationInterceptor} Map<方法名称,分页对象>
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}