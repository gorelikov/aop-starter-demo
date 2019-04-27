package ru.alfabank.aop;

import lombok.SneakyThrows;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

@Aspect
public class BenchmarkAspect {

    @Around(value = "@annotation(benchmark)")
    @SneakyThrows
    public Object callMethod(ProceedingJoinPoint joinPoint, MyBenchmark benchmark) {
        long start = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        System.out.println(String.format("Time to execution %dms" , end-start));
        return result;
    }
}
