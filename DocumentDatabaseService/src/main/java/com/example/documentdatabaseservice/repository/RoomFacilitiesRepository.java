package com.example.documentdatabaseservice.repository;

import com.example.documentdatabaseservice.model.RoomFacilities;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RoomFacilitiesRepository extends MongoRepository<RoomFacilities, String> {
}
