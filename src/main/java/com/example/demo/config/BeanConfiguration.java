package com.example.demo.config;

import com.example.demo.entity.*;
import com.example.demo.repository.SubsystemRepository;
import com.example.demo.repository.SystemUserRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackageClasses = SystemUser.class)
public class BeanConfiguration {
    @Bean
    CommandLineRunner commandLineRunner() {
        return args -> {

        };

    }
//    @Bean
//    CommandLineRunner commandLineRunner(SystemUserRepository systemUserRepository, SubsystemRepository subsystemRepository) {
//        return args -> {
//            Subsystem subsystem = new Subsystem("1", "mySubSystem");
//
//            subsystemRepository.save(subsystem);
//
//            SystemUser systemUser = new SystemUser(
//                    "wataru",
//                    "1",
//                    "tower"
//            );
//
////            PK pk = new PK(subsystem, "rock");
//
//            systemUserRepository.save(systemUser);
//
    /x
//        };
//
//    }
}
