package org.example.dynamic.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 系统数据源配置
 *
 * @author han
 * @since 2023/06/27
 */
@Data
@TableName("sys_datasource_config")
public class SysDatasourceConfig {
    /** 主键 */
    private String id;
    /** 代码 */
    private String code;
    /** 线程名，就是yml中的数据源名  */
    private String poolName;
    /** 连接地址  */
    private String url;
    /** 用户名 */
    private String username;
    /** 密码 */
    private String password;
    /** 驱动类名 */
    private String driverClassName;
}
