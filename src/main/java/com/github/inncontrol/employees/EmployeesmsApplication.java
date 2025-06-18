package com.github.inncontrol.employees;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
@EnableFeignClients
public class EmployeesmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(EmployeesmsApplication.class, args);
    }

}
