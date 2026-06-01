package Runner;

import dto.KMFDetail;
import sarvices.KMFDetails;
import sarvices.KMFDetailsImpl;

public class KMFRunner {
    public static void main(String[] args)
        {
            KMFDetails kmfDetails = new KMFDetailsImpl();
            KMFDetail kmf = new KMFDetail("gkkgmgk", 789, 5, "nearxworkzcompany", 4000);
            kmfDetails.validateAndSaveinfo(kmf);

        }
    }

