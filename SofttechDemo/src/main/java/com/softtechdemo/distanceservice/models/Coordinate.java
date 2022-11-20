package com.softtechdemo.distanceservice.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
public class Coordinate {
    public double latitude;
    public double longitude;
}
