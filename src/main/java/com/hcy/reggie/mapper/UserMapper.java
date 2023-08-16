package com.hcy.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hcy.reggie.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chaosssock
 * @date 2023/8/16 21:42
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
