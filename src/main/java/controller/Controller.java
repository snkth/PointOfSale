
package controller;



import integration.HandlerCreator;
import integration.AccountingSystemHandler;
import integration.CustomerDatabaseHandler;
import integration.DiscountDatabaseHandler;
import integration.InventorySystemHandler;
import integration.PrinterHandler;
import model.SalesList;
import dto.ItemDTO;
import dto.SaleLogDTO;
import dto.SalesListDTO;
import model.Sale;


public class Controller {
    private final HandlerCreator handlerCreator;
    private final AccountingSystemHandler accountingSystemHandler;
    private final CustomerDatabaseHandler customerDatabaseHandler;
    private final DiscountDatabaseHandler discountDatabseHandler;
    private final InventorySystemHandler inventorySystemHandler;
    private final PrinterHandler printerHandler;
    private SalesList salesList;
    private Sale sale;
    
    public Controller (HandlerCreator handlerCreator) {
        this.handlerCreator = handlerCreator;
        this.accountingSystemHandler = handlerCreator.getAccountingSystemHandler();
        this.customerDatabaseHandler = handlerCreator.getCustomerDatabaseHandler();
        this.discountDatabseHandler = handlerCreator.getDiscountDatabaseHandler();
        this.inventorySystemHandler = handlerCreator.getInventorySystemHandler();
        this.printerHandler = handlerCreator.getPrinterHandler();
    }
    
    /**
     * 
     */
    public void startSale () {
        this.salesList = new SalesList();
    }
    
    /**
     * 
     * @param itemID
     * @param quantity
     * @return 
     */
    public SalesListDTO scanItem (int itemID, int quantity) {
        ItemDTO itemDTO = inventorySystemHandler.getItem(itemID);
        
        return salesList.addItem(itemDTO, quantity);
        
    }
    
    /**
     * 
     */
    public void endSale () {
        this.sale = new Sale(salesList);
    }
    
    /**
     * 
     * @param amountPaid
     * @return 
     */
    public SaleLogDTO processSale (int amountPaid) {
        return sale.processSale(amountPaid, accountingSystemHandler, inventorySystemHandler, printerHandler);
    }
}
