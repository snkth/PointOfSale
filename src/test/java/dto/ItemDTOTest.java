
package dto;

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
public class ItemDTOTest {
    private ItemDTO testItem;
    
    public ItemDTOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.testItem = new ItemDTO(124412, "milk", "Sugary milk", "dairy", 30, 13, true);
        
    }
    
    @AfterEach
    public void tearDown() {
        this.testItem = null;
    }

    /**
     * Test of getItemID method, of class ItemDTO.
     */
    @Test
    public void testGetItemID() {
        System.out.println("getItemID");
        ItemDTO testItem = this.testItem;
        int expResult = 124412;
        int result = testItem.getItemID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getItemName method, of class ItemDTO.
     */
    @Test
    public void testGetItemName() {
        System.out.println("getItemName");
        ItemDTO testItem = this.testItem;
        String expResult = "milk";
        String result = testItem.getItemName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getItemDescription method, of class ItemDTO.
     */
    @Test
    public void testGetItemDescription() {
        System.out.println("getItemDescription");
        ItemDTO testItem = this.testItem;
        String expResult = "Sugary milk";
        String result = testItem.getItemDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getItemCategory method, of class ItemDTO.
     */
    @Test
    public void testGetItemCategory() {
        System.out.println("getItemCategory");
        ItemDTO testItem = this.testItem;
        String expResult = "dairy";
        String result = testItem.getItemCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getPrice method, of class ItemDTO.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ItemDTO testItem = this.testItem;
        double expResult = 30;
        double result = testItem.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTaxRate method, of class ItemDTO.
     */
    @Test
    public void testGetTaxRate() {
        System.out.println("getTaxRate");
        ItemDTO testItem = this.testItem;
        double expResult = 13;
        double result = testItem.getTaxRate();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getValidity method, of class ItemDTO.
     */
    @Test
    public void testGetValidity() {
        System.out.println("getValidity");
        ItemDTO testItem = this.testItem;
        boolean expResult = true;
        boolean result = testItem.getValidity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
