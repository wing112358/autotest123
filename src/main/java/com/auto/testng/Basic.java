package com.auto.testng;

import org.testng.annotations.*;

public class Basic {

    @Test
    public void  testcase1(){

        System.out.println("执行case1");

    }

    @Test
    public void  testcase2(){

        System.out.println("执行case2");

    }

    @BeforeMethod
    public void   beforemethod(){

        System.out.println("这是在测试方法之前执行的");
    }

    @AfterMethod
    public void   aftermethod(){

        System.out.println("这是在测试方法之后执行的");
    }

    @BeforeClass
    public void beforeclass(){

        System.out.println("在basic类之前运行的");
    }

    @AfterClass
    public void afterclass(){

        System.out.println("在basic类之后运行的");
    }

    @BeforeSuite
    public void beforesuite(){

        System.out.println("在suite之前运行的");
    }

    @AfterSuite
    public void aftersuite(){

        System.out.println("在suite之后运行的");
    }

    @BeforeGroups
    public void beforegroup(){

        System.out.println("在group之前运行的");
    }

    @AfterGroups
    public void aftergroup(){

        System.out.println("在group之后运行的");
    }

    @BeforeTest
    public void beforetest(){

        System.out.println("在test之前运行的");
    }

    @AfterTest
    public void aftertest(){

        System.out.println("在test之后运行的");
    }
}
