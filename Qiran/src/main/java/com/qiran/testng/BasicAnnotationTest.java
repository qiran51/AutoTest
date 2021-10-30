package com.qiran.testng;

import org.testng.annotations.*;

/*
* BeforeMethod在测试方法执行之前执行的
* AfterMethod在测试方法执行之后执行的
* 注:
*   虽然BeforeMethod和AfterMethod执行顺序不同
*   但它们有个共同点，它们会在每个测试方法前/后执行，例如:测试方法有2两个，它们会执行两次
*
* BeforeClass在类执行之前执行的
* AfterClass在类执行之后执行的
* 注:
*   它们只执行一次
* */
public class BasicAnnotationTest {
    //TestNG中最基本的注解，使用在方法上方时表示这个方法时测试的一部分
    @Test
    public void testngcode1(){
        System.out.println("测试1");
    }
    @Test
    public void testngcode2(){
        System.out.println("测试2");
    }

    @BeforeMethod
    public void beforMethod(){
        System.out.println("BeforeMethod在测试方法执行之前执行");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod在测试方法执行之后执行");
    }
    @BeforeClass
    public void beforClass(){
        System.out.println("BeforeClass在类执行之前执行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("AfterClass在类执行之后执行");
    }
}
