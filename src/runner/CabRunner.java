package runner;

import dao.CabSearchDAO;
import dto.CabSearchDTO;
import impl.CabDAOImpl;
import impl.CabServiceImpl;
import services.CabService;

public class CabRunner {

    public static void main(String[] args)
    {
        CabSearchDAO cabSearchDAO=new CabDAOImpl();
        CabService cabServic =new CabServiceImpl();
        CabSearchDTO dto=new CabSearchDTO();
        boolean found = CabService.validateAndSearch(dto);

    }

}
