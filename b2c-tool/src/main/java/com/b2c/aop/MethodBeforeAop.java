package com.b2c.aop;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

/**
 * Created by Oakley on 2016-10-17.
 */
public class MethodBeforeAop implements MethodBeforeAdvice{
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.print("当前执行类:"+o.getClass().getName());
        log(method.getName());

    }
    private void log(String methodName){
        System.out.println("当前执行方法:"+methodName);
    }
}
