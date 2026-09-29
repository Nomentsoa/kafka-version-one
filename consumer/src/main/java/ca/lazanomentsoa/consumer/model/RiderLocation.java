package ca.lazanomentsoa.consumer.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor @NoArgsConstructor
@ToString
public class RiderLocation {
    private String riderId;
    private double latitude;
    private double longitude;
}
