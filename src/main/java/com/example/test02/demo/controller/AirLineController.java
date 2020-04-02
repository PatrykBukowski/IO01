package com.example.test02.demo.controller;

import com.example.test02.demo.model.AirlineModel;
import com.example.test02.demo.repository.AirLineRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class AirLineController {
    private AirLineRepository repository;

    public AirLineController(AirLineRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/airlines")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<AirlineModel> shorAirlines() {
        return repository.findAll().stream().collect(Collectors.toList());
    }
}
