package com.sky.mapper;

import com.sky.entity.Setmeal;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface SetMealMapper {
    @Select("select count(*) from sky_take_out.setmeal where category_id = #{id}")
    Integer countByCategoryId(Long id);


    void update(Setmeal setmeal);
}
