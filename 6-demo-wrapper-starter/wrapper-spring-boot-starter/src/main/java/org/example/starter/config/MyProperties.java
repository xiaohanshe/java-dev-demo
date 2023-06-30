package org.example.starter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/29
 */
@Data
@ConfigurationProperties(prefix = "starter")
public class MyProperties {
    private String demo;
    private String name;
}
