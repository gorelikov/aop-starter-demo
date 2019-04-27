package ru.alfabank.supa.duper;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/examine")
public class SuperController {

    @RequestMapping("/hero")
    public HeroResponse getHero() {
        return new HeroResponse()
                .setName("Hulk")
                .setMood("I am angry");
    }
}
