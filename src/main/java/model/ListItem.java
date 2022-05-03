
package model;

import dto.ItemDTO;


public class ListItem {
    ItemDTO itemDTO;
    int quantity;
    
    ListItem (ItemDTO itemDTO, int quantity) {
        this.itemDTO = itemDTO;
        this.quantity = quantity;
    }
    
    /**
     * 
     * @param quantityToAdd 
     */
    void addQuantity (int quantityToAdd) {
        this.quantity += quantityToAdd;
    }
}
