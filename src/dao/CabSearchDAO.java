package dao;

import dto.CabSearchDTO;

public interface CabSearchDAO {

    boolean searchCab(CabSearchDTO cabSearchDTO);
}