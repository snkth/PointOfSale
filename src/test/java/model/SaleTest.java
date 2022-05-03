
package model;

import dto.SaleLogDTO;
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
 * @author Peter
 */
public class SaleTest {
    private Sale saleTest;
    private SalesList salesListTest;
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
    }
    
    @AfterEach
    public void tearDown() {
        this.saleTest = null;
    }

    /**
     * Test of processSale method, of class Sale.
     */
    @Test
    public void testProcessSale() {
        System.out.println("processSale");
        int amountPaid = 30;
        AccountingSystemHandler accountingSystemHandler = null;
        InventorySystemHandler inventorySystemHandler = null;
        PrinterHandler printerHandler = null;
        Sale instance = saleTest;
        SaleLogDTO expResult = new SaleLogDTO(theFinalList, 300, totalPrice, change, totalTax);
        SaleLogDTO result = instance.processSale(amountPaid, accountingSystemHandler, inventorySystemHandler, printerHandler);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
