package com.example.demo.config;


import com.example.demo.entity.Person;
import com.example.demo.entity.Phone;
import com.example.demo.repository.PersonRepository;
import com.example.demo.repository.PhoneRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackageClasses = SystemUser.class)
public class BeanConfiguration {
    @Bean
    CommandLineRunner commandLineRunner(PersonRepository personRepository, PhoneRepository phoneRepository) {
        return args -> {
            Person person1 = new Person();
            Person person2 = new Person();
            Person person3 = new Person();

            personRepository.save(person1);
            personRepository.save(person2);
            personRepository.save(person3);

//            List<Person> people = personRepository.findAll();

            Person person4 = personRepository.findById(3L)
                    .orElseThrow(() -> new IllegalStateException(
                            "test"
                    ));
//
            person4.setTest_person1("Dammit!");
            personRepository.save(person4);


//
            Phone phone1 = new Phone(person3.getId(), "123-456-7891");
            Phone phone2 = new Phone(3L, "223-456-7892");
//            Phone phone3 = new Phone("323-456-7893");
//
            phoneRepository.save(phone1);
            phoneRepository.save(phone2);

        };

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
//        };
//
//    }
