package com.aydarfx.spring_cource;

import org.springframework.stereotype.Component;

@Component
public class Dog implements Pet {
    @Override
    public void say() {
        System.out.println("гав-гав");
    }
}
