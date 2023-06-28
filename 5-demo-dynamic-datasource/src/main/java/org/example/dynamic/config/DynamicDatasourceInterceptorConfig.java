package org.example.dynamic.config;

import lombok.extern.slf4j.Slf4j;
import org.example.dynamic.interceptor.DynamicDataSourceInterceptor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/28
 */
@Slf4j
@Configuration
public class DynamicDatasourceInterceptorConfig implements WebMvcConfigurer {
    /**
     * 注册数据源拦截器
     * @param registry InterceptorRegistry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        DynamicDataSourceInterceptor dynamicDatasourceInterceptor = new DynamicDataSourceInterceptor();
        // 如果拦截全部可以设置为 /**
        String[] path = {"/**"};
        // 不需要拦截的接口路径
        String[] excludePath = {};
        registry.addInterceptor(dynamicDatasourceInterceptor)
                .addPathPatterns(path)
                .excludePathPatterns(excludePath);

    }
}
