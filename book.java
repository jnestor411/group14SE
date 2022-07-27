public class book implements  CheckOutAble
{
    String name;
    double itemValue = 0;
    int durationLimit = 0;
    int itemID = 0;
    int dateCheckout = 0;
    int copies = 1;
    boolean isRenew = false;
    private boolean isBestSeller;

    //Default constructor
    public book(int itemID, int value, String name)
    {
        //Set book's values
        this.itemID = itemID;
        itemValue = value;
        this.name = name;

        //Set book borrow duration
        durationLimit = 21;//days
    }

    //Constructor for bestseller book
    public book(int itemID, int value, String name, boolean isBestSeller)
    {
        this.itemID = itemID;
        itemValue = value;
        this.name = name;
        this.isBestSeller = isBestSeller;

        //Check if bestseller == true
        if(this.isBestSeller)
            durationLimit = 14;//days
        else//not bestseller
            durationLimit = 21;//days
    }

    public void setBestSeller()
    {
        isBestSeller = true;
        durationLimit = 14;//days
    }

    public boolean isBestSeller()
    {
        return isBestSeller;
    }

    @Override
    public void setRenewStatus(boolean status) {
        isRenew = status;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getDateCheckout() {
        return dateCheckout;
    }

    @Override
    public int getDurationLimit() {
        return durationLimit;
    }

    @Override
    public int getID() {
        return itemID;
    }

    @Override
    public void setID(int itemID) {
        this.itemID = itemID;
    }

    @Override
    public int getCopies() {
        return copies;
    }

    @Override
    public void addCopies(int amount) {
        copies += amount;
    }

    @Override
    public void decreaseCopy(int amount) {
        if(amount >= copies)
        {
            copies = 0;
        }
        else
        {
            copies-=amount;
        }
    }
}