package com.jk.service;

import com.jk.entity.FoodsEntity;

import java.util.HashMap;

public interface FoodsService {
    HashMap<String, Object> find(FoodsEntity book);

    void del(Integer id);

    void add(FoodsEntity food);

    FoodsEntity findById(Integer id);
}
