package impl;

import dao.CabSearchDAO;
import dto.CabSearchDTO;
import lombok.AllArgsConstructor;
import services.CabService;
@AllArgsConstructor
public class CabServiceImpl implements CabService {

    private CabSearchDAO cabSearchDAO;

    public CabServiceImpl() {

    }

    @Override
    public boolean validateAndSearch(CabSearchDTO cabSearchDTO) {

        if(cabSearchDAO != null) {

            System.out.println("DAO is not null");

            if(cabSearchDTO != null) {

                System.out.println("DTO is not null");

                String pickup = cabSearchDTO.getPickupLocation();
                String drop = cabSearchDTO.getDropLocation();

                if(pickup != null && drop != null) {

                    return cabSearchDAO.searchCab(cabSearchDTO);
                }
            }
        }

        return false;
    }
}