package com.jk.service;

import com.jk.entity.FoodsEntity;
import org.springframework.stereotype.Component;

import java.util.HashMap;
@Component
public class FoodsServiceHystrix implements FoodsService {
    @Override
    public HashMap<String, Object> find(FoodsEntity book) {
        HashMap<String, Object> map = new HashMap<>();
        map.put("total",0);
        map.put("rows",null);
        return map;
    }

    @Override
    public void del(Integer id) {
        System.out.println("挂了！！！！！！！！！");
    }

    @Override
    public void add(FoodsEntity food) {
        System.out.println("挂了！！！！！！！！！");
    }

    @Override
    public FoodsEntity findById(Integer id) {
        FoodsEntity food = new FoodsEntity();
        food.setCreateDate("2021-02-02");
        food.setId(1);
        food.setName("1");
        food.setPrice(1.0);
        food.setStutas(1);
        food.setType("1");
        return food;
    }
}
