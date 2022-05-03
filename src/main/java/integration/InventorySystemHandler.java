
package integration;

import dto.ItemDTO;
import dto.SaleLogDTO;


public class InventorySystemHandler {
    
    /**
     * 
     * @param itemID
     * @return 
     */
    public ItemDTO getItem (int itemID) {
        
        String itemName;
        String itemDescription;
        String itemCategory;
        double price;
        double taxRate;
        boolean validity;
        
        // call to database to fetch info
        
        itemName = "Name of item";
        itemDescription = "Description of item";
        itemCategory = "one of a number of categories";
        price = 80;
        taxRate = 0.25;
        validity = true;
        
        return new ItemDTO(itemID, itemName, itemDescription, itemCategory, price, taxRate, validity);
    }
    
    /**
     * 
     * @param saleLogDTO 
     */
    public void updateInventory (SaleLogDTO saleLogDTO) {
        // updates inventory
    }
}
