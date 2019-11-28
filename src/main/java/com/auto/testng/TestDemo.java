package com.auto.testng;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestDemo {

    @Test
    public void right(){

        Assert.assertEquals(1,1);
    }


    @Test
    public void wrong(){

        Assert.assertEquals(1,2);
    }

    @Test
    public void logdemo(){

        Reporter.log("自己写的日志");
        throw new RuntimeException("自己运行时的异常");
    }

}
