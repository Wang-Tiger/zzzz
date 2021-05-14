package com.jk.service.impl;

import com.jk.dao.FoodDao;
import com.jk.entity.FoodEntity;
import com.jk.service.FoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class FoodServiceImpl implements FoodService {

    @Autowired
    private FoodDao foodDao;


    // 分页+条查
    @Override
    public HashMap<String, Object> find(FoodEntity food) {

        int start = (food.getPage()-1)*food.getRows();

        int count = foodDao.findCount(food);

        List<FoodEntity> list = foodDao.find(start,food);

        HashMap<String, Object> map = new HashMap<>();
        map.put("total",count);
        map.put("rows",list);

        return map;
    }

    // 删除
    @Override
    public void del(Integer id) {
        foodDao.del(id);
    }

    @Override
    public void add(FoodEntity food) {
        if (food.getId() == null){// 新增
            foodDao.add(food);
        }else{// 修改
            foodDao.update(food);
        }
    }

    // 修改回显
    @Override
    public FoodEntity findById(Integer id) {
        return foodDao.findById(id);
    }
}
