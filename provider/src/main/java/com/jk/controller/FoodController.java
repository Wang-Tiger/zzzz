package com.jk.controller;

import com.jk.entity.FoodEntity;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("food")
public class FoodController {

    @Autowired
    private FoodService foodService;

    /**
    * @Author: wh
    * @Description: 分页+条查
    * @Date: 2021/5/12 19:38
    * @Param:[book]
    * @Return: java.util.HashMap<java.lang.String,java.lang.Object>
    **/
    @RequestMapping("find")
    public HashMap<String,Object> find(@RequestBody  FoodEntity food){
        return foodService.find(food);
    }

    @DeleteMapping
    public void del(Integer id){
        foodService.del(id);
    }

    /**
    * @Author: wh
    * @Description: 新增
    * @Date: 2021/5/12 22:19
    * @Param:[food]
    * @Return: void
    **/
    @PostMapping
    public void add(@RequestBody FoodEntity food){
        foodService.add(food);
    }


    @RequestMapping("id")
    public FoodEntity findById(Integer id){
        return foodService.findById(id);
    }
}
