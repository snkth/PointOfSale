
package model;

import dto.ItemDTO;

/**
 * A class used to group an itemDTO and a quantity together for easy reference
 */
public class ListItem {
    ItemDTO itemDTO;
    int quantity;
    
    /**
     * Initializes a ListItem containing both an item and a quantity
     * @param itemDTO The item data transfer object containing all relevant information about an item
     * @param quantity The amount of items with the same itemID in the itemDTO
     */
    ListItem (ItemDTO itemDTO, int quantity) {
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }
    public ItemDTO getItemDTO() {
        return this.itemDTO;
    }
    public int getItemQuantity() {
        return this.quantity;
    }
    /**
     * Updates the amount of items with the same itemID in the itemDTO
     * @param quantityToAdd The amount of items to add to the total
     */
    void addQuantity (int quantityToAdd) {
        this.quantity += quantityToAdd;
    }
}
