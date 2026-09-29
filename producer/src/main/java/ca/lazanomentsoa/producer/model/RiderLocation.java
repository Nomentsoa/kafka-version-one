package ca.lazanomentsoa.producer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;
}
