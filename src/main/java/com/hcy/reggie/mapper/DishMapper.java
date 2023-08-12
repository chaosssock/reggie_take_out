package com.hcy.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hcy.reggie.entity.Dish;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chaosssock
 * @date 2023/8/12 11:23
 */

@Mapper
public interface DishMapper extends BaseMapper<Dish> {
}
