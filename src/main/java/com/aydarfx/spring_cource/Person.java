package com.aydarfx.spring_cource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


@Component
public class Person {
    @Value("${person.name}")
    private String name;
    @Value("${person.age}")
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }



    @Autowired
    @Qualifier("dog")
    private Pet pet;

    void callMyPet() {
        System.out.println("животное, топай сюды");
        pet.say();
    }
}
