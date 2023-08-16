package com.hcy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.reggie.entity.User;
import com.hcy.reggie.mapper.UserMapper;
import com.hcy.reggie.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author chaosssock
 * @date 2023/8/16 21:43
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
