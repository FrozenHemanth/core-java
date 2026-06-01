package dto;
import lombok.*;

import java.io.Serializable;
    @Getter
    @Setter
    @ToString
    @AllArgsConstructor

    public class KMFDetail implements Serializable {
        private String pincode;
        private double noOfproducts;
        private double price;
        private String place;
        private int costOfbulding;



    }
