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

//        Pttomo test
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
    }

    //    OneToMany bidirctional
//    @Bean
//    CommandLineRunner commandLineRunner(PersonRepository personRepository, PhoneRepository phoneRepository) {
//        return args -> {

//            Person person1 = new Person();
//            Person person2 = new Person();
//            Person person3 = new Person();
////
//            Phone phone1 = new Phone("123-456-7891");
//            Phone phone2 = new Phone("223-456-7892");
//            Phone phone3 = new Phone("323-456-7893");
//
//            person1.addPhone(phone1);
//            person1.addPhone(phone2);
//            person2.addPhone(phone2);
//
//            personRepository.save(person1);
//            personRepository.save(person2);
//            personRepository.save(person3);
//        };
//    }

    //    OneToMany unidiredtional
//    @Bean
//    CommandLineRunner commandLineRunner(PersonRepository personRepository, PhoneRepository phoneRepository) {
//        return args -> {
//
//            Person person1 = new Person();
//            Person person2 = new Person();
//            Person person3 = new Person();
////
//            Phone phone1 = new Phone("123-456-7891");
//            Phone phone2 = new Phone("223-456-7892");
//            Phone phone3 = new Phone("323-456-7893");
//
//            person1.getPhones().add(phone2);
//            person2.getPhones().add(phone1);
//            person2.getPhones().add(phone3);
////
//
////            person1.getPhones().add(phone2);
////
////            person2.getPhones().add(phone2);
////            person1.getPhones().add(phone2);
//
//
//            personRepository.save(person1);
//            personRepository.save(person2);
//            personRepository.save(person3);
////            phoneRepository.save(phone1);
////            phoneRepository.save(phone2
////            );
//
//
//        };
//    }

//    ////    ManyToOne
//    @Bean
//    CommandLineRunner commandLineRunner(PersonRepository personRepository, PhoneRepository phoneRepository) {
//        return args -> {
//
//            Person person1 = new Person();
//            Person person2 = new Person();
//            Person person3 = new Person();
//
//            Phone phone1 = new Phone("123-456-7890");
//            Phone phone2 = new Phone("123-456-7890");
//
//            phone1.setPerson(person1);
//            phone2.setPerson(person1);
//
//            personRepository.save(person1);
//            personRepository.save(person2);
//            personRepository.save(person3);
//            phoneRepository.save(phone1);
//            phoneRepository.save(phone2
//            );
//
//
//        };
//    }


////  UniderectionalのOneToOne
//    @Bean
//    CommandLineRunner commandLineRunner(PhoneRepository phoneRepository, PhoneDetailsRepository phoneDetailsRepository) {
//        return args -> {
//            Phone phone1 = new Phone("123-456-789");
//            Phone phone2 = new Phone("123-456-789");
//
//            Phone phone4 = new Phone("123-456-789");
//
//            PhoneDetails details1 = new PhoneDetails("T-Mobile", "GSM");
//            PhoneDetails details2= new PhoneDetails("optica", "3G");
//            PhoneDetails details3= new PhoneDetails("global", "3G");
//
//
//            Phone phone3 = new Phone("123-456-789", details1);
//            Phone phone5 = new Phone("123-456-789", details2);
//
//            phoneDetailsRepository.save(details1);
//            phoneDetailsRepository.save(details2);
//
////
////            phone1.addDetails(details1);
////            phone3.addDetails(details2);
//
////            phoneRepository.save(phone1);
//            phoneRepository.save(phone2);
//            phoneRepository.save(phone3);
//            phoneRepository.save(phone4);
//            phoneRepository.save(phone5);
//
////            phoneDetailsRepository.save(details);
//        };
//    }

////    BidirectionalのOneToOne
//    @Bean
//    CommandLineRunner commandLineRunner(PhoneRepository phoneRepository, PhoneDetailsRepository phoneDetailsRepository) {
//        return args -> {
//
//            PhoneDetails details1 = new PhoneDetails("T-Mobile", "GSM");
//            PhoneDetails details2= new PhoneDetails("optica", "3G");
//            PhoneDetails details3= new PhoneDetails("global", "3G");
//
//            Phone phone1 = new Phone("123-456-781");
//            Phone phone2 = new Phone("123-456-782");
//            Phone phone3 = new Phone("123-456-783");
//            Phone phone4 = new Phone("123-456-784");
//            Phone phone5 = new Phone("123-456-785");
//
//            phone1.addDetails(details1);
////            重複は実行不可
////            phone3.addDetails(details1);
//            phone5.addDetails(details2);
//
//            phoneRepository.save(phone1);
//            phoneRepository.save(phone2);
//            phoneRepository.save(phone3);
//            phoneRepository.save(phone4);
//            phoneRepository.save(phone5);
//
////            phoneDetailsRepository.save(details);
//
//            PhoneDetails otherDetails = new PhoneDetails( "T-Mobile", "CDMA" );
//            otherDetails.setPhone(phone1);
//            phoneDetailsRepository.save(otherDetails);
//        };
//    }
}

//    @Bean
//    CommandLineRunner commandLineRunner(StudentRepository studentRepository) {
//        return args -> {
//            Student maria = new Student(
//                    "Maria",
//                    "Jones",
//                    "maria.jones@amigoscode.edu",
//                    21
//            );
//            studentRepository.save(maria);
//
//            PhoneDetails maria_phone = new PhoneDetails(
//            );
//        };
//    }
//}
