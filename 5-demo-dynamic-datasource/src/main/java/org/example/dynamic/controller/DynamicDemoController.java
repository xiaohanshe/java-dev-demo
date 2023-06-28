package org.example.dynamic.controller;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import org.example.dynamic.service.SysDatasourceConfigService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.sql.DataSource;
import java.sql.*;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/27
 */
@RestController
@RequestMapping("/dynamic")
public class DynamicDemoController {

    @Resource
    SysDatasourceConfigService service;

    @Resource
    DataSource dataSource;

    @GetMapping("/test")
    public void listDataSource() throws SQLException {
        DynamicRoutingDataSource routingDataSource = (DynamicRoutingDataSource) dataSource;
        routingDataSource.getDataSources().forEach((k, v) -> {
            System.out.println(k + "<>" + v);
        });
        String peek = DynamicDataSourceContextHolder.peek();
        Connection connection = routingDataSource.getConnection();
        System.out.println("当前数据源：" + peek);
        // 切换数据源
        DynamicDataSourceContextHolder.push("mysql_test");
        String peek1 = DynamicDataSourceContextHolder.peek();
        System.out.println(peek1);
        Connection connection1 = routingDataSource.getConnection();
        System.out.println(1);
    }
}
