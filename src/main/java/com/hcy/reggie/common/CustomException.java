package com.hcy.reggie.common;

/**
 * 自定义业务异常类
 * @author chaosssock
 * @date 2023/8/12 11:45
 */
public class CustomException extends RuntimeException{
    public CustomException(String message){
        super(message);
    }
}
