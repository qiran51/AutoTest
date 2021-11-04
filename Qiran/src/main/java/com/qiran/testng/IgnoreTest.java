package com.qiran.testng;

import org.testng.annotations.Test;

/**
 * 忽略测试：指定某个测试方法不执行，其他方法正常执行
 * 语法：@Test(enabled = false)
 *
 *
 *
 */
public class IgnoreTest {
    @Test
    public void ignore1(){
        System.out.println("ignore1 执行");
    }
    //不会执行，忽略掉
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行");
    }
    @Test(enabled = true)
    public void ignore3(){
        System.out.println("ignore3 执行");
    }
}
