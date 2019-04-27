package ru.alfa;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.experimental.Delegate;
import ru.alfa.boot.demo.Exercise;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ExerciseEntity  {
    @Id
    @GeneratedValue
    Long aLong;

    @Delegate
    @Transient
    Exercise exercise = new Exercise();


}
