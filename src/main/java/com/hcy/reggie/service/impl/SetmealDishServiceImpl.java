package com.hcy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.reggie.entity.Setmeal;
import com.hcy.reggie.entity.SetmealDish;
import com.hcy.reggie.mapper.SetmealDishMapper;
import com.hcy.reggie.mapper.SetmealMapper;
import com.hcy.reggie.service.SetmealDishService;
import com.hcy.reggie.service.SetmealService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author chaosssock
 * @date 2023/8/14 21:49
 */
@Service
@Slf4j
public class SetmealDishServiceImpl extends ServiceImpl<SetmealDishMapper, SetmealDish> implements SetmealDishService {
}
