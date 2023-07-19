package com.example.logger.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class UserAspect {


    @Before("execution(* com.example.logger.service.UserService.getUsers())")
    public void beforeMethod(JoinPoint joinPoint) {
        System.out.println("Before Methodu : " + joinPoint.getSignature().getName());

    }

    @AfterReturning("execution(* com.example.logger.service.UserService.getUsers())")
    public void afterMethod(JoinPoint joinPoint) {
        System.out.println("After Methodu : " + joinPoint.getSignature().getName());
    }
}
