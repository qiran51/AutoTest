package com.qiran.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsTest {
    @Test(groups = "server")
    public void groupsServer1(){
        System.out.println("服务端测试方法执行1111");
    }
    @Test(groups = "server")
    public void groupsServer2(){
        System.out.println("服务端测试方法执行2222");
    }
    @Test(groups = "client")
    public void groupsClient1(){
        System.out.println("服务端测试方法执行1111");
    }
    @Test(groups = "client")
    public void groupsClient2(){
        System.out.println("服务端测试方法执行2222");
    }
    //服务端
    @BeforeGroups("server")
    public void beforeGroups1(){
        System.out.println("在服务端测试方法执行之前执行!!!!!!");
    }
    @AfterGroups("server")
    public void afterGroups2(){
        System.out.println("在服务端测试方法执行之后执行!!!!!!");
    }
    //客户端
    @BeforeGroups("client")
    public void beforeGroups3(){
        System.out.println("在服务端测试方法执行之前执行!!!!!!");
    }
    @AfterGroups("client")
    public void afterGroups4(){
        System.out.println("在服务端测试方法执行之后执行!!!!!!");
    }

}
