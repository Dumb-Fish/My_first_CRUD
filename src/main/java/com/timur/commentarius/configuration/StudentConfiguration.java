package com.timur.commentarius.configuration;

import com.timur.commentarius.repository.StudentRepository;
import com.timur.commentarius.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

//@Configuration
//public class StudentConfiguration {
//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            Student timur = new Student("Timur",  LocalDate.of(2006,3,20), "timyr1275@gmail.com");
//            Student intizar = new Student("Intizar",  LocalDate.of(2007,6,15), "intossha@gmail.com");
//            Student aidar = new Student("Aidar", LocalDate.of(2005,7,1), "aidar@gmail.com");
//            studentRepository.saveAll(
//                    List.of(timur, intizar, aidar)
//            );
//        };
//    }
//}