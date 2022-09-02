package com.example.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CollegeConfig {

    @Bean
    public College college(){

        return new College();

    }

    @Bean
    public College collegeBean(){
        return new College();
    }

    @Bean(name = { "MrBean", "Teddy" })
    public College newCollegeBean(){
        return new College();

    }
}
