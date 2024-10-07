package com.example.documentdatabaseservice;

import com.example.documentdatabaseservice.model.HotelFacilities;
import com.example.documentdatabaseservice.repository.HotelFacilitiesRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Bean
    CommandLineRunner loadHotelFacilities(HotelFacilitiesRepository repository) {
        return args -> {
            HotelFacilities hotelFacilities = new HotelFacilities();
            hotelFacilities.setSmoking_rooms(true);
            hotelFacilities.setDisabled_guests(true);
            hotelFacilities.setFree_parking(true);
            hotelFacilities.setFree_wifi(true);
            hotelFacilities.setFitness_centre(true);
            hotelFacilities.setAirport_shuttle(true);
            hotelFacilities.setBar(true);
            hotelFacilities.setBreakfast(true);
            hotelFacilities.setBathroom("Private bathroom, Towels, Bath or shower, Slippers, Bathrobe, Hairdryer");
            hotelFacilities.setBedroom("Double bed, Linen, Wardrobe or closet");
            hotelFacilities.setMedia_and_technology("Flat screen TV, Satellite channels, Telephone");
            hotelFacilities.setFood_and_drink("Restaurant, Room service, Bar, Minibar, Tea/Coffee maker");
            hotelFacilities.setParking("Parking garage, Accessible parking");
            hotelFacilities.setSafety("24/7 security, Safe deposit box, Security alarm");
            hotelFacilities.setGeneral("Air conditioning, Heating, Soundproofing, Vending machine, Carpeted, Lift");
            hotelFacilities.setLanguages("English, French, Spanish");
            hotelFacilities.setHotel_id("1");

            repository.save(hotelFacilities);

            System.out.println("Hotel facilities inserted into MongoDB");
        };
    }
}
