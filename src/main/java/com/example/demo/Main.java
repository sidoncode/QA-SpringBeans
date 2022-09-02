package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {

    public static void main(String [] args){

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
            CollegeConfig.class);


        College college = applicationContext.getBean("Teddy",College.class);
        college.test();


    }

}
