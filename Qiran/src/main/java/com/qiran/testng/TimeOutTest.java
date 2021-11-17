package com.qiran.testng;

import org.omg.CORBA.TIMEOUT;
import org.testng.annotations.Test;

public class TimeOutTest {
    //预期3000毫秒内执行完
    @Test(timeOut = 3000)
    public void timeSuccess() throws InterruptedException {
        //设则睡眠2000毫秒
        Thread.sleep(2000);
    }
    @Test(timeOut = 2000)
    public void timeFail() throws InterruptedException {
        //设则睡眠2000毫秒
        Thread.sleep(3000);
    }
}
