package com.jk.service.impl;

import com.jk.entity.FoodsEntity;
import com.jk.service.FoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;

@Service
public class FoodsServiceImpl implements FoodsService {

    @Autowired
    private RestTemplate restTemplate;


    @Override
    public HashMap<String, Object> find(FoodsEntity book) {
        HashMap<String, Object> params = new HashMap<>();
        params.put("page",book.getPage());
        params.put("rows",book.getRows());
        params.put("sdate",book.getSdate());
        params.put("edate",book.getEdate());
        return restTemplate.getForObject("http://provider/food?page={page}&rows={rows}&sdate={sdate}&edate={edate}",HashMap.class,params);
    }

    @Override
    public void del(Integer id) {
        restTemplate.delete("http://provider/food?id={1}",id);
    }

    @Override
    public void add(FoodsEntity food) {
        restTemplate.postForLocation("http://provider/food",food);
    }

    @Override
    public FoodsEntity findById(Integer id) {
        return restTemplate.getForObject("http://provider/food/id?id={1}",FoodsEntity.class,id);
    }
}
