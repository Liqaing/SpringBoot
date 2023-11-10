package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
        return args -> {
            Student rick = new Student(
                    1L,
                    "Rick",
                    20,
                    "rick@gmail.com",
                    LocalDate.of(2000, Month.JANUARY, 6)
            );

            Student rysen = new Student(
                    2L,
                    "Rysen",
                    19,
                    "rysen@gmail.com",
                    LocalDate.of(2002, Month.FEBRUARY, 5)
            );

            studentRepository.saveAll(List.of(rick, rysen));
        };
    }
}
