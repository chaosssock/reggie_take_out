package com.hcy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcy.reggie.dto.DishDto;
import com.hcy.reggie.entity.Dish;

/**
 * @author chaosssock
 * @date 2023/8/12 11:24
 */
public interface DishService extends IService<Dish> {

    //新增菜品，同时插入菜品对应的口味数据，需要操作两张表：dish、dish_flavor
    public void saveWithFlavor(DishDto dishDto);

    //根据id查询菜品信息和对应的口味信息
    public DishDto getByIdWithFlavor(Long id);

    //更新菜品信息，同时更新对应的口味信息
    public void updateWithFlavor(DishDto dishDto);
}
