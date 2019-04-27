package ru.alfabank.aop;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.alfabank.aop.controller.FrontendControllerResponseWrapperAdvice;

@Configuration
@EnableConfigurationProperties(AopProperties.class)
public class AopConfiguration {

    @Bean
    public DeprecatedAspect deprecatedAspect() {
        return new DeprecatedAspect();
    }

    @Bean
    public BenchmarkAspect benchmarkAspect () {
        return new BenchmarkAspect();
    }

    @Bean
    public FrontendControllerResponseWrapperAdvice frontendControllerResponseWrapperAdvice() {
        return new FrontendControllerResponseWrapperAdvice();
    }
}
