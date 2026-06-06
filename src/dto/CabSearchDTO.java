package dto;

import enums.CabType;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class CabSearchDTO {

    private String pickupLocation;
    private String dropLocation;
    private CabType cabType;
    private int numberOfPassengers;
    private double estimatedDistance;
}
