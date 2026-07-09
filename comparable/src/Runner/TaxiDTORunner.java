package Runner;

import dto.TaxiDTO;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static java.util.Collection.*;

public class TaxiDTORunner {
    public static void main(String[] args) {
        TaxiDTO taxiDTO = new TaxiDTO(1, "Taxi", "Red", 80);
        TaxiDTO taxiDTO1 = new TaxiDTO(2, "Taxi", "white", 100);
        TaxiDTO taxiDTO2 = new TaxiDTO(3, "Taxi2", "black", 50);
        TaxiDTO taxiDTO3 = new TaxiDTO(4, "Taxi3", "blue", 70  );
        TaxiDTO taxiDTO4 = new TaxiDTO(5, "Taxi4", "green", 60);
        List<TaxiDTO> taxiDTOS = new ArrayList<>();
        taxiDTOS.add(taxiDTO);
        taxiDTOS.add(taxiDTO1);
        taxiDTOS.add(taxiDTO2);
        taxiDTOS.add(taxiDTO3);
        taxiDTOS.add(taxiDTO4);
        Collections.sort(taxiDTOS);
  System.out.println(taxiDTOS);
    }
}
