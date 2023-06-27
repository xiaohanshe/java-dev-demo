package org.example.mp.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import org.example.mp.enumdemo.DbType;

/**
 * 通用枚举测试类
 *
 * @author han
 * @since 2023/06/27
 */
@Data
@TableName("general_enum_test")
public class GeneralEnum {
    private String id;
    private String name;
    private DbType dbType;
    private String url;
    private String driver;


}
