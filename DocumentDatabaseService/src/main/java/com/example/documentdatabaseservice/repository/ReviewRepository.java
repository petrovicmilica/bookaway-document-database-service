package com.example.documentdatabaseservice.repository;

import com.example.documentdatabaseservice.model.Review;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ReviewRepository extends MongoRepository<Review, String> {
}
