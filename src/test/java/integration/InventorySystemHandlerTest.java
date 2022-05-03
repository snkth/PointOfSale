
package integration;

import dto.ItemDTO;
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
public class InventorySystemHandlerTest {
    
    public InventorySystemHandlerTest() {
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
     * Test of getItem method, of class InventorySystemHandler.
     */
    @Test
    public void testGetItem() {
        System.out.println("getItem");
        int itemID = 0;
        InventorySystemHandler instance = new InventorySystemHandler();
        ItemDTO expResult = null;
        ItemDTO result = instance.getItem(itemID);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateInventory method, of class InventorySystemHandler.
     */
    @Test
    public void testUpdateInventory() {
        System.out.println("updateInventory");
        SaleLogDTO saleLogDTO = null;
        InventorySystemHandler instance = new InventorySystemHandler();
        instance.updateInventory(saleLogDTO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
