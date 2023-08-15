package com.hcy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcy.reggie.dto.SetmealDto;
import com.hcy.reggie.entity.Setmeal;

import java.util.List;

/**
 * @author chaosssock
 * @date 2023/8/12 11:24
 */
public interface SetmealService extends IService<Setmeal> {
    /**
     * 新增套餐，同时需要保存套餐和菜品的关联关系
     * @param setmealDto
     */
    public void saveWithDish(SetmealDto setmealDto);

    /**
     * 删除套餐，同时删除套餐和菜品的关联数据
     * @param ids
     */
    public void removeWithDish(List<Long> ids);
}
