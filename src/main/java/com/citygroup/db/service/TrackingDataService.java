package com.citygroup.db.service;

import com.citygroup.db.entity.TrackingDataEntity;
import com.citygroup.db.model.TrackingData;
import com.citygroup.db.repository.TrackingDataRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TrackingDataService {

    private final TrackingDataRepository trackingDataRepository;

    public TrackingDataService(TrackingDataRepository trackingDataRepository) {
        this.trackingDataRepository = trackingDataRepository;
    }

    public List<TrackingData> getTrackingDataRange(Long start, Long end) {
        return trackingDataRepository.findAllByIdGreaterThanEqualAndIdLessThan(start, end).stream().map(TrackingDataEntity::getData).collect(Collectors.toList());
    }
}
