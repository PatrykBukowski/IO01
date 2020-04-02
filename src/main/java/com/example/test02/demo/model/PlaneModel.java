package com.example.test02.demo.model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class PlaneModel{
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private int numberOfSeats;
    @NotNull
    private int maxDistance;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private AirlineModel airlineModel;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getMaxDistance() {
        return maxDistance;
    }

    public void setMaxDistance(int maxDistance) {
        this.maxDistance = maxDistance;
    }

    public String getAirlineModel() {
        return airlineModel.getName();
    }

    public void setAirlineModel(AirlineModel airlineModel) {
        this.airlineModel = airlineModel;
    }
}
