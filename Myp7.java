class Date
{
    int day,month,year;

    Date()
    {
        day= 01;
        month= 01;
        year= 1970;
    }

    Date(int day)
    {
        this.day= day; 
        month= 01;
        year= 1970;
    }

    Date(int day, int month)
    {
        this.day= day;
        this.month= month;
        year= 1970;
    }

    Date(int day, int month, int year)
    {
        this.day= day;
        this.month= month;
        this.year= year;
    }

    void prevday()
    {
        int prev= day-1;
        System.out.println(prev+", "+month+", "+year);
    }

    void nextday()
    {
        int next= day+1;
        System.out.println(next+", "+month+", "+year);
    }

    void print()
    {
        System.out.println(day+", "+month+", "+year);
    }

    public static void main(String args[])
    {
        Date ob= new Date(24,7,2000);
        System.out.println("Today's Date: ");
        ob.print();

        System.out.println("Yesterday's Date: ");
        ob.prevday();

        System.out.println("Tomorrow's Date: ");
        ob.nextday();
    }
}