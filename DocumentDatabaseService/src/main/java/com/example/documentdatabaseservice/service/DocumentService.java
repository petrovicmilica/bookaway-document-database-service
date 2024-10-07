package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.model.ReservationPaymentDocument;
import com.example.documentdatabaseservice.repository.DocumentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DocumentService {

    @Autowired
    private DocumentRepository repository;

    public ReservationPaymentDocument createDocument(ReservationPaymentDocument document) {
        return repository.save(document);
    }
}
