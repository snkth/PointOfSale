
package dto;

import java.util.List;
import model.ListItem;


public class SalesListDTO {
    private final List<ListItem> theItemList;
    private final double totalPrice;
    private final double totalTax;
    
    public SalesListDTO (List<ListItem> theItemList, double totalPrice, double totalTax) {
        this.theItemList = theItemList;
        this.totalPrice = totalPrice;
        this.totalTax = totalTax;
    }
    
    /**
     * 
     * @return 
     */
    public List<ListItem> getTheItemList () {
        return theItemList;
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
    public double getTotalTax () {
        return totalTax;
    }
}