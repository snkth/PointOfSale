
package integration;

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
public class HandlerCreatorTest {
    
    public HandlerCreatorTest() {
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
     * Test of getAccountingSystemHandler method, of class HandlerCreator.
     */
    @Test
    public void testGetAccountingSystemHandler() {
        System.out.println("getAccountingSystemHandler");
        HandlerCreator instance = new HandlerCreator();
        AccountingSystemHandler expResult = null;
        AccountingSystemHandler result = instance.getAccountingSystemHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerDatabaseHandler method, of class HandlerCreator.
     */
    @Test
    public void testGetCustomerDatabaseHandler() {
        System.out.println("getCustomerDatabaseHandler");
        HandlerCreator instance = new HandlerCreator();
        CustomerDatabaseHandler expResult = null;
        CustomerDatabaseHandler result = instance.getCustomerDatabaseHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDiscountDatabaseHandler method, of class HandlerCreator.
     */
    @Test
    public void testGetDiscountDatabaseHandler() {
        System.out.println("getDiscountDatabaseHandler");
        HandlerCreator instance = new HandlerCreator();
        DiscountDatabaseHandler expResult = null;
        DiscountDatabaseHandler result = instance.getDiscountDatabaseHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getInventorySystemHandler method, of class HandlerCreator.
     */
    @Test
    public void testGetInventorySystemHandler() {
        System.out.println("getInventorySystemHandler");
        HandlerCreator instance = new HandlerCreator();
        InventorySystemHandler expResult = null;
        InventorySystemHandler result = instance.getInventorySystemHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrinterHandler method, of class HandlerCreator.
     */
    @Test
    public void testGetPrinterHandler() {
        System.out.println("getPrinterHandler");
        HandlerCreator instance = new HandlerCreator();
        PrinterHandler expResult = null;
        PrinterHandler result = instance.getPrinterHandler();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
