package com.cloud.cosumer2.interfacePack;

public class MyMethod {
    @MyAnnotation(username = "zhongfucheng", age = 20)
    public void add(String username,Integer age){
        System.out.println(username);
        System.out.println(age);
    }

}
