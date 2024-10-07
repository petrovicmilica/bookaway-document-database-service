package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.model.HotelFacilities;
import com.example.documentdatabaseservice.model.Review;
import com.example.documentdatabaseservice.repository.HotelFacilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class HotelFacilitiesService {
    @Autowired
    private HotelFacilitiesRepository hotelFacilitiesRepository;

    public List<HotelFacilities> getFacilitiesByHotelId(String hotelId) {
        List<HotelFacilities> allFacilities = hotelFacilitiesRepository.findAll();
        List<HotelFacilities> filteredFacilities = new ArrayList<>();
        for (HotelFacilities r : allFacilities) {
            if (r.getHotel_id().equals(hotelId)) {
                filteredFacilities.add(r);
            }
        }
        return filteredFacilities;
    }
}
