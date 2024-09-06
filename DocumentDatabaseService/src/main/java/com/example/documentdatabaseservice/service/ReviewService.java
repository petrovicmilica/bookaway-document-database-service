package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.model.Review;
import com.example.documentdatabaseservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ReviewService {

    @Autowired
    private ReviewRepository reviewRepository;

    public Review createReview(Review review) {
        return reviewRepository.save(review);
    }

    public List<Review> getReviewsByHotelId(String hotelId) {
        List<Review> allReviews = reviewRepository.findAll();
        List<Review> filteredReviews = new ArrayList<>();
        for (Review r : allReviews) {
            if (r.getHotel_id().equals(hotelId)) {
                filteredReviews.add(r);
            }
        }
        return filteredReviews;
    }
}
