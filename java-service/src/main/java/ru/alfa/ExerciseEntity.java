package ru.alfa;

import lombok.*;
import lombok.experimental.Delegate;
import ru.alfa.boot.demo.Exercise;

import javax.persistence.*;

import static javax.persistence.AccessType.FIELD;
import static javax.persistence.AccessType.PROPERTY;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseEntity  {
    @Id
    @GeneratedValue
    private Long aLong;

    private String question;
    private String answer;
}
