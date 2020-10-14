package com.cloud.cosumer2.interfacePack;

import java.lang.reflect.Method;

public class MyImpl {
   public static void main(String[] args){
       try{
           //反射出该类的方法
           Class aClass = MyMethod.class;
           Method[] ms = aClass.getMethods();
           for (Method method : ms) {
               if (method.getName().equals("add")) {
                   method.invoke(aClass.newInstance(), "111",11);
               }
           }
       }catch(Exception e){
           e.printStackTrace();
       }
   }
}
