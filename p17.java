class Tollbooth
{
    int totalcars;
    int carPassedUnpaid;
    double tolltax;
    
    Tollbooth()
    {
        totalcars = 0;
        carPassedUnpaid = 0;
        tolltax = 50;
    }
    
    void carPassedWithoutPaying()
    {
        totalcars++;
        carPassedUnpaid++;
    }
    
    void carPassedAfterPaying()
    {
        totalcars++;
    }
    
    double cashcollected()
    {
        return (totalcars - carPassedUnpaid)*tolltax;
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Tollbooth tb = new Tollbooth();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        tb.carPassedWithoutPaying();
        tb.carPassedAfterPaying();
        tb.carPassedWithoutPaying();
        tb.carPassedWithoutPaying();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        tb.carPassedWithoutPaying();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        tb.carPassedAfterPaying();
        
        System.out.println("Total number of cars passed: " + tb.totalcars);
        System.out.println("Cars passed without paying: " + tb.carPassedUnpaid);
        System.out.println("Total toll tax collected: " + tb.cashcollected());
    }
}