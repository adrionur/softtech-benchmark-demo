package com.softtechdemo.distanceservice.controllers;

import com.softtechdemo.distanceservice.models.*;
import com.softtechdemo.distanceservice.service.DistanceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/distance")
public class DistanceController {
    private DistanceService distanceService;
    @Autowired
    public DistanceController(DistanceService distanceService){
        this.distanceService = distanceService;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String healthCheck(){
        return "UP";
    }

    @RequestMapping(
            value = "/calculate",
    method = RequestMethod.POST,
    produces = MediaType.APPLICATION_JSON_VALUE,
    consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Distance> calculate(@RequestBody List<Coordinate> coordinates) {
        double value = distanceService.calculateDistance(coordinates.get(0), coordinates.get(1));
        Distance d = new Distance(value);
        return ResponseEntity.ok(d);
    }

}
