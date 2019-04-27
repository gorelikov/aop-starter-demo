package ru.alfa;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alfa.boot.demo.Exercise;
import ru.alfa.boot.demo.Section;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequiredArgsConstructor
public class JavaController {
    private final ExerciseRepository exerciseRepository;

    @GetMapping("/sections")
    public Section section(@RequestParam int random) {

        List<ExerciseEntity> all = exerciseRepository.findAll();
        Collections.shuffle(all);

        List<ExerciseEntity>   exercises = all.subList(0, random);
        Section.SectionBuilder builder   = Section.builder();

        return builder
                .exercises(exercises.stream().map(
                        exerciseEntity -> Exercise.builder()
                                .answer(exerciseEntity.getAnswer())
                                .question(exerciseEntity.getQuestion())
                                .build()
                        ).collect(Collectors.toList())
                )
                .build();
    }

}
