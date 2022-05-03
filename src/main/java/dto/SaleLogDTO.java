
package dto;

import java.time.LocalDateTime;
import java.util.List;
import model.ListItem;


public class SaleLogDTO {
    private final List<ListItem> theFinalList;
    private final int amountPaid;
    private final double totalPrice;
    private final int change;
    private final double totalTax;
    private final LocalDateTime timestamp;
    
    public SaleLogDTO (List<ListItem> theFinalList, int amountPaid, double totalPrice, int change, double totalTax) {
        this.theFinalList = theFinalList;
        this.amountPaid = amountPaid;
        this.totalPrice = totalPrice;
        this.change = change;
        this.totalTax = totalTax;
        timestamp = LocalDateTime.now();
    }
    
    /**
     * 
     * @return 
     */
    public List<ListItem> getTheFinalList () {
        return theFinalList;
    }
    
    /**
     * 
     * @return 
     */
    public int getAmountPaid () {
        return amountPaid;
    }
    
    /**
     * 
     * @return 
     */
    public double getTotalPrice () {
        return totalPrice;
    }
    /**
     * 
     * @return 
     */
    public int getChange () {
        return change;
    }
    
    /**
     * 
     * @return 
     */
    public double getTotalTax () {
        return totalTax;
    }
    
    /**
     * 
     * @return 
     */
    public LocalDateTime getTimestamp () {
        return timestamp;
    }
}
