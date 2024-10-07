package com.example.documentdatabaseservice.service;

import com.example.documentdatabaseservice.model.HotelFacilities;
import com.example.documentdatabaseservice.model.RoomFacilities;
import com.example.documentdatabaseservice.repository.RoomFacilitiesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomFacilitiesService {
    @Autowired
    private RoomFacilitiesRepository roomFacilitiesRepository;

    public List<RoomFacilities> getFacilitiesByRoomId(String roomId) {
        List<RoomFacilities> allFacilities = roomFacilitiesRepository.findAll();
        List<RoomFacilities> filteredFacilities = new ArrayList<>();
        for (RoomFacilities r : allFacilities) {
            if (r.getRoom_id().equals(roomId)) {
                filteredFacilities.add(r);
            }
        }
        return filteredFacilities;
    }
}
