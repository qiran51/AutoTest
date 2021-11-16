package com.qiran.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DateProviderTest {

    @Test(dataProvider = "date")
    public void testDateProvider(String name,int age){
        System.out.println("name = " + name + "-----age = " + age);
    }
    @DataProvider(name = "date")
    public Object[][] providerDate(){
        Object[][] obj = new Object[][]{
                {"Liam",18},
                {"zhang",19},
                {"xie",18}
        };
        return obj;
    }
    /*
    * 调用不同的方法实现不同的参数
    *
    * */
    @Test(dataProvider = "proDate")
    public void test1(String name,int age){
        System.out.println("test1--name = " + name + "-----age = " + age);
    }
    @Test(dataProvider = "proDate")
    public void test2(String name,int age){
        System.out.println("test2--name = " + name + "-----age = " + age);
    }
    @DataProvider(name = "proDate")
    public Object[][] methodDateTest(Method method){
        Object[][] obj1 = null;
        if(method.getName().equals("test1")){
            obj1 = new Object[][]{
                    {"Liam",18},
                    {"zhang",19}
            };
        }else if(method.getName().equals("test2")){
            obj1 = new Object[][]{
                    {"xie",18},
            };
        }
        return obj1;
    }

}
