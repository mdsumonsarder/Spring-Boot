package com.example.AOP_Project;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import java.util.Arrays;



@Aspect
@Component
public class AopAspect {

    Logger logger = LoggerFactory.getLogger(AopAspect.class);


    //AopClass;
    @Before("execution(* AopClass+.*(..))") //PointCut Expression;
    public void before(JoinPoint joinPoint){
        //Mojuler Make;
        logger.info("Starting - "+joinPoint.getSignature().getName());
        logger.info("With Parameter - "+ Arrays.toString(joinPoint.getArgs()));
    }

    /*@After("execution(* AopClass+.*(..))")
    public void after(JoinPoint joinPoint){
        //Mojuler Make;
        logger.info("Finished - "+joinPoint.getSignature().getName());
    }*/

    @AfterReturning(value = "execution(* AopClass+.*(..))", returning = "result")
    public void after(JoinPoint joinPoint, Object result){
        //Mojuler Make;
        logger.info("Finished - "+joinPoint.getSignature().getName());
        logger.info("Returnd - "+result);
    }


    //AnotherClass;
    @Before("execution(* AnotherClass+.*(..))") //PointCut Expression;
    public void before1(JoinPoint joinPoint){
        //Mojuler Make;
        logger.info("Starting - "+joinPoint.getSignature().getName());
        logger.info("With Parameter - "+ Arrays.toString(joinPoint.getArgs()));
    }

    /*@After("execution(* AnotherClass+.*(..))")
    public void after1(JoinPoint joinPoint){
        //Mojuler Make;
        logger.info("Finished - "+joinPoint.getSignature().getName());
    }*/

    @AfterReturning(value = "execution(* AnotherClass+.*(..))", returning = "result")
    public void after1(JoinPoint joinPoint, Object result){
        //Mojuler Make;
        logger.info("Finished - "+joinPoint.getSignature().getName());
        logger.info("Returnd - "+result);
    }

}
