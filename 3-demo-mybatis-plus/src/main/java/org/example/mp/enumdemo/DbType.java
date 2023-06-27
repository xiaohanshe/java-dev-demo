package org.example.mp.enumdemo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import com.fasterxml.jackson.annotation.*;
import lombok.*;

/**
 * 通用枚举类-方式一：https://gitee.com/baomidou/mybatis-plus-samples/tree/master/mybatis-plus-sample-enum
 * 配置文件：
 *  todo 3.5.2后不需要此配置
 *  mybatis-plus:
 *     # 支持统配符 * 或者 ; 分割
 *     typeEnumsPackage: com.baomidou.springboot.entity.enums
 *
 * @author han
 * @since 2023/06/27
 */
@Getter
@AllArgsConstructor
public enum DbType {
    MYSQL(1, "Mysql"),
    POSTGRE_SQL(2, "PostgreSQL");

    /**
     * 这两个注解标记对code做序列化与反序列化
     * 数据库->后端->前端
     */
    @JsonValue
    @EnumValue
    private final int code;
    private final String name;

    /**
     * 反序列化：前端 -> 后端
     * 增加映射方法，并为方法添加@JsonCreator
     */
    @JsonCreator
    public static DbType format(int value) {
        for (DbType dep : DbType.values()) {
            if (dep.getCode() == value) {
                return dep;
            }
        }
        return null;
    }
}
