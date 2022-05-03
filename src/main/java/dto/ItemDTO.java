
package dto;


public class ItemDTO {
    
    private final int itemID;
    private final String itemName;
    private final String itemDescription;
    private final String itemCategory;
    private final double price;
    private final double taxRate;
    private final boolean validity;
    
    
    public ItemDTO (int itemID, String itemName, String itemDescription, String itemCategory, double price, double taxRate, boolean validity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemDescription = itemDescription;
        this.itemCategory = itemCategory;
        this.price = price;
        this.taxRate = taxRate;
        this.validity = validity;
    }
    
    /**
     * 
     * @return 
     */
    public int getItemID () {
        return itemID;
    }
    
    /**
     * 
     * @return 
     */
    public String getItemName () {
        return itemName;
    }
    
    /**
     * 
     * @return 
     */
    public String getItemDescription () {
        return itemDescription;
    }
    
    /**
     * 
     * @return 
     */
    public String getItemCategory () {
        return itemCategory;
    }
    
    /**
     * 
     * @return 
     */
    public double getPrice () {
        return price;
    }
    
    /**
     * 
     * @return 
     */
    public double getTaxRate () {
        return taxRate;
    }
    
    /**
     * 
     * @return 
     */
    public boolean getValidity () {
        return validity;
    }
}
