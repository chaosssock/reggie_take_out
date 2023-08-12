package com.hcy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.reggie.entity.Category;
import com.hcy.reggie.mapper.CategoryMapper;
import com.hcy.reggie.service.CategoryService;
import org.springframework.stereotype.Service;

/**
 * @author chaosssock
 * @date 2023/8/12 8:50
 */

@Service
public class CategoryServiceImpl extends ServiceImpl<CategoryMapper, Category> implements CategoryService {
}
