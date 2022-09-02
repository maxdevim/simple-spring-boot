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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student max = new Student (
                    "Max",
                    LocalDate.of(1990, Month.OCTOBER, 5),
                    "max.devin@gmail.com"
            );

            Student alex = new Student (
                    "Alex",
                    LocalDate.of(2004, Month.JANUARY, 12),
                    "alex@gmail.com"
            );

            repository.saveAll(
                    List.of(max, alex)
            );
        };
    }
}
