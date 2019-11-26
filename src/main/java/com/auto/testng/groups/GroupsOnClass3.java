package com.auto.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "teacher")

public class GroupsOnClass3 {

    public void techer1(){
        System.out.println("Class3中的方法1");

    }


    public void techer2(){
        System.out.println("Class3中的方法2");

    }
}
