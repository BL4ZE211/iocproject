package com.classroom.iocproject;


import org.springframework.stereotype.Component;

@Component
public class EmailService {

    void  printEmail(){
        System.out.println("This is an Email");
    }
}
