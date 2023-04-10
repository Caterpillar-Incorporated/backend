package com.citygroup.db.service;

import com.citygroup.db.entity.TrackingDataEntity;
import com.citygroup.db.model.secondspectrum.TrackingData;
import com.citygroup.db.repository.TrackingDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TrackingDataService {

    private final TrackingDataRepository trackingDataRepository;

    public TrackingDataService(TrackingDataRepository trackingDataRepository) {
        this.trackingDataRepository = trackingDataRepository;
    }

    public List<TrackingData> getTrackingDataRange(String gameId, Long start, Long end) {
        return trackingDataRepository.findAllByGameIdEqualsAndIdGreaterThanEqualAndIdLessThan(gameId, start, end)
                .stream()
                .map(TrackingDataEntity::getData)
                .toList();
    }
}
