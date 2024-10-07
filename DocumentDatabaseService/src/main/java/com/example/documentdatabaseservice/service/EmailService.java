package com.example.documentdatabaseservice.service;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {

    private final JavaMailSender emailSender;

    public EmailService(JavaMailSender emailSender) {
        this.emailSender = emailSender;
    }

    public void sendEmailWithAttachment(String to, byte[] attachment, String subject, String attachmentName) throws MessagingException {
        MimeMessage message = emailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true);

        helper.setTo(to);
        helper.setSubject(subject);
        helper.setText("Please find the attached document.");

        // Create the attachment
        org.springframework.core.io.ByteArrayResource attachmentResource = new org.springframework.core.io.ByteArrayResource(attachment);
        helper.addAttachment(attachmentName, attachmentResource);

        emailSender.send(message);
    }
}
