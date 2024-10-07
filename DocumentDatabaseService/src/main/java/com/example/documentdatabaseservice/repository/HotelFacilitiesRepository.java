package com.example.documentdatabaseservice.repository;

import com.example.documentdatabaseservice.model.HotelFacilities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface HotelFacilitiesRepository extends MongoRepository<HotelFacilities, String> {
}
