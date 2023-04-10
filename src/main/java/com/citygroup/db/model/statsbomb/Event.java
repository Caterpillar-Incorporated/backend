package com.citygroup.db.model.statsbomb;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@JsonIgnoreProperties(ignoreUnknown = true)
@Data
public class Event {

    private String id;
    private int index;
    private int period;
    private String timestamp;
    private int minute;
    private int second;
    private EventType type;
    private int possession;
    @JsonProperty("possession_team")
    private Team possessionTeam;
    @JsonProperty("play_pattern")
    private PlayPattern playPattern;
    private Team team;
    private Player player;
    private Position position;
    private double[] location;
    private double duration;
    @JsonProperty("under_pressure")
    private boolean underPressure;
    @JsonProperty("off_camera")
    private boolean offCamera;
    private boolean out;
    @JsonProperty("related_events")
    private String[] relatedEvents;
    private Tactics tactics;
    @JsonProperty("obv_for_after")
    private double obvForAfter;
    @JsonProperty("obv_for_before")
    private double obvForBefore;
    @JsonProperty("obv_for_net")
    private double obvForNet;
    @JsonProperty("obv_against_after")
    private double obvAgainstAfter;
    @JsonProperty("obv_against_before")
    private double obvAgainstBefore;
    @JsonProperty("obv_against_net")
    private double obvAgainstNet;
    @JsonProperty("obv_total_net")
    private double obvTotalNet;

    @Data
    private static class EventType {
        private int id;
        private String name;
    }

    @Data
    private static class Team {
        private int id;
        private String name;
    }

    @Data
    private static class PlayPattern {
        private int id;
        private String name;
    }

    @Data
    private static class Player {
        private int id;
        private String name;
    }

    @Data
    private static class Position {
        private int id;
        private String name;
    }

    @Data
    private static class Tactics {
        private int formation;
        private Lineup[] lineup;
    }

    @Data
    private static class Lineup {
        private Player player;
        private Position position;
        @JsonProperty("jersey_number")
        private int jerseyNumber;
    }
}
