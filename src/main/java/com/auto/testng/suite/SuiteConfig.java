package com.auto.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class SuiteConfig {



    @BeforeSuite
    public void beforeSuite(){

        System.out.println("beforesuite运行啦");
    }


    @AfterSuite
    public void afterSuite(){

        System.out.println("aftersuite运行啦");
    }
}
