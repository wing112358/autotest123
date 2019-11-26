package com.auto.testng.groups;

import org.testng.annotations.Test;

@Test(groups ="stu")

public class GroupsOnClass1 {

    public void stu1(){
        System.out.println("Class1中的方法1");

    }


    public void stu2(){
        System.out.println("Class1中的方法2");

    }
}
