package com.hejz.studay;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;

@SpringBootApplication
public class StudayApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudayApplication.class, args);
    }


    @Autowired
    private StudentRepository studentRepository;

    @PostConstruct
    public void test(){
        studentRepository.save(new Student("he","jz","75412985@qq.com",42));
    }
}
