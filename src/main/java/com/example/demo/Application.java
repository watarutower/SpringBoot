package com.example.demo;

import com.example.demo.entity.Person;
import com.example.demo.entity.Phone;
import com.example.demo.entity.PhoneDetails;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.PhoneDetailsRepository;
import com.example.demo.repository.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.persistence.OneToMany;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
