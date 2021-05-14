package com.jk.dao;

import com.jk.entity.FoodEntity;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FoodDao {

    int findCount(@Param("food") FoodEntity food);

    List<FoodEntity> find(@Param("start")int start, @Param("food") FoodEntity food);

    @Delete("delete from t_food where id = #{id}")
    void del(Integer id);

    @Insert("insert into t_food (name,price,type,stutas,createDate) values (#{name},#{price},#{type},1,#{createDate}) ")
    void add(FoodEntity food);

    @Update("update t_food set name = #{name},price = #{price},type = #{type},createDate = #{createDate} where id = #{id}")
    void update(FoodEntity food);

    @Select("select * from t_food where id = #{id}")
    FoodEntity findById(Integer id);
}
