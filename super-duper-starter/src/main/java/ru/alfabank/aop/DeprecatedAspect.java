package ru.alfabank.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DeprecatedAspect {

    @Pointcut("@annotation(deprecated)")
    public void callDeprecatedMethod(MyDeprecated deprecated) {

    }

    @Before(value = "callDeprecatedMethod(deprecated)")
    public void warnDeprecated(MyDeprecated deprecated) {
        System.out.println("WARNING!! DO NOT USE DEPRECATED METHODS");
    }

}
