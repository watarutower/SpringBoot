package com.example.demo.entity;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.*;

import static org.hibernate.id.PersistentIdentifierGenerator.PK;


//@Entity(name = "SystemUser")
//public class SystemUser {
//
//    @EmbeddedId
//    private PK pk;
//
////    @Id
//    private String name;
//
//    //Getters and setters are omitted for brevity
//    public com.example.demo.entity.PK getPk() {
//        return pk;
//    }
//
//    public void setPk(com.example.demo.entity.PK pk) {
//        this.pk = pk;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//}

//IdClassテスト
//@Component
@NoArgsConstructor
@Entity(name = "SystemUser")
@IdClass( PK.class )
public class SystemUser {

    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    private Subsystem subsystem;

    @Id
    private String username;

    private String name;

//    public SystemUser(String name, Subsystem subsystem, String username) {
//        this.name = name;
//        this.subsystem = subsystem;
//        this.username = username;
//    }

    public SystemUser(Subsystem subsystem, String username, String name) {
        this.subsystem = subsystem;
        this.username = username;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public String getSubsystem() {
//        return subsystem;
//    }
//
//    public void setSubsystem(String subsystem) {
//        this.subsystem = subsystem;
//    }


    public Subsystem getSubsystem() {
        return subsystem;
    }

    public void setSubsystem(Subsystem subsystem) {
        this.subsystem = subsystem;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
//    public PK getId() {
//        return new PK(
//                subsystem,
//                username
//        );
//    }
//
//    public void setId(PK id) {
//        this.subsystem = id.getSubsystem();
//        this.username = id.getUsername();
//    }

    //Getters and setters are omitted for brevity
}
