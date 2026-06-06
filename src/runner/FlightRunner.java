package runner;

import dao.FlightSearchDAO;
import dto.FlightSearchDTO;
import impl.FlightDAOImpl;
import impl.FlightServiceImpl;
import services.FlightService;

public class FlightRunner
{
    public static void main(String[] args) {
        FlightSearchDAO flightSearchDAO=new FlightDAOImpl();
        FlightService flightService=new FlightServiceImpl(flightSearchDAO);
        FlightSearchDTO flightSearchDTO=new FlightSearchDTO();
        boolean found=flightService.validateAndSearch(flightSearchDTO);

        System.out.println("saved info"+found);
    }
}
