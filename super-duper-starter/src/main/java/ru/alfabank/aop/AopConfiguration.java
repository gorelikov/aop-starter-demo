package ru.alfabank.aop;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

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
}
