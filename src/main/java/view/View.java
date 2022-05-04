
package view;

import controller.Controller;
import dto.SaleLogDTO;
import java.time.format.*;




/**
 * This class represents the part of the program that the user (a cashier) would interact with
 */
public class View {
    private final Controller controller;
    
    /**
     * Initializes the only instance of the view class.
     * @param controller The controller the view should interact with and send commands to
     */
    public View (Controller controller) {
        this.controller = controller;
    }
    
    /**
     * Runs a fictitious execution of the functions in controller that the view would generally call and prints a message to System.out after each call
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
