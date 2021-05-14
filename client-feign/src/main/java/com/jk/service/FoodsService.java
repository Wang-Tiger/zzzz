package com.jk.service;

import com.jk.entity.FoodsEntity;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
@FeignClient(value = "provider",fallback = FoodsServiceHystrix.class)
public interface FoodsService {

    @RequestMapping("food/find")
    HashMap<String, Object> find(FoodsEntity book);

    @DeleteMapping("food")
    void del(@RequestParam Integer id);

    @PostMapping("food")
    void add(FoodsEntity food);

    @RequestMapping("food/id")
    FoodsEntity findById(@RequestParam Integer id);
}
