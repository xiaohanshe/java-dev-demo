package org.example.mp.config.mybatis;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.extension.plugins.MybatisPlusInterceptor;
import com.baomidou.mybatisplus.extension.plugins.inner.PaginationInnerInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.*;

/**
 * MP配置注入
 *
 * @author han
 * @since 2023/06/16
 */
@Configuration
@MapperScan("org.example.mp.mapper")
public class MybatisPlusConfig {

    /**
     * 注入分布拦截器
     */
    @Bean
    public MybatisPlusInterceptor mybatisPlusInterceptor() {
        MybatisPlusInterceptor interceptor = new MybatisPlusInterceptor();
        interceptor.addInnerInterceptor(new PaginationInnerInterceptor(DbType.H2));
        return interceptor;
    }

    /**
     * 注入日志打印拦截器
     */
    @Bean
    public MybatisSqlLogInterceptor mybatisSqlLogInterceptor() {
        return new MybatisSqlLogInterceptor();
    }

    /**
     * 注入自动填充插件
     */
    @Bean
    public AutoWriteFieldValue autoWriteFieldValue() {
        return new AutoWriteFieldValue();
    }
}
