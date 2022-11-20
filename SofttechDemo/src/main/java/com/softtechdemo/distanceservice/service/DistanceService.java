package com.softtechdemo.distanceservice.service;

import com.softtechdemo.distanceservice.models.Coordinate;
import org.springframework.stereotype.Service;

@Service
public class DistanceService {
    public double calculateDistance(Coordinate c1, Coordinate c2){
        return Math.sqrt(Math.pow(c1.latitude - c2.latitude, 2) + Math.pow(c1.longitude - c2.longitude, 2));
    }
}
