package com.b2c;

import org.apache.log4j.Logger;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.util.StopWatch;

import java.lang.reflect.Method;

/**
 * 统计执行的时间
 * Created by Oakley on 2016-10-11.
 */
@Aspect
@Order(20)
public class MethodTimeActive {

    protected Logger log = Logger.getLogger(MethodTimeActive.class);

    @Around("execution(* com.*.*Service.*(..))")
    Object timeDubboService(ProceedingJoinPoint jp) throws Throwable{
        StopWatch clock = new StopWatch();
        clock.start();
        Object o = jp.proceed();
        clock.stop();
        MethodSignature signature =(MethodSignature)jp.getSignature();
        Method method = signature.getMethod();
        if (!method.getName().equals("getMetaClass") && clock.getTotalTimeMillis()>50) {
            log.info("dubbo provider ==================" + method.getDeclaringClass().getName() + "." + method.getName() + " costs " +
                    clock.getTotalTimeMillis() + " ms");
        }
        return o;
    }
}

