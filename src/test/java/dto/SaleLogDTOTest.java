
package dto;

import java.time.LocalDateTime;
import java.util.List;
import model.ListItem;
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
public class SaleLogDTOTest {
    private SaleLogDTO testSaleLog;
    private List<ListItem> saleList;
    public SaleLogDTOTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        this.testSaleLog = new SaleLogDTO(saleList, 300, 270, 30, 13);
    }
    
    @AfterEach
    public void tearDown() {
        this.testSaleLog = null;
    }

    /**
     * Test of getTheFinalList method, of class SaleLogDTO.
     */
    @Test
    public void testGetTheFinalList() {
        System.out.println("getTheFinalList");
        SaleLogDTO instance = this.testSaleLog;
        List<ListItem> expResult = saleList;
        List<ListItem> result = instance.getTheFinalList();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getAmountPaid method, of class SaleLogDTO.
     */
    @Test
    public void testGetAmountPaid() {
        System.out.println("getAmountPaid");
        SaleLogDTO instance = this.testSaleLog;
        int expResult = 300;
        int result = instance.getAmountPaid();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalPrice method, of class SaleLogDTO.
     */
    @Test
    public void testGetTotalPrice() {
        System.out.println("getTotalPrice");
        SaleLogDTO instance = this.testSaleLog;
        double expResult = 270;
        double result = instance.getTotalPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getChange method, of class SaleLogDTO.
     */
    @Test
    public void testGetChange() {
        System.out.println("getChange");
        SaleLogDTO instance = this.testSaleLog;
        int expResult = 30;
        int result = instance.getChange();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getTotalTax method, of class SaleLogDTO.
     */
    @Test
    public void testGetTotalTax() {
        System.out.println("getTotalTax");
        SaleLogDTO instance = this.testSaleLog;
        double expResult = 13;
        double result = instance.getTotalTax();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

}
