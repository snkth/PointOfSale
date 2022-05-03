
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
public class PrinterHandlerTest {
    
    public PrinterHandlerTest() {
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
     * Test of printReceipt method, of class PrinterHandler.
     */
    @Test
    public void testPrintReceipt() {
        System.out.println("printReceipt");
        SaleLogDTO saleLogDTO = null;
        PrinterHandler instance = new PrinterHandler();
        instance.printReceipt(saleLogDTO);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
