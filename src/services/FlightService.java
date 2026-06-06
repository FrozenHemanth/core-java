package services;

import dto.FlightSearchDTO;

public interface FlightService {
    boolean validateAndSearch(FlightSearchDTO flightSearchDTO);


}
