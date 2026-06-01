package Runner;
import dto.SalesDetail;
import sarvices.SalesDetails;
import sarvices.SalesDetailsImpl;

public class SalesRunner {

    public static void main(String[] args) {

        SalesDetails salesDetails = new SalesDetailsImpl();

        SalesDetail detail = new SalesDetail("Laptop", 5, 350000, "Ramesh", "Bangalore");

        salesDetails.validateAndSave(detail);
    }

}
