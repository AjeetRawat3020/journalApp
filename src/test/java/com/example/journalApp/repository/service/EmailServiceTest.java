package com.example.journalApp.repository.service;


import com.example.journalApp.service.EmailService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class EmailServiceTest {

    @Autowired
    private EmailService emailService;

    @Test
    void testSendMail(){
        emailService.sendEmail("ajeetsinghrawat1999@gmail.com","testing java mail sender", "Hi, aap kaise hai?");
    }

}
