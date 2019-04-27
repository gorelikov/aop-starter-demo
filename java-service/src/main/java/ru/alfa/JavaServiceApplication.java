package ru.alfa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import ru.alfa.boot.demo.Exercise;

import javax.annotation.PostConstruct;
import java.util.Arrays;

@SpringBootApplication
public class JavaServiceApplication {
    @Autowired ExerciseRepository exerciseRepository;

    @PostConstruct
    public void init() {
        exerciseRepository.saveAll(Arrays.asList(
                ExerciseEntity.builder().exercise(Exercise.builder()
                        .question("Последняя версия Java")
                        .answer("12 beta 128")
                        .build()).build(),
                ExerciseEntity.builder().exercise(Exercise.builder()
                        .question("Размер инта")
                        .answer(String.valueOf(Integer.MAX_VALUE))
                        .build()).build(),
                ExerciseEntity.builder().exercise(Exercise.builder()
                        .question("String Spring Swing — кто лишний?")
                        .answer("Никто")
                        .build()).build()
        ));
    }

    public static void main(String[] args) {
        SpringApplication.run(JavaServiceApplication.class, args);
    }
}
