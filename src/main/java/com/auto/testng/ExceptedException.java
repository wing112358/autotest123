package com.auto.testng;

import org.testng.annotations.Test;

public class ExceptedException {

    //失败的异常测试

    //期望的异常信息
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeException(){

        System.out.println("这是一个失败的异常");
    }



    //成功的异常测试

    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){

        System.out.println("这是一个成功的异常");

        //抛出超时异常
        throw new RuntimeException();
    }
}
