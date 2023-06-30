package org.example.api.entity.user;

import lombok.*;
import org.example.api.entity.BasicPojo;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/28
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class Userinfo extends BasicPojo {
    /** 姓名 */
    private String name;
    /** 年龄 */
    private String age;
    /** 地址 */
    private String address;
}
