package org.example.redis.controller;

import cn.hutool.core.util.ObjUtil;
import org.example.redis.util.RedisUtil;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/19
 */
@RestController
@RequestMapping("/redis")
public class DemoController {
    @Resource
    private RedisUtil redisUtil;

    @GetMapping("/get")
    public Object get() {
        return redisUtil.get("1");
    }

    @GetMapping("/set")
    public Object set() {
        // redisUtil.set("aaaa","adafasdf");
        // redisUtil.hset("1","2", Arrays.asList(1,2,3,4,5));
        if (ObjUtil.isNotEmpty(redisUtil.lGet("1", 0, -1))) {
            redisUtil.del("1");
        }
        // 列表的添加
        redisUtil.lSet("1", Arrays.asList("asdfasdf", "asdfwww1222", "323232"));
        return redisUtil.lGet("1", 0, -1);
    }

    @GetMapping("/del")
    public Object del() {
        // redisUtil.del("aaaa");
        // 设置超时时间
        redisUtil.expire("aaaa", 10);
        return redisUtil.get("aaaa");
    }
}
