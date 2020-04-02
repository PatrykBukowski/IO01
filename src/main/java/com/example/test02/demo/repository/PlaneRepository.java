package com.example.test02.demo.repository;

import com.example.test02.demo.model.PlaneModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource
@CrossOrigin(origins = "http://localhost:4200")
public interface PlaneRepository extends JpaRepository<PlaneModel, Long> {
}
