package com.hcy.reggie.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.hcy.reggie.entity.Employee;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author chaosssock
 * @date 2023/8/1 1:03
 */
@Mapper
public interface EmployeeMapper extends BaseMapper<Employee> {
}
