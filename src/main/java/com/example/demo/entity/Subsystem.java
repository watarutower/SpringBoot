package com.example.demo.entity;

import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@NoArgsConstructor
@Entity(name = "Subsystem")
public class Subsystem {

    @Id
    private String id;

    private String description;

    public Subsystem(String id, String description) {
        this.id = id;
        this.description = description;
    }
//Getters and setters are omitted for brevity

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}