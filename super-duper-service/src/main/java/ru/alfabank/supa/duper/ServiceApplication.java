package ru.alfabank.supa.duper;

import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class ServiceApplication implements CommandLineRunner {
    private final SomeService someService;

    public static void main(String[] args) {
        SpringApplication.run(ServiceApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        someService.someMethod();
    }
}

