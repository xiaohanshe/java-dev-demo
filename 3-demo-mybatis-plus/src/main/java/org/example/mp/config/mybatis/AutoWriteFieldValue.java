package org.example.mp.config.mybatis;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;

import java.util.Date;

/**
 * 自动填充字段
 *
 * @author han
 * @since 2023/06/16
 */
public class AutoWriteFieldValue implements MetaObjectHandler {
    @Override
    public void insertFill(MetaObject metaObject) {
        // 添加记录时插入
        this.setFieldValByName("createTime", new Date(), metaObject);
        System.out.println(metaObject);
    }

    @Override
    public void updateFill(MetaObject metaObject) {
        // 记录更新时插入
        this.setFieldValByName("updateTime", new Date(), metaObject);
        System.out.println(metaObject);
    }
}
