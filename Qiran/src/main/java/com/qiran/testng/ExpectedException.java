package com.qiran.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /*
    * 什么时候会用到异常测试？
    * 我们期望某个结果为异常的时候
    * 比如：我往接口里面传了异常参数，程序抛出异常
    * 预期结果就是这个异常结果
    * */

    //演示一个测试方法失败
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是失败的");
    }
    //演示一个测试方法成功
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("这是成功的");
        throw new RuntimeException();
    }

}
