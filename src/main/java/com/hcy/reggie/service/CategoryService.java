package com.hcy.reggie.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hcy.reggie.entity.Category;

/**
 * @author chaosssock
 * @date 2023/8/12 8:49
 */
public interface CategoryService extends IService<Category> {
    public void remove(Long id);
}
