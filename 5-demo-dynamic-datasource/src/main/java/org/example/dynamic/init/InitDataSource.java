package org.example.dynamic.init;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.DefaultDataSourceCreator;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import lombok.extern.slf4j.Slf4j;
import org.example.dynamic.entity.SysDatasourceConfig;
import org.example.dynamic.service.SysDatasourceConfigService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Component;

import javax.annotation.*;
import javax.sql.DataSource;
import java.util.List;

/**
 * SpringBoot 启动时加载数据库中的数据源
 *
 * @author han
 * @since 2023/06/28
 */

@Slf4j
@Component
public class InitDataSource {
    @Resource
    SysDatasourceConfigService service;
    @Resource
    DefaultDataSourceCreator dataSourceCreator;
    @Resource
    DataSource dataSource;


    /**
     * 项目启动加载
     */
    @PostConstruct
    public void init() {
        log.info("项目启动中-正在加载数据源...");
        // 获取配置
        List<SysDatasourceConfig> list = service.list();
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        for (SysDatasourceConfig config : list) {
            try {
                DataSourceProperty dataSourceProperty = new DataSourceProperty();
                // 这里主要是将dto的属性赋值给dataSourceProperty
                //所以dataSourceProperty中必要的参数，dto都要提供
                BeanUtils.copyProperties(config, dataSourceProperty);
                DataSource dataSource = dataSourceCreator.createDataSource(dataSourceProperty);
                // PoolName就是我们yaml配置中说的数据源名称
                ds.addDataSource(config.getPoolName(), dataSource);
            } catch (Exception e) {
                log.info("数据源【" + config.getPoolName() + "】加载失败，请检查配置");
                e.printStackTrace();
            }
        }
        log.info("项目启动中-数据源加载完成...");
    }
}
