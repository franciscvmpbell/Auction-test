package Auction;

/*
 * The representation of an item up for auction - AuctionItem.
 * 
 * @author Edward Campbell
 * @version 1.0
 * @since 2023-03-28
 */
public class AuctionItem {
    //Class variables
    private String description;
    private int reservePrice;
    private int currentBid;

     /* 
     * Class constructor
     * @param description, reservePrice
    */
    public AuctionItem (String description, int reservePrice) 
    {
        this.description = description;
        this.reservePrice = reservePrice;
        this.currentBid = 0;
    }

     /*
     * Accessor method for description field. 
     */
    public String getDescription() 
    {
        return description;
    }

     /* 
     * Accessor method for reservePrice field.
     */
    public int getReservePrice() 
    {
        return reservePrice;
    }

    /*
     * Accessor method for currentBid field.
     */
    public int getCurrentBid() 
    {
        return currentBid;
    }

    /*
     * A bidfor method that takes the int bid and sets the currentBid
     * variable to to bid's value if bid's value is greater than currentBid
     * @param bid - 
     */
    public void bidFor (int bid) 
    {
        if (currentBid < bid) {
            currentBid = bid;
        }
    }

    /*
     * Prints all AuctionItem fields in a string
     */
    public void printDetails()
    {
        System.out.println(description + ": reserve " + reservePrice + " current bid " + currentBid + ".");
    }
    
    
}

