package com.example.documentdatabaseservice.controller;

import com.example.documentdatabaseservice.model.ReservationPaymentDocument;
import com.example.documentdatabaseservice.repository.DocumentRepository;
import com.example.documentdatabaseservice.service.DocumentService;
import com.example.documentdatabaseservice.service.EmailService;
import com.example.documentdatabaseservice.service.PdfGeneratorService;
import jakarta.mail.MessagingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;
import java.util.Map;

@RestController
@RequestMapping("/api/documents")
public class DocumentController {

    @Autowired
    private DocumentService service;

    @Autowired
    private DocumentRepository documentRepository;

    @Autowired
    private EmailService emailService;

    @Autowired
    private PdfGeneratorService pdfGeneratorService;

    @PostMapping
    public ResponseEntity<ReservationPaymentDocument> createReservationPaymentDocument(@RequestBody ReservationPaymentDocument document) {
        ReservationPaymentDocument createdDocument = service.createDocument(document);
        return new ResponseEntity<>(createdDocument, HttpStatus.CREATED);
    }

    @PostMapping("/sendDocument")
    public ResponseEntity<String> sendDocument(@RequestBody Map<String, Object> request) {
        String email = (String) request.get("email");
        String documentId = (String) request.get("documentId");

        ReservationPaymentDocument document = documentRepository.findById(documentId)
                .orElseThrow(() -> new RuntimeException("Document not found"));

        try {
            byte[] pdf = pdfGeneratorService.generatePdf(document);
            emailService.sendEmailWithAttachment(email, pdf, "Reservation details", "reservation.pdf");
            return ResponseEntity.ok("Document sent to email: " + email);
        } catch (IOException e) {
            return ResponseEntity.status(500).body("Failed to send email: " + e.getMessage());
        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

}
