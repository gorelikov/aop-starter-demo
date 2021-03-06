package ru.alfa.examinator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cloud.context.config.annotation.RefreshScope;

import java.util.Map;

@RefreshScope
@Data
@ConfigurationProperties(prefix = "exams")
public class ExaminatorProperties {
    private Map<String, String> urls;
    private Integer maxSections;
}
