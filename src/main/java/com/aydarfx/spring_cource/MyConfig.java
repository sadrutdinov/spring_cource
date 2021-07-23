package com.aydarfx.spring_cource;

import org.springframework.context.annotation.*;

@Configuration
@PropertySource("classpath:application.properties")
@ComponentScan
public class MyConfig {

    @Bean
    @Scope("singleton")
    public Pet catBean() {
        return new Cat();
    }

    @Bean
    public Person personBean() {
        return new Person();
    }

}
