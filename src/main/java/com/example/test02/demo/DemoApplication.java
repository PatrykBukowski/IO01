package com.example.test02.demo;

import com.example.test02.demo.model.AirlineModel;
import com.example.test02.demo.model.AirportModel;
import com.example.test02.demo.model.PlaneModel;
import com.example.test02.demo.repository.AirLineRepository;
import com.example.test02.demo.repository.AirportRepository;
import com.example.test02.demo.repository.PlaneRepository;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Bean ApplicationRunner initAirport(AirportRepository repository){
        return args -> {
            for (int i = 0; i < 10; i++) {
                AirportModel airport = new AirportModel();
                airport.setName("Lotnisko" + i);
                airport.setgHeight(10*Math.random());
                airport.setgWidth(10*Math.random());
                airport.setValue(((int) (10+(10 * Math.random()))));
                repository.save(airport);
            }
            repository.findAll().forEach(System.out::println);
        };
    }

    @Bean
    ApplicationRunner initAirline(AirLineRepository airLineRepository, PlaneRepository repository) {
        return args -> {
            AirlineModel airline = new AirlineModel();
            airline.setName("PolskielotyTanio");
            airLineRepository.save(airline);
            airLineRepository.findAll().forEach(System.out::println);

            try {
                PlaneModel plane = new PlaneModel();
                plane.setName("DużySamolot5000");
                plane.setMaxDistance(500);
                plane.setNumberOfSeats(400);
                plane.setAirlineModel(airLineRepository.findAll().get(0));
                repository.save(plane);
                repository.findAll().forEach(System.out::println);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        };
    }

}
