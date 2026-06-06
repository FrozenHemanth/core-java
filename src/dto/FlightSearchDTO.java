package dto;

import enums.TripType;
import lombok.*;

import java.time.LocalDate;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor

public class FlightSearchDTO {
private TripType tripType;
private String fromAddress;
private String toAddress;
private LocalDate departuredate;
private int noOFPassangers;
}
