package com.example.documentdatabaseservice;

import com.example.documentdatabaseservice.model.Product;
import com.example.documentdatabaseservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner init(ProductRepository productRepository) {
        return args -> {
            // Proveri da li kolekcija već postoji, ako ne, umetni proizvod
            if (productRepository.count() == 0) {
                Product product = new Product();
                product.setName("Sample Product");
                product.setPrice(19.99);
                productRepository.save(product);
                System.out.println("Product added to MongoDB");
            }
        };
    }
}
