package com.example.posts.aspect;


import com.example.posts.domain.Logger;
import com.example.posts.service.LoggerService;
import com.example.posts.service.impl.LoggerServiceImpl;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Time;
import java.time.LocalDate;
import java.util.Locale;

@Aspect
@Component
public class LoggerAspect {

    @Autowired
    LoggerService loggerService;

    //pointcut
    @Pointcut("@annotation(com.example.posts.aspect.annotation.Logger)")
    public void logger() {
    }

    //advice
    @After("logger()")
    public void logger(JoinPoint joinPoint) throws Throwable {

        LocalDate date = LocalDate.now();
        Time time = Time.valueOf(java.time.LocalTime.now());
        String principal = "Fake Static User";
        String operation = joinPoint.getKind().toUpperCase(Locale.ROOT);
        Logger logger = new Logger(date, time, principal, operation);
        logger.setDate(date);
        logger.setTime(time);
        logger.setPrincipal(principal);
        logger.setOperation(operation);
        loggerService.saveLog(logger);
    }

    /*    @Around("logger()")
    public void logger(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        var result = proceedingJoinPoint.proceed();
        LocalDate date = LocalDate.now();
        Time time = Time.valueOf(java.time.LocalTime.now());
        String principal = "Fake Static User";
        String operation = proceedingJoinPoint.getKind().toUpperCase(Locale.ROOT);
        Logger logger = new Logger(date, time, principal, operation);
        logger.setDate(date);
        logger.setTime(time);
        logger.setPrincipal(principal);
        logger.setOperation(operation);
        loggerService.saveLog(logger);
    }*/

}

