
package controller;

import dto.SaleLogDTO;
import dto.SalesListDTO;
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
public class ControllerTest {
    
    public ControllerTest() {
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
     * Test of startSale method, of class Controller.
     */
    @Test
    public void testStartSale() {
        System.out.println("startSale");
        Controller instance = null;
        instance.startSale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of scanItem method, of class Controller.
     */
    @Test
    public void testScanItem() {
        System.out.println("scanItem");
        int itemID = 0;
        int quantity = 0;
        Controller instance = null;
        SalesListDTO expResult = null;
        SalesListDTO result = instance.scanItem(itemID, quantity);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of endSale method, of class Controller.
     */
    @Test
    public void testEndSale() {
        System.out.println("endSale");
        Controller instance = null;
        instance.endSale();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of processSale method, of class Controller.
     */
    @Test
    public void testProcessSale() {
        System.out.println("processSale");
        int amountPaid = 0;
        Controller instance = null;
        SaleLogDTO expResult = null;
        SaleLogDTO result = instance.processSale(amountPaid);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
