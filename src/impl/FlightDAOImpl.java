package impl;

import dao.FlightSearchDAO;
import dto.FlightSearchDTO;

public class FlightDAOImpl implements FlightSearchDAO {
    @Override
    public boolean searchFlight(FlightSearchDTO flightSearchDTO)
    {
        if (flightSearchDTO != null) {
            System.out.println("flight info is not null");
            return true;
        }
        return false;
    }

    }


