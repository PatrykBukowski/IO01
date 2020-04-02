package com.example.test02.demo.controller;

import com.example.test02.demo.model.PlaneModel;
import com.example.test02.demo.repository.PlaneRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@RestController
public class PlaneController {
    private PlaneRepository repository;

    public PlaneController(PlaneRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/planes")
    @CrossOrigin(origins = "http://localhost:4200")
    public Collection<PlaneModel> showPlanes(){
        return new ArrayList<>(repository.findAll());
    }
}
