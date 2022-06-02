package com.example.demo;

import com.example.demo.entity.PK;
import com.example.demo.entity.SystemUser;
//import com.example.demo.repository.SystemUserRepository;
import com.example.demo.repository.SystemUserRepository;
import lombok.NoArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}