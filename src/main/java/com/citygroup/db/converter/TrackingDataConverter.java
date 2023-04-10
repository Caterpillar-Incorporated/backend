package com.citygroup.db.converter;

import com.citygroup.db.model.secondspectrum.TrackingData;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.persistence.AttributeConverter;

import java.io.IOException;

public class TrackingDataConverter implements AttributeConverter<TrackingData, String> {

    private final ObjectMapper mapper = new ObjectMapper();

    @Override
    public String convertToDatabaseColumn(TrackingData trackingData) {
        String value = "";

        try {
            value = mapper.writeValueAsString(trackingData);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }

        return value;
    }

    @Override
    public TrackingData convertToEntityAttribute(String s) {
        TrackingData data = new TrackingData();

        TypeReference<TrackingData> typeRef = new TypeReference<>() {};

        try {
            data = mapper.readValue(s, typeRef);
        } catch (IOException e) {
            e.printStackTrace();
        }

        return data;
    }
}
