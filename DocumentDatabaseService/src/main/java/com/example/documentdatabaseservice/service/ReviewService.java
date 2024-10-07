package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.enums.ReviewStatus;
import com.example.documentdatabaseservice.model.Review;
import com.example.documentdatabaseservice.repository.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    public Review updateReviewStatus(String reviewId, String status) {
        Optional<Review> review = reviewRepository.findById(reviewId);
        if (review != null)
        {
            if(status.equals("accepted"))
            {
                review.get().setReviewStatus(ReviewStatus.ACCEPTED);
                reviewRepository.save(review.get());
                return review.get();
            }else
            {
                review.get().setReviewStatus(ReviewStatus.REJECTED);
                reviewRepository.save(review.get());
                return review.get();
            }
        }
        return null;
    }
}
