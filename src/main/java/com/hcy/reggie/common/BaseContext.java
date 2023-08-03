package com.hcy.reggie.common;

import lombok.extern.java.Log;

/**
 * 基于ThreadLocal封装工具类，用户保存和获取当前登录用户id
 *
 * @author chaosssock
 * @date 2023/8/3 11:45
 */
public class BaseContext {
    private static ThreadLocal<Long> threadLocal = new ThreadLocal<>();

    /**
     * 设置值
     * @param id
     */
    public static void setCurrentId(Long id) {
        threadLocal.set(id);
    }

    /**
     * 获取值
     * @return
     */
    public static Long getCurrentId() {
        return threadLocal.get();
    }
}
