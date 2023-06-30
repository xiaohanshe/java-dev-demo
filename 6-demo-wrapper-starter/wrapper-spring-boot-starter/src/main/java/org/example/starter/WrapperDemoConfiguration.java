package org.example.starter;

import org.example.starter.config.MyProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * starter 启动入口
 *
 * @author han
 * @since 2023/06/28
 */
@Configuration(proxyBeanMethods = false)
@EnableConfigurationProperties(MyProperties.class)
public class WrapperDemoConfiguration {
//    一些配置
}
