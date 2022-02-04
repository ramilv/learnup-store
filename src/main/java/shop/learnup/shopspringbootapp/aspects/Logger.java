package shop.learnup.shopspringbootapp.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Aspect
@Service
public class Logger {

    @Pointcut("@annotation(shop.learnup.shopspringbootapp.annotations.Loggable)")
    public void log() {}

    @Before("log()")
    public void before(JoinPoint point) {
        log("Before starting " + point.getSignature().getName() + "()");
    }

    @Around("log()")
    public void around(ProceedingJoinPoint point) throws Throwable {
        log("Start exec " + point.getSignature().getName() + "()");
        point.proceed();
        log("Start exec " + point.getSignature().getName() + "()");
    }

    @AfterReturning("log()")
    public void afterReturning(JoinPoint point) {
        log("After returning " + point.getSignature().getName() + "()");
    }

    @AfterThrowing("log()")
    public void afterThrowing(JoinPoint point) {
        log("After exception in " + point.getSignature().getName() + "()");
    }

    private void log(Object o) {
        System.out.println(o);
    }
}