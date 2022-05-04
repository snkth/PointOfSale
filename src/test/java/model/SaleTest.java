
package model;

import dto.ItemDTO;
import dto.SaleLogDTO;
import model.ListItem;
import java.util.List;
import integration.AccountingSystemHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 */
public class SaleTest {
    private Sale saleTest;
    private SalesList salesListTest;
    private List<ListItem> theFinalList;
    private ListItem testListItem;
    private ItemDTO testItem;
    public SaleTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.saleTest = new Sale(salesListTest);
        testItem = new ItemDTO(10, "bread", "bread desc", "bread category", 0, 0, true);
        this.testListItem = new ListItem(testItem, 1);
        theFinalList.add(testListItem);
    }
    
    @AfterEach
    public void tearDown() {
        this.saleTest = null;
    }

    /**
     * Test of processSale method, of class Sale.
     */
    public void test() {
        System.out.println("processSale");
        int amountPaid = 300;
        AccountingSystemHandler accountingSystemHandler = null;
        InventorySystemHandler inventorySystemHandler = null;
        PrinterHandler printerHandler = null;
        Sale instance = saleTest;
        SaleLogDTO expResult = new SaleLogDTO(theFinalList, 300, 0, 0, 0);
        SaleLogDTO result = instance.processSale(amountPaid, accountingSystemHandler, inventorySystemHandler, printerHandler);
        assertEquals(expResult.getChange(), result.getChange());

    }
    
}



System.out.println("hej");
