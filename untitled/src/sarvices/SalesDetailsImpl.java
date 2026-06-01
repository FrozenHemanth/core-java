package sarvices;

import dto.SalesDetail;

public class SalesDetailsImpl implements SalesDetails{

    @Override
    public boolean validateAndSave(SalesDetail detail) {
        System.out.println("Executing validateAndSave in SalesDetailsImpl");

        String productName = detail.getProductName();

        if(productName != null &&
                productName.length() >= 3 &&
                productName.length() <= 30 &&
                productName.matches("[a-zA-Z ]+"))
        {
            System.out.println("Valid product name");
        }
        else
        {
            System.out.println("Invalid product name");
            return false;
        }

        if(detail.getQuantity() > 0)
        {
            System.out.println("Valid quantity");
        }
        else
        {
            System.out.println("Invalid quantity");
            return false;
        }

        if(detail.getTotalAmount() > 100)
        {
            System.out.println("Valid amount");
        }
        else
        {
            System.out.println("Invalid amount");
            return false;
        }

        System.out.println("Validation completed");
        return true;
    }
}
