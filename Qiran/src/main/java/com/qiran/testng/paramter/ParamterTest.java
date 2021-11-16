package com.qiran.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParamterTest {
    /*
    * 参数化测试，
    * 格式：paramter({参数})
    * */
    @Test
    @Parameters({"name","age"})
    public void paramTest1(String name,int age){
        System.out.println("name = " + name + "-----age = " + age);
    }
}
