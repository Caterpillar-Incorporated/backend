package com.citygroup.db.controller;

import com.citygroup.db.model.TrackingData;
import com.citygroup.db.service.TrackingDataService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TrackingDataController {

    private final TrackingDataService trackingDataService;

    public TrackingDataController(TrackingDataService trackingDataService) {
        this.trackingDataService = trackingDataService;
    }

    @GetMapping("/tracking-data")
    public List<TrackingData> getTrackingData(@RequestParam long start, @RequestParam long end) {
        return trackingDataService.getTrackingDataRange(start, end);
    }

    @GetMapping("/test")
    public String getTrackingData() {
        return "hello to flutter land";
    }
}
