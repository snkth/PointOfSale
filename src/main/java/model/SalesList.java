
package model;

import dto.ItemDTO;
import dto.SalesListDTO;
import java.util.ArrayList;
import java.util.List;


public class SalesList {
    private final List<ListItem> theItemList;
    private double totalPrice;
    private double totalTax;
    
    public SalesList() {
        theItemList = new ArrayList<>();
        updatePrice();
    }
    
    /**
     * 
     * @param itemDTO
     * @param quantity
     * @return 
     */
    public SalesListDTO addItem (ItemDTO itemDTO, int quantity) {
        if (itemDTO.getValidity() == true) {
            boolean present = false;
            for (ListItem i : theItemList) {
                if (itemDTO.getItemID() == i.itemDTO.getItemID()) {
                    present = true;
                    i.addQuantity(quantity);
                    break;
                }
            }
            if (present == false) {
                theItemList.add(new ListItem(itemDTO,quantity));
            }
        }
        return getSalesListDTO();
    }
    
    /**
     * 
     * @return 
     */
    SalesListDTO getSalesListDTO () {
        updatePrice();
        return new SalesListDTO(theItemList, totalPrice, totalTax);
    }
    
    private void updatePrice() {
        totalPrice = 0;
        totalTax = 0;
        for (ListItem i : theItemList) {
            double itemPrice = i.itemDTO.getPrice();
            double itemTaxRate = i.itemDTO.getTaxRate();
            int quantity = i.quantity;

            double itemAddedTax = itemPrice * itemTaxRate;
            
            totalTax += quantity * itemAddedTax;
            totalPrice += quantity * (itemPrice + itemAddedTax);
        }
    }
}
