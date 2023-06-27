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

    /**
     * 通用枚举-方式二：
     * 配置
     * mybatis-plus:
     *     # 修改 mybatis 的 DefaultEnumTypeHandler
     *     configuration:
     *         default-enum-type-handler: com.baomidou.mybatisplus.core.handlers.MybatisEnumTypeHandler
     */
    // @Bean
    // public MybatisPlusPropertiesCustomizer mybatisPlusPropertiesCustomizer() {
    //     return properties -> {
    //         GlobalConfig globalConfig = properties.getGlobalConfig();
    //         globalConfig.setBanner(false);
    //         MybatisConfiguration configuration = new MybatisConfiguration();
    //         configuration.setDefaultEnumTypeHandler(MybatisEnumTypeHandler.class);
    //         properties.setConfiguration(configuration);
    //     };
    // }
}
