package dto;

 import lombok.*;

 import java.io.Serializable;

    @Getter
    @Setter
    @ToString
    @AllArgsConstructor

public class SalesDetail implements Serializable {

    private String productName;
    private int quantity;
    private double totalAmount;
    private String customerName;
    private String salesLocation;
}
