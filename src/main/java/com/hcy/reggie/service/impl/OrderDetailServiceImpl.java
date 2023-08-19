package com.hcy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.reggie.entity.OrderDetail;
import com.hcy.reggie.mapper.OrderDetailMapper;
import com.hcy.reggie.service.OrderDetailService;
import org.springframework.stereotype.Service;

@Service
public class OrderDetailServiceImpl extends ServiceImpl<OrderDetailMapper, OrderDetail> implements OrderDetailService {

}