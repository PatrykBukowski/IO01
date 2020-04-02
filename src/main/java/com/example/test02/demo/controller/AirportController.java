package com.example.test02.demo.controller;

import com.example.test02.demo.model.AirportModel;
import com.example.test02.demo.repository.AirportRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class AirportController {
    private AirportRepository repository;

    public AirportController(AirportRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/airports")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<AirportModel> showAirports() {
        return new ArrayList<>(repository.findAll());
    }
}
