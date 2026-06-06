package impl;

import dao.FlightSearchDAO;
import dto.FlightSearchDTO;
import lombok.AllArgsConstructor;
import services.FlightService;

import java.util.Objects;

@AllArgsConstructor
public class FlightServiceImpl implements FlightService {
    private FlightSearchDAO flightSearchDAO;


    @Override
    public boolean validateAndSearch(FlightSearchDTO flightSearchDTO)
    {
       if(flightSearchDAO!=null)
       {
           System.out.println("flightsearchDAO is not null");


           if (Objects.nonNull(flightSearchDTO)) {
               System.out.println("flightsearchDTO is not null we willl vaidate ");
          boolean search=this.flightSearchDAO.searchFlight(flightSearchDTO);
           }
           else
           {
               System.out.println("flightsearchDTO is null  ");
           }
       }
       else {
           System.out.println("flightsearchDAO is null");
       }
        return false;
    }
}
