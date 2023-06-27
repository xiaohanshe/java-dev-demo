package org.example.mp.controller;

import org.example.mp.entity.GeneralEnum;
import org.example.mp.result.Result;
import org.example.mp.service.GeneralEnumService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * 通用枚举测试
 *
 * @author han
 * @since 2023/06/27
 */
@RestController
@RequestMapping("/test")
public class GeneralEnumController {
    @Resource
    private GeneralEnumService generalEnumService;

    @GetMapping("/enumDemo")
    public Object enumDemo(){
        return generalEnumService.list();
    }

    @PostMapping("/enumAdd")
    public Object addEnumDemo(@RequestBody GeneralEnum generalEnum){
        generalEnumService.save(generalEnum);
        return Result.ok(generalEnum);
    }
}
