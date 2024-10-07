package com.example.documentdatabaseservice.controller;

import com.example.documentdatabaseservice.model.HotelFacilities;
import com.example.documentdatabaseservice.model.RoomFacilities;
import com.example.documentdatabaseservice.service.HotelFacilitiesService;
import com.example.documentdatabaseservice.service.RoomFacilitiesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/room-facilities")
public class RoomFacilitiesController {
    @Autowired
    private RoomFacilitiesService roomFacilitiesService;

    @GetMapping("/room/{roomId}")
    public ResponseEntity<List<RoomFacilities>> findFacilitiesByRoomId

            (@PathVariable String roomId) {
        List<RoomFacilities> facilities = roomFacilitiesService.getFacilitiesByRoomId(roomId);
        return ResponseEntity.ok(facilities);
    }
}
