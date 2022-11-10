package com.example.posts.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ExecutionTimeAspect {

    //pointcut
    @Pointcut("@annotation(com.example.posts.aspect.annotation.ExecutionTime)")
    public void executionTime(){};

    //advice
    @Around("executionTime()")
    public Object executionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        long start = System.nanoTime();
        var result = proceedingJoinPoint.proceed();
        long finish = System.nanoTime();
        System.out.println(proceedingJoinPoint.getSignature().getName() +  " Time taken= " + (finish - start));
        return result;
    }
}
