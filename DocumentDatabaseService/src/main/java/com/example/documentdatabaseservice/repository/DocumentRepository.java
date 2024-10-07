package com.example.documentdatabaseservice.repository;

import com.example.documentdatabaseservice.model.ReservationPaymentDocument;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DocumentRepository extends MongoRepository<ReservationPaymentDocument, String> {
}
