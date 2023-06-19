package org.example.mp.entity;

import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;

import java.util.Date;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@Data
@TableName("gen_field_type")
public class GenFieldType {
    @TableId
    private String id;
    private String columnType;
    private String attrType;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private String packageName;
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;
}
