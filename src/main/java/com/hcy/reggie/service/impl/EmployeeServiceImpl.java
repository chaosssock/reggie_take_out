package com.hcy.reggie.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hcy.reggie.entity.Employee;
import com.hcy.reggie.mapper.EmployeeMapper;
import com.hcy.reggie.service.EmployeeService;
import org.springframework.stereotype.Service;

/**
 * @author chaosssock
 * @date 2023/8/1 1:08
 */
@Service
public class EmployeeServiceImpl extends ServiceImpl<EmployeeMapper, Employee> implements EmployeeService {
}
