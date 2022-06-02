package com.example.demo.entity;

import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;

import java.util.Objects;

import static javax.persistence.GenerationType.SEQUENCE;


@Entity(name = "Phone")
//@DynamicUpdate
public class Phone {

//    @Id
//    @SequenceGenerator(name = "student_sequence",
//            sequenceName = "student_sequence", allocationSize = 1)
//    @GeneratedValue(strategy = SEQUENCE, generator = "student_sequence")
//    private Long id;

    // pattomoのテスト
    @Id
    @Column(name = "phone_id")
    private Long id;

//    @MapsId
//    @JoinColumn(name = "user_id")
//    private Person person;

    @Column(name = "`number`")
    private String number;

    public Phone(Long id, String number) {
        this.id = id;
        this.number = number;
    }

/////////////////////////

//    @ManyToOne
//    @JoinColumn(name = "person_id",
//            foreignKey = @ForeignKey(name = "PERSON_ID_FK"))
//    private Person person;

////  OneToMany unidirectional
//    @Column(name = "`number`")
//    private String number;

//  OneToMany bidirectional ///////////////
//    @NaturalId
//    @Column(name = "`number`", unique = true)
//    private String number;
//    @ManyToOne
//    private Person person;
//
//    public Person getPerson() {
//        return person;
//    }
//
//    public void setPerson(Person person) {
//        this.person = person;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if ( this == o ) {
//            return true;
//        }
//        if ( o == null || getClass() != o.getClass() ) {
//            return false;
//        }
//        Phone phone = (Phone) o;
//        return Objects.equals( number, phone.number );
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash( number );
//    }
///////////////////////

    //    ManyToOneサンプル
//    @Column(name = "`number`")
//    private String number;
//
//    @ManyToOne
//    @JoinColumn(name = "person_id",
//            foreignKey = @ForeignKey(name = "PERSON_ID_FK"))
//    private Person person;

//    @ManyToOne
//    @JoinColumn(name = "detail_id",
//            foreignKey = @ForeignKey(name = "DETAIL_ID_FK"))
//    private PhoneDetails phoneDetails;

    @Column(name = "`test`")
    private String test;

    @Column(name = "`test2`")
    private String test2;



//    public Person getPerson() {
//        return person;
//    }

//    public Phone(String number, Person person) {
//        this.number = number;
//        this.person = person;
//    }

//    public void setPerson(Person person) {
//        this.person = person;
//    }

//     unidirectional OneToOne
//     @OneToOne
//     @JoinColumn(name = "details_id")
//     private PhoneDetails details;

//     bidirectional OneToOne
//    @OneToOne(mappedBy = "phone", cascade = CascadeType.ALL,
//            orphanRemoval = true, fetch = FetchType.LAZY)
//    private PhoneDetails details;


    // constructor
    public Phone() {
    }
    public Phone(String number) {
        this.number = number;
    }

//    public Phone(String number, PhoneDetails details) {
//        this.number = number;
//        this.details = details;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

//    public PhoneDetails getDetails() {
//        return details;
//    }
//
//    public void setDetails(PhoneDetails details) {
//        this.details = details;
//    }
//
//
//    public void addDetails(PhoneDetails details) {
//        details.setPhone( this );
//        this.details = details;
//    }
//
//    public void removeDetails() {
//        if ( details != null ) {
//            details.setPhone( null );
//            this.details = null;
//        }
//    }


}