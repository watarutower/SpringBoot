package com.example.demo.entity;


import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;


//@Embeddable
public class PK implements Serializable {

//    @Id
    private Subsystem subsystem;

//    @Id
    private String username;

    public PK(Subsystem subsystem, String username) {
        this.subsystem = subsystem;
        this.username = username;
    }

    private PK() {
    }

    //Getters and setters are omitted for brevity

//
//    public String getSubsystem() {
//        return subsystem;
//    }
//
//    public void setSubsystem(String subsystem) {
//        this.subsystem = subsystem;
//    }
//
//    public String getUsername() {
//        return username;
//    }
//
//    public void setUsername(String username) {
//        this.username = username;
//    }

    @Override
    public boolean equals(Object o) {
        if ( this == o ) {
            return true;
        }
        if ( o == null || getClass() != o.getClass() ) {
            return false;
        }
        PK pk = (PK) o;
        return Objects.equals( subsystem, pk.subsystem ) &&
                Objects.equals( username, pk.username );
    }

    @Override
    public int hashCode() {
        return Objects.hash( subsystem, username );
    }


}