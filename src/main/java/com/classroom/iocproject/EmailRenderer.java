package com.classroom.iocproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailRenderer {

    @Autowired
    EmailService emailSvc;

    void doEmailRendering(){
        System.out.println("Email Rendering");
        emailSvc.printEmail();
    }
}
