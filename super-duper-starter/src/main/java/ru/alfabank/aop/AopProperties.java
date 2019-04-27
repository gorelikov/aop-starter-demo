package ru.alfabank.aop;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

@ConfigurationProperties("aop")
@Data
public class AopProperties {
    private List<String> emails;
}
