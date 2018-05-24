package com.example.sweater.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class MailSender {
    @Autowired
    private JavaMailSender mailSender;

    public void send(String emailTo, String subject, String message){
        SimpleMailMessage mailMesage = new SimpleMailMessage();

        mailMesage.setFrom("");
        mailMesage.setTo(emailTo);
        mailMesage.setSubject(subject);
        mailMesage.setText(message);
        mailSender.send(mailMesage);
    }
}
