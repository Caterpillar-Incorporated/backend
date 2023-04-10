package com.citygroup.db.entity;

import com.citygroup.db.converter.TrackingDataConverter;
import com.citygroup.db.model.secondspectrum.TrackingData;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "TRACKING_DATA")
public class TrackingDataEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "game_id")
    private String gameId;

    @Convert(converter = TrackingDataConverter.class)
    private TrackingData data;
}
