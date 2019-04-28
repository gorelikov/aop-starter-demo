package ru.alfa.examinator;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import ru.alfa.boot.demo.Exam;
import ru.alfa.boot.demo.Exercise;
import ru.alfa.boot.demo.Section;

import java.util.Map;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class ExaminatorController {
    private final RestTemplate         restTemplate;
    private final ExaminatorProperties examinatorProperties;

    @PostMapping("/exam")
    public Exam getExercises(@RequestBody Map<String, Integer> plan) {
        return Exam.builder()
                .sections(
                        plan.entrySet().stream()
                                .map(stringIntegerEntry -> fetchExamSections(stringIntegerEntry.getKey(), stringIntegerEntry.getValue()))
                                .collect(Collectors.toList())
                )
                .build();

    }

    private Section fetchExamSections(String sectionName, Integer count) {
        return restTemplate.getForObject(
                "http://"+sectionName + "/sections?random=" + count,
                Section.class
        );
    }

    private String resolveEndpoint(String sectionName) {
        return examinatorProperties.getUrls().get(sectionName);
    }
}
