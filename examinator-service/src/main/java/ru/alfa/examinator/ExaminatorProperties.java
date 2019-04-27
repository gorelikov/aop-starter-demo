package ru.alfa.examinator;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Map;

@Data
@ConfigurationProperties(prefix = "exams")
public class ExaminatorProperties {
    private Map<String, String> urls;
}
