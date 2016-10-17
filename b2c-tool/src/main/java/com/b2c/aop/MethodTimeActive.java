package com.b2c.aop;

import org.aopalliance.aop.Advice;
import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * 统计执行的时间
 * Created by Oakley on 2016-10-11.
 */
public class MethodTimeActive  implements Advice{

    protected Logger log = Logger.getLogger(MethodTimeActive.class);

    Object timeDubboService(ProceedingJoinPoint jp) throws Throwable{
        StopWatch clock = new StopWatch();
        clock.start();
        Object o = jp.proceed();
        clock.stop();
        MethodSignature signature =(MethodSignature)jp.getSignature();
        Method method = signature.getMethod();
        if (!method.getName().equals("getMetaClass") && clock.getTotalTimeMillis()>50) {
            System.out.println("dubbo provider ==================" + method.getDeclaringClass().getName() + "." + method.getName() + " " +
                    "costs " +
                    clock.getTotalTimeMillis() + " ms");
            log.info("dubbo provider ==================" + method.getDeclaringClass().getName() + "." + method.getName() + " costs " +
                    clock.getTotalTimeMillis() + " ms");
        }
        log(method.getName());
        return o;
    }
    private void log(String methodName){
        log.info("当前执行方法:"+methodName);
    }
}

