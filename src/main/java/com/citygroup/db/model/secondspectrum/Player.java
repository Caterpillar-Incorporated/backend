package com.citygroup.db.model.secondspectrum;

import lombok.Data;

import java.util.List;

@Data
public class Player {

    private String playerId;
    private int number;
    private List<Double> xyz;
    private double speed;
    private String optaId;
}
