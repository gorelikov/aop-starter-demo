package ru.alfabank.supa.duper;

import ru.alfabank.aop.MyDeprecated;

public interface SomeService {
    @MyDeprecated
    void someMethod();
}
