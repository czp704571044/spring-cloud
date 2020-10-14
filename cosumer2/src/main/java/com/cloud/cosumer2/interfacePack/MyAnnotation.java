package com.cloud.cosumer2.interfacePack;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

//自定义注解
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //定义了两个成员变量
    String username();
    int age();
}
