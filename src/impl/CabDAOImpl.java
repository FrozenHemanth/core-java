package impl;

import dao.CabSearchDAO;
import dto.CabSearchDTO;

public class CabDAOImpl implements CabSearchDAO {

    @Override
    public boolean searchCab(CabSearchDTO cabSearchDTO) {

        if(cabSearchDTO != null) {
            System.out.println("Cab found successfully");
            return true;
        }

        return false;
    }
}