package testSearch;

import org.testng.annotations.Test;
import pro.CreditCardService;

public class CreditCardTest {

    public class CreditCardtest extends CreditCardService {

        @Test
        public void ProjectLoan() {
            super.ProjectLoan();
        }

        @Test
        public void creditService() {
            super.creditService();
        }

        @Test
        public void ExclusiveCredit() {
            super.ExclusiveCredit();
        }

        @Test
        public void CommercialAccBenifit() {
            super.CommercialAccBenifit();
        }
    }

}
