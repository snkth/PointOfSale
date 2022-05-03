
package model;
import java.util.ArrayList;
import java.util.List;

import dto.ItemDTO;
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
public class SalesListTest {
    private ItemDTO testItem;
    private ItemDTO otherTestItem;
    private List<ListItem> theItemList;
    public SalesListTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.testItem = new ItemDTO(13, "bread", "bread desc", "bread category", 40, 1, true);
        this.otherTestItem = new ItemDTO(13, "milk", "milk desc", "dairy category", 23, 13, false);
        this.theItemList = new ArrayList<ListItem>();
    }
    
    @AfterEach
    public void tearDown() {
        this.testItem = null;
        this.theItemList = null;
    }

    /**
     * Test of addItem method, of class SalesList.
     */
    @Test
    public void testAddItem() {
        System.out.println("addItem");
        ItemDTO itemDTO = this.testItem;
        int quantity = 1;
        SalesList instance = new SalesList();
        SalesListDTO expResult = new SalesListDTO(theItemList, 40, 1);
        SalesListDTO result = instance.addItem(itemDTO, quantity);
        assertEquals(expResult, result);
    }

    public void testAddItemQuantity(){

    }
    /**
     * Test if item is valid
     * 
    */
    @Test
    public void testItemIsValid() {
        System.out.println("addItem");
        ItemDTO instance = this.testItem;
        boolean expResult = true;
        boolean result = instance.getValidity();
        assertEquals(expResult, result, "Item validity is not true");
    }
    /**
     *  Test if item is invalid
     */
    @Test
    public void ItemIsNotValid() {
        System.out.println("addItem");
        ItemDTO instance = this.otherTestItem;
        boolean expResult = false;
        boolean result = instance.getValidity();
        assertEquals(expResult, result, "Item validity is not false");
    }



}
