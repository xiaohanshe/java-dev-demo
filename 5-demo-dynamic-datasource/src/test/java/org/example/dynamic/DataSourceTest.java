package org.example.dynamic;

import com.baomidou.dynamic.datasource.DynamicRoutingDataSource;
import com.baomidou.dynamic.datasource.creator.*;
import com.baomidou.dynamic.datasource.spring.boot.autoconfigure.DataSourceProperty;
import com.baomidou.dynamic.datasource.toolkit.DynamicDataSourceContextHolder;
import org.example.dynamic.entity.SysDatasourceConfig;
import org.example.dynamic.mapper.SysDatasourceConfigMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.BeanUtils;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * 测试
 *
 * @author han
 * @since 2023/06/27
 */
@SpringBootTest
public class DataSourceTest {
    @Resource
    SysDatasourceConfigMapper sysDatasourceConfigMapper;
    @Resource
    DataSource dataSource;
    @Resource
    DefaultDataSourceCreator dataSourceCreator;


    @Test
    public void test1() {
        sysDatasourceConfigMapper
                .selectList(null)
                .forEach(System.out::println);
    }

    /**
     * 获取当前所有数据源
     */
    @Test
    void testGetDataSource() {
        DynamicRoutingDataSource routingDataSource = (DynamicRoutingDataSource) dataSource;
        routingDataSource.getDataSources().forEach((k, v) -> {
            System.out.println(k + "====" + v);
            System.out.println("poolName:" + k);
        });
    }

    /**
     * 添加数据源
     */
    @Test
    void testAddDataSource(){
        DynamicRoutingDataSource routingDataSource = (DynamicRoutingDataSource) dataSource;
        DataSourceProperty dataSourceProperty = new DataSourceProperty();
        SysDatasourceConfig config = sysDatasourceConfigMapper.selectOne(null);
        // 这里主要是将dto的属性赋值给dataSourceProperty
        //所以dataSourceProperty中必要的参数，dto都要提供
        BeanUtils.copyProperties(config, dataSourceProperty);
        DataSource dataSource = dataSourceCreator.createDataSource(dataSourceProperty);

        // PoolName就是我们yaml配置中说的数据源名称
        routingDataSource.addDataSource(config.getPoolName(), dataSource);
        routingDataSource.getDataSources().forEach((k,v) -> {
            System.out.println("poolName:" + k);
        });
        System.out.println(routingDataSource);
    }

    /**
     * 更新数据源
     */
    @Test
    void testUpdateDataSource(){
        // 方式1：
        // 先删除，再添加。
        DynamicRoutingDataSource ds = (DynamicRoutingDataSource) dataSource;
        ds.removeDataSource("mysql_test");
        //省略添加的代码

        // 方式二:
        // 因为数据源是用map存储的，所以可以直接对map修改
        // ds.addDataSource(ds,dataSource);
    }

    /**
     * 切换数据源
     */
    @Test
    void testChangeDataSource(){
        // DynamicDataSourceContextHolder
        // 强制清空本地线程
        // clear()
        // 获得当前线程数据源
        // peek()
        // 清空当前线程数据源
        // poll()
        // 设置当前线程数据源
        // push(String ds)

        // 先清空再，切换
        DynamicDataSourceContextHolder.poll();
        DynamicDataSourceContextHolder.push("master");
    }
}
