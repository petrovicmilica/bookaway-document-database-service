package com.example.documentdatabaseservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import java.time.LocalDateTime;

@Document(collection = "reviews")
public class Review {

    @Id
    private String id;

    @Field(name = "rating")
    private int rating;

    @Field(name = "comment")
    private String comment;

    @Field(name = "good_comment")
    private String good_comment;

    @Field(name = "bad_comment")
    private String bad_comment;

    @Field(name = "review_date")
    private LocalDateTime reviewDate;

    @Field(name = "user_id")
    private String user_id;

    @Field(name = "reservation_id")
    private String reservation_id;

    @Field(name = "hotel_id")
    private String hotel_id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getGood_comment() {
        return good_comment;
    }

    public void setGood_comment(String good_comment) {
        this.good_comment = good_comment;
    }

    public String getBad_comment() {
        return bad_comment;
    }

    public void setBad_comment(String bad_comment) {
        this.bad_comment = bad_comment;
    }

    public LocalDateTime getReviewDate() {
        return reviewDate;
    }

    public void setReviewDate(LocalDateTime reviewDate) {
        this.reviewDate = reviewDate;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(String reservation_id) {
        this.reservation_id = reservation_id;
    }

    public String getHotel_id() {
        return hotel_id;
    }

    public void setHotel_id(String hotel_id) {
        this.hotel_id = hotel_id;
    }
}
