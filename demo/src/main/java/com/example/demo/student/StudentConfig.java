package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(IStudentRepository studentRepository) {
        return args -> {
            var john = new Student(
                    "john",
                    "john@gmail.com",
                    32,
                    LocalDate.of(2000, Month.JANUARY, 32));

            var maria = new Student(
                    "maria",
                    "maria@gmail.com",
                    32,
                    LocalDate.of(2001, Month.FEBRUARY, 23));

            studentRepository.saveAll(List.of(john, maria));
        };
    }
}
