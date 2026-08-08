package Runner;

import dao.PaymentDAO;
import daoImpl.PaymentDAOImpl;
import dto.PaymentDTO;

import java.util.ArrayList;
import java.util.List;

public class PaymentRunner {
    public static void main(String[] args) {
        PaymentDAO paymentDAO = new PaymentDAOImpl();
        List<PaymentDTO> ref=paymentDAO.getPaymentList();
        for(PaymentDTO check:ref){
            System.out.println(check);

        }
        List<PaymentDTO> paymentDTOList = new ArrayList<>();

        PaymentDTO paymentDTO=new PaymentDTO();
        paymentDTO.setAccount_no(1004);
        paymentDTO.setHolder_name("hemanth");
        paymentDTO.setAmount(4000);
        paymentDTO.setPayment_type("UPI");
        paymentDTO.setPayment_date("18-6-2026");

        paymentDTOList.add(paymentDTO);
        paymentDAO.batchInsert(paymentDTOList);
    }
}
