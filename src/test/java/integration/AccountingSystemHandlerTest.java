
package integration;

import dto.SaleLogDTO;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Peter
 */
public class AccountingSystemHandlerTest {
    
    public AccountingSystemHandlerTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of updateAccounting method, of class AccountingSystemHandler.
     */
    @Test
    public void testUpdateAccounting() {
        System.out.println("updateAccounting");
        SaleLogDTO saleLogDTO = null;
        AccountingSystemHandler instance = new AccountingSystemHandler();
        instance.updateAccounting(saleLogDTO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
