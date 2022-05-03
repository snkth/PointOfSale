
package view;

import controller.Controller;
import dto.SaleLogDTO;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;




public class View {
    private final Controller controller;
    
    public View (Controller controller) {
        this.controller = controller;
    }
    
    /**
     * 
     */
    public void runFakeExecution () {
        controller.startSale();
        System.out.println("A new sale has been started");
        
        int anItemID = 1;
        int aItemQuantity = 1;
        controller.scanItem(anItemID, aItemQuantity);
        System.out.println("Scanned itemID " + anItemID + " with quantity " + aItemQuantity);
        
        controller.endSale();
        System.out.println("The current sale is ending");
        
        int anAmountPaid = 1000;
        SaleLogDTO theLog = controller.processSale(anAmountPaid);
        System.out.println("Sale is processed at " + theLog.getTimestamp().format(DateTimeFormatter.ofLocalizedTime(FormatStyle.MEDIUM)) + ", customer paid " + anAmountPaid + " for " + theLog.getTheFinalList().size() + " items, and got a change of " + theLog.getChange() + " back");
    }
}
