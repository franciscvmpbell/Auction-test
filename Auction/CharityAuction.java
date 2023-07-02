package Auction;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;

/*
 * The CharityAuction class implements methods  
 * that take auction items, adds them and puts them up for sale.
 * 
 * @author Edward Campbell
 * @version 1.0
 * @since 2023-03-28
 */
public class CharityAuction {
    //Class variables
    private ArrayList<AuctionItem> itemList;

    //Constructor for our list
    public CharityAuction() 
    {
        itemList = new ArrayList<>();
    }


    /*
     * Makes an object from the Auction class, and adds it to itemList
     * @param auctionItem - an object created from the Auction class
     */
    public void addItem(AuctionItem auctionItem) 
    {
        itemList.add(auctionItem);
    }

    /*
     * @return auctionItem list
     */
    public List<AuctionItem> getItems() 
    {
        return itemList;
    }

    /*
     * Loops through all Auction objects in the itemList, and calls the 
     * ActionItem description field for each object. 
     */
    public void printAll() 
    {
        for (int i = 0; i < itemList.size(); i++)
        {
            System.out.println(itemList.get(i).getDescription());
        }
    }

    /*
     * @param String find
     * @return Auction - if the description is found
     * @return null - if no matching string is found
     */
    public AuctionItem findItem(String find) 
    {
        for (int i = 0; i < itemList.size(); i++) {
            if (itemList.get(i).getDescription().contains(find)) 
            {
                return itemList.get(i);
            }
        }
        return null;
    }

    /*
     * Populates a new list purchasedList with objects from the itemList
     * that have currentBid values greater than or equal to reservePrice.
     * 
     * @return purchasedList - returns the new list of purchased items
     */
    public List<AuctionItem> findPurchasedItems() 
    {
        //A new list for purchased items
        List<AuctionItem> purchasedItems = new ArrayList<>();

        for (AuctionItem item : itemList) {
            if (item.getCurrentBid() >= item.getReservePrice()) 
            {
               purchasedItems.add(item);
            }
        }
        return purchasedItems;
    }
    
    /*
     * Iterates over the itemList and removes all items that have currentBid 
     * values less than the reservePrice
     */
    public void removeUnsold() 
    {
        //An iterator to go over the itemList collection
        Iterator<AuctionItem> iterator = itemList.iterator();
        
        while (iterator.hasNext()) {
            AuctionItem item = iterator.next();
            if (item.getCurrentBid() < item.getReservePrice()) 
            {
               iterator.remove();
            }
        }
    }
}
