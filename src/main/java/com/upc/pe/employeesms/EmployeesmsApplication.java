package com.upc.pe.employeesms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EmployeesmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesmsApplication.class, args);
    }

}
