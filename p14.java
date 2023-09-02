class Automobile
{
    String type;
    float maxSpeed;
    float price;
    float mileage;
    int registrationNumber;
    
    Automobile()
    {}
    
    Automobile(String t, float maxspd, float pr, float mil, int regnum)
    {
        type = t;
        maxSpeed = maxspd;
        price = pr;
        mileage = mil;
        registrationNumber = regnum;
    }
    
    void edittype(String t)
    {
        type = t;
    }
    
    void editmaxspeed(float maxspd)
    {
        maxSpeed = maxspd;
    }
    
    void editprice(float pr)
    {
        price = pr;
    }
    
    void editmileage(float mil)
    {
        mileage = mil;
    }
    
    void editregnum(int regnum)
    {
        registrationNumber = regnum;
    }
    
    void print()
    {
        System.out.println("\nType: " + type + "\t\tRegistration number: " + registrationNumber);
        System.out.println("Maximum speed: " + maxSpeed + " mph\tMileage: " + mileage + " kmpl\nPrice: Rs. " + price + "L");
    }
}

class Track extends Automobile
{
    float capacity;
    String hoodType;
    int noOfWheels;
    
    Track(){}
    
    Track(String t, float maxspd, float pr, float mil, int regnum)
    {
        super(t, maxspd, pr, mil, regnum);
    }
    
    Track(float c, String hood, int now)
    {
        super();
        capacity = c;
        hoodType = hood;
        noOfWheels = now;
    }
    
    Track(String t, float maxspd, float pr, float mil, int regnum, float c, String hood, int now)
    {
        super(t, maxspd, pr, mil, regnum);
        capacity = c;
        hoodType = hood;
        noOfWheels = now;
    }
    
    void editcapacity(int c)
    {
        capacity = c;
    }
    
    void edithoodtype(String hood)
    {
        hoodType = hood;
    }
    
    void editwheelcount(int now)
    {
        noOfWheels = now;
    }
    
    void print()
    {
        super.print();
        System.out.println("Capacity: " + capacity + " lts\tHood Type: " + hoodType);
        System.out.println("Number of wheels: " + noOfWheels);
    }
}

class Car extends Automobile
{
    int noOfDoors;
    int seatingCapacity;
    
    Car(){}
    
    Car(String t, float maxspd, float pr, float mil, int regnum)
    {
        super(t, maxspd, pr, mil, regnum);
    }
    
    Car(int nod, int scap)
    {
        super();
        noOfDoors = nod;
        seatingCapacity = scap;
    }
    
    Car(String t, float maxspd, float pr, float mil, int regnum, int nod, int scap)
    {
        super(t, maxspd, pr, mil, regnum);
        noOfDoors = nod;
        seatingCapacity = scap;
    }
    
    void editdoorcount(int nod)
    {
        noOfDoors = nod;
    }
    
    void editseatingcapacity(int scap)
    {
        seatingCapacity = scap;
    }
    
    void print()
    {
        super.print();
        System.out.println("Number of doors: " + noOfDoors + "\tSeating capacity: " + seatingCapacity);
    }
}

class Main
{
    public static void main(String args[]) 
    {
        Automobile s = new Car("Nexon", 200, 10.5f, 21.56f, 1359, 4, 6);
        s.print();
        
        Automobile t = new Track("Prima", 200, 20.5f, 17.56f, 1370, 40, "Cowl", 10);
        t.print();
    }
}
