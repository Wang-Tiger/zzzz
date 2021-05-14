package com.jk.controller;

import com.jk.entity.FoodsEntity;
import com.jk.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/foods")
public class FoodsController {

    @Autowired
    private FoodsService foodsService;

    /**
    * @Author: wh
    * @Description: 分页+条查
    * @Date: 2021/5/12 21:44
    * @Param:[book]
    * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
    **/
    @GetMapping
    public HashMap<String,Object> find(FoodsEntity book){
        return foodsService.find(book);
    }

    /**
    * @Author: wh
    * @Description: 删除
    * @Date: 2021/5/12 21:45
    * @Param:[id]
    * @Return: void
    **/
    @DeleteMapping
    public void del(Integer id){
        foodsService.del(id);
    }

    /**
    * @Author: wh
    * @Description: 新增、修改
    * @Date: 2021/5/12 22:15
    * @Param:[food]
    * @Return: void
    **/
    @PostMapping
    public void add(FoodsEntity food){
        foodsService.add(food);
    }

    /**
    * @Author: wh
    * @Description: 修改回显
    * @Date: 2021/5/12 22:45
    * @Param:[id]
    * @Return: com.jk.entity.FoodsEntity
    **/
    @RequestMapping("id")
    public FoodsEntity findById(Integer id){
        return foodsService.findById(id);
    }

}
