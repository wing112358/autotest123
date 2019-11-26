package com.auto.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {

    @Test(groups = "server")

    public void group1(){

        System.out.println("服务端组测试方法1");
    }

    @Test(groups = "server")

    public void group2(){

        System.out.println("服务组测试方法2");
    }


    @Test(groups = "client")

    public void group3(){

        System.out.println("客户端组测试方法1");
    }

    @Test(groups = "client")

    public void group4(){

        System.out.println("客户端组测试方法2");
    }


    @BeforeGroups("server")
    public void beforegroup(){

        System.out.println("这是服务端组运行之前执行的方法");
    }


    @AfterGroups("client")
    public void aftergroup(){

        System.out.println("这是客户端组运行之后执行的方法");
    }
}

