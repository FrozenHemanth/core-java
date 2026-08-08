package dto;

import lombok.*;

import java.io.Serializable;
@ToString
@AllArgsConstructor
@Getter
@Setter
@NoArgsConstructor
public class PaymentDTO implements Serializable {
private int account_no;
private  String holder_name;
private long amount;
private String payment_type;
private String payment_date;

}
