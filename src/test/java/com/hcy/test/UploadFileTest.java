package com.hcy.test;

import org.junit.jupiter.api.Test;

/**
 * @author chaosssock
 * @date 2023/8/12 17:58
 */
public class UploadFileTest {
    @Test
    public void test1(){
        String fileName = "asbauicbasi.jpg";
        String suffix = fileName.substring(fileName.lastIndexOf("."));
        System.out.printf(suffix);
    }
}
