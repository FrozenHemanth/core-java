package sarvices;

import dto.KMFDetail;

public class KMFDetailsImpl implements KMFDetails
{
    @Override
    public boolean validateAndSaveinfo(KMFDetail detail) {
        {
            System.out.println("Rexecuting valid and save in kmfdetailimpl"+detail);
            String pincode=detail.getPincode();
        if(pincode!=null && pincode.length() >=2 && pincode.length()<=100 && pincode.matches("[a-zA-Z,]+"))
        {  System.out.println("perfect detail");
        }else{
            System.out.println("invailed details");
          return false;
        }
        if (detail.getPrice()>4)
        {
            System.out.println("valied price");
            System.out.println("validation is done");

            return false;
        }

        else
        {
            System.out.println("invailed price");
        }


        }
        return false;

    }


}
