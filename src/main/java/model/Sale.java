
package model;

import dto.SaleLogDTO;
import dto.SalesListDTO;
import integration.AccountingSystemHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;
import java.util.List;


public class Sale {
    List<ListItem> theFinalList;
    int amountPaid;
    double totalPrice;
    int change;
    double totalTax;
    SalesListDTO salesListDTO;
    SaleLogDTO saleLogDTO;
    
    public Sale (SalesList salesList) {
        salesListDTO = salesList.getSalesListDTO();
        theFinalList = salesListDTO.getTheItemList();
        totalPrice = salesListDTO.getTotalPrice();
        totalTax = salesListDTO.getTotalTax();
        amountPaid = 0;
        change = 0;
        
    }
    
    /**
     * 
     * @param amountPaid
     * @param accountingSystemHandler
     * @param inventorySystemHandler
     * @param printerHandler
     * @return 
     */
    public SaleLogDTO processSale (int amountPaid, AccountingSystemHandler accountingSystemHandler, InventorySystemHandler inventorySystemHandler, PrinterHandler printerHandler) {
        
        this.amountPaid = amountPaid;
        calculateChange();
        constructSaleLogDTO();
        accountingSystemHandler.updateAccounting(saleLogDTO);
        inventorySystemHandler.updateInventory(saleLogDTO);
        printerHandler.printReceipt(saleLogDTO);
        
        return saleLogDTO;
    }
    
    private void constructSaleLogDTO () {
        saleLogDTO = new SaleLogDTO(theFinalList, amountPaid, totalPrice, change, totalTax);
    }
    
    private void calculateChange () {
        change = (int) Math.round(amountPaid - totalPrice);
    }
}
