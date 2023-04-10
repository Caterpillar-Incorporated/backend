package com.citygroup.db.repository;

import com.citygroup.db.entity.TrackingDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TrackingDataRepository extends JpaRepository<TrackingDataEntity, Long> {

    List<TrackingDataEntity> findAllByGameIdEqualsAndIdGreaterThanEqualAndIdLessThan(String gameId, Long start, Long end);
}
