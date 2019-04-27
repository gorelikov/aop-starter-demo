package ru.alfa.boot.demo;

import lombok.*;

import java.util.List;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Section {
    @Singular
    private List<Exercise> exercises;
}
