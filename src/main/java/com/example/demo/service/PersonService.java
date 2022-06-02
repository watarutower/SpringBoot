package com.example.demo.service;

import com.example.demo.entity.Person;

public interface PersonService  {

    Person getPersonById(int id);

    int create(Person person);

    int updatePerson(Person person);

    int deletePersonById(int id);

}
