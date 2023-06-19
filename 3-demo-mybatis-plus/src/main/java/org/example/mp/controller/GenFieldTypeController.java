package org.example.mp.controller;

import org.example.mp.entity.GenFieldType;
import org.example.mp.result.Result;
import org.example.mp.service.GenFieldTypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO
 *
 * @author han
 * @since 2023/06/16
 */
@RestController
@RequestMapping("/gen")
public class GenFieldTypeController {

    @Resource
    private  GenFieldTypeService genFieldTypeService;


    @GetMapping("/list")
    public Object list(){
        return Result.ok(genFieldTypeService.list());
    }

    @GetMapping("/page")
    public Object page(){
        return genFieldTypeService.pageGenFieldType();
    }

    @PostMapping("/add")
    public Object add(@RequestBody GenFieldType genFieldType){
        genFieldTypeService.save(genFieldType);
        return Result.ok();
    }
}
