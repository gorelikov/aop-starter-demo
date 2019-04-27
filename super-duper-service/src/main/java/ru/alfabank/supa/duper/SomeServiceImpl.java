package ru.alfabank.supa.duper;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Service;
import ru.alfabank.aop.MyBenchmark;
import ru.alfabank.aop.MyDeprecated;


@Service
public class SomeServiceImpl implements SomeService {
    @MyDeprecated
    @MyBenchmark
    public void someMethod() {
        System.out.println("run do smth");
    }
}
