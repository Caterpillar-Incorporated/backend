package com.citygroup.db.model.secondspectrum;

import lombok.Data;

import java.util.List;

@Data
public class TrackingData {

    private int period;
    private int frameIdx;
    private double gameClock;
    private long wallClock;
    private List<Player> homePlayers;
    private List<Player> awayPlayers;
    private Ball ball;
    private boolean live;
    private String lastTouch;
}
