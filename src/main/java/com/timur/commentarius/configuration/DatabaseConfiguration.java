package com.timur.commentarius.configuration;

import com.timur.commentarius.student.Student;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableJpaRepositories("com.timur.commentarius.repository")
@EnableTransactionManagement
public class DatabaseConfiguration {
}
