package com.softtechdemo.distanceservice.models;

import lombok.Data;

@Data
public class Distance {
    public double value;

    public Distance(double value){
        this.value = value;
    }
}
