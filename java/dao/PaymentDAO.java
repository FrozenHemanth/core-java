package dao;

import dto.PaymentDTO;

import java.util.List;

public interface PaymentDAO {
    String batchInsert(List<PaymentDTO> paymentDTOS);
    List<PaymentDTO> getPaymentList();

}
