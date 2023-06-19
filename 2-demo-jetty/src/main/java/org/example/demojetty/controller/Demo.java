package org.example.demojetty.controller;

import org.springframework.web.bind.annotation.*;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@RestController
public class Demo {
    @GetMapping("/test")
    public String test(){
        return "测试成功";
    }
}
