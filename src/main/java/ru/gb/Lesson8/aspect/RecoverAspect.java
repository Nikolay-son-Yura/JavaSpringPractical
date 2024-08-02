package ru.gb.Lesson8.aspect;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Slf4j
@Aspect
@Component
public class RecoverAspect {

    @Pointcut("execution(* ru.gb.Lesson8.service.*.*(..))")
    public void rrrrr() {
    }

//    @Around("rrrrr")
//    public Object exception(ProceedingJoinPoint proceedingJoinPoint)throws Exception{
//
//    }

}
