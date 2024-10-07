package com.example.documentdatabaseservice.controller;

import com.example.documentdatabaseservice.enums.ReviewStatus;
import com.example.documentdatabaseservice.model.Review;
import com.example.documentdatabaseservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ReviewController {

    @Autowired
    private ReviewService reviewService;

    @PostMapping
    public ResponseEntity<Review> createReview(@RequestBody Review review) {
        Review createdReview = reviewService.createReview(review);
        return ResponseEntity.ok(createdReview);
    }

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<Review>> createReview(@PathVariable String hotelId) {
        List<Review> reviews = reviewService.getReviewsByHotelId(hotelId);
        return ResponseEntity.ok(reviews);
    }

    @PutMapping("/{reviewId}/{status}")
    public ResponseEntity<Review> updateReviewStatus(@PathVariable String reviewId, @PathVariable String status) {
        Review updatedReview = reviewService.updateReviewStatus(reviewId, status);
        if (updatedReview != null) {
            return ResponseEntity.ok(updatedReview);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
