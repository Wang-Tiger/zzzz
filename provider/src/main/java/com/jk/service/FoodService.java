package com.jk.service;

import com.jk.entity.FoodEntity;

import java.util.HashMap;

public interface FoodService {
    HashMap<String, Object> find(FoodEntity book);

    void del(Integer id);

    void add(FoodEntity food);

    FoodEntity findById(Integer id);
}
