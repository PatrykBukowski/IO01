package com.example.test02.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class AirportModel {
    @Id
    @GeneratedValue
    private Long id;
    @NotNull
    private String name;
    @NotNull
    private Integer value;
    @NotNull
    private Double gWidth;
    @NotNull
    private Double gHeight;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Double getgWidth() {
        return gWidth;
    }

    public void setgWidth(Double gWidth) {
        this.gWidth = gWidth;
    }

    public Double getgHeight() {
        return gHeight;
    }

    public void setgHeight(Double gHeight) {
        this.gHeight = gHeight;
    }
}
