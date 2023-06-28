package org.example.dynamic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * mybatis-plus 多数据源
 *
 * @author han
 * @since 2023/06/27
 */
// @MapperScan("org.example.dynamic.mapper")
@SpringBootApplication
public class DynamicDataSourceApp {
    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceApp.class,args);
        System.out.println("#########mybatis-plus 多数据源#######");
    }
}
