package com.citygroup.db.controller;

import com.citygroup.db.model.secondspectrum.TrackingData;
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
    public List<TrackingData> getTrackingData(
            @RequestParam String gameId,
            @RequestParam long start,
            @RequestParam long end
    ) {
        return trackingDataService.getTrackingDataRange(gameId, start, end);
    }
}
