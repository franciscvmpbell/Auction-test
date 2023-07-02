package Auction;

import java.util.List;

/*
 * The Test class demonstrates that the AuctionItem and CharityAuction  
 * functionalities work as intended
 * 
 * @author Edward Campbell
 * @version 1.0
 * @since 2023-03-28
 */
public class Test {
    //The main method calls our two new test classes for CharityAuction and AuctionItem
    public static void main(String[] args) {
        testAuctionItem();
        testCharityAuction();
    }

    //Test method for the AuctionItem class
    public static void testAuctionItem() {
        //Creates objects of the AuctionItem class
        AuctionItem item = new AuctionItem("Skate board", 20);
        System.out.println("Description: " + item.getDescription());
        System.out.println("Reserve price: " + item.getReservePrice());
        System.out.println("Current bid: " + item.getCurrentBid());

        //Calls the AuctionItem bidfor method and bids on items
        item.bidFor(20);
        System.out.println("New current bid: " + item.getCurrentBid());

        item.bidFor(10);
        System.out.println("Current bid: " + item.getCurrentBid());

        //Calls the AuctionItem printDetails method
        item.printDetails();
    }

    //Test method for the CharityAuction class
    public static void testCharityAuction() {
        //Instance of CharityAuction
        CharityAuction auction = new CharityAuction();

        //Creates AuctionItem objects
        AuctionItem item1 = new AuctionItem("Skate board", 20);
        AuctionItem item2 = new AuctionItem("Acoustic guitar", 150);
        AuctionItem item3 = new AuctionItem("Cement mixer", 250);
        AuctionItem item4 = new AuctionItem("DVD player", 40);
        AuctionItem item5 = new AuctionItem("Laptop", 400);
        AuctionItem item6 = new AuctionItem("Antique cabinet", 150);

        //Adds the items to our instance of the CharityAuction class
        auction.addItem(item1);
        auction.addItem(item2);
        auction.addItem(item3);
        auction.addItem(item4);
        auction.addItem(item5);
        auction.addItem(item6);

        //Calls the printAll method to print all items
        System.out.println("All items available for auction:");
        auction.printAll();

        //Calls the findItem method and attempts to find the Antique cabinet item
        AuctionItem foundItem = auction.findItem("Antique cabinet");
        System.out.println("Found item: " + foundItem.getDescription());

        //Calls the findItem method and attempts to find something that isn't listed
        AuctionItem notFoundItem = auction.findItem("Aston Martin");
        System.out.println("Item not found: " + notFoundItem);
        
        //Calls the findPurchasedItems method and prints out the purchased items
        System.out.println("Purchased items:");
        List<AuctionItem> purchasedItems = auction.findPurchasedItems();
        for (AuctionItem item : purchasedItems) {
            System.out.println(item.getDescription());
        }

        //Calls the removeUnsold method and prints out the remaining items
        System.out.println("Unsold items:");
        auction.removeUnsold();
        List<AuctionItem> unsoldItems = auction.getItems();
        for (AuctionItem item : unsoldItems) {
            System.out.println(item.getDescription());
        }
    }
}

       
