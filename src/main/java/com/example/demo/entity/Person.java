package com.example.demo.entity;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@DynamicUpdate
@Entity(name = "Person")
public class Person {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String test_person1 = "Rogia";

    @Column
    private String test_person2;

    //unidirectional OneToMany
//    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Phone> phones = new ArrayList<>();

    //bidirectional OneToMany
//    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<Phone> phones = new ArrayList<>();

//    public void addPhone(Phone phone) {
//        phones.add( phone );
//        phone.setPerson( this );
//    }
//
//    public void removePhone(Phone phone) {
//        phones.remove( phone );
//        phone.setPerson( null );
//    }

}
