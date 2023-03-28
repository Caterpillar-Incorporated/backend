package com.citygroup.db.model;

import lombok.Data;

import java.util.List;

@Data
public class Ball {

    private List<Double> xyz;
    private double speed;
}
