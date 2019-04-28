package math;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.alfa.boot.demo.Exercise;
import ru.alfa.boot.demo.Section;

import java.util.concurrent.ThreadLocalRandom;

@RestController
@RequiredArgsConstructor
public class MathController {
    private final MathProperties mathProperties;

    @GetMapping("/sections")
    public Section section(@RequestParam int random) {
        Section.SectionBuilder builder = Section.builder();

        int count = Math.min(mathProperties.getMaxSections(), random);

        for (int i = 0; i < count; i++) {
            int b = ThreadLocalRandom.current().nextInt();
            int a = ThreadLocalRandom.current().nextInt();

            builder.exercise(Exercise.builder()
                    .question(a + "+" + b + "=")
                    .answer("= " + (a + b))
                    .build());
        }

        return builder.build();
    }
}
