package com.example.documentdatabaseservice.controller;

import com.example.documentdatabaseservice.model.HotelFacilities;
import com.example.documentdatabaseservice.model.Review;
import com.example.documentdatabaseservice.service.HotelFacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/hotel-facilities")
public class HotelFacilitiesController {
    @Autowired
    private HotelFacilitiesService hotelFacilitiesService;

    @GetMapping("/hotel/{hotelId}")
    public ResponseEntity<List<HotelFacilities>> findFacilitiesByHotelId(@PathVariable String hotelId) {
        List<HotelFacilities> facilities = hotelFacilitiesService.getFacilitiesByHotelId(hotelId);
        return ResponseEntity.ok(facilities);
    }

}
