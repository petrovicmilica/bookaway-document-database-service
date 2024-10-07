package com.example.documentdatabaseservice;

import com.example.documentdatabaseservice.model.RoomFacilities;
import com.example.documentdatabaseservice.repository.RoomFacilitiesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initRoomFacilitiesData(RoomFacilitiesRepository repository) {
        return args -> {
            if (repository.count() == 0) {
                RoomFacilities room1 = new RoomFacilities();
                room1.setSize(25);
                room1.setView(true);
                room1.setAir_conditioning(true);
                room1.setEnsuite_bathroom(true);
                room1.setSoundproofing(true);
                room1.setMinibar(false);
                room1.setFree_wifi(true);
                room1.setOther_facilities("Bathrobe, Safety deposit box, Toilet, Bath or shower, Towels, Linen, Socket near the bed, Desk, TV, Slippers, Telephone, Heating, Tea/Coffee maker, Hairdryer, Carpeted, Electric kettle");
                room1.setRoom_id("1");

                RoomFacilities room2 = new RoomFacilities();
                room2.setSize(30);
                room2.setView(false);
                room2.setAir_conditioning(true);
                room2.setEnsuite_bathroom(true);
                room2.setSoundproofing(false);
                room2.setMinibar(true);
                room2.setFree_wifi(false);
                room2.setOther_facilities("Bathrobe, Safety deposit box, Toilet, Bath or shower, Towels, Linen, Socket near the bed, Desk, TV, Slippers, Telephone, Heating, Tea/Coffee maker, Hairdryer, Carpeted, Electric kettle, Jacuzzi");
                room2.setRoom_id("2");

                RoomFacilities room3 = new RoomFacilities();
                room3.setSize(40);
                room3.setView(true);
                room3.setAir_conditioning(true);
                room3.setEnsuite_bathroom(true);
                room3.setSoundproofing(true);
                room3.setMinibar(true);
                room3.setFree_wifi(true);
                room3.setOther_facilities("Bathrobe, Safety deposit box, Toilet, Bath or shower, Towels, Linen, Socket near the bed, Desk, TV, Slippers, Telephone, Heating, Tea/Coffee maker, Hairdryer, Carpeted, Electric kettle");
                room3.setRoom_id("3");

                repository.save(room1);
                repository.save(room2);
                repository.save(room3);

                System.out.println("Room facilities data initialized.");
            } else {
                System.out.println("Room facilities data already exists.");
            }
        };
    }
}
