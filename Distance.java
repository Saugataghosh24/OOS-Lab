class Distance {
    int feet, inches;
    
    Distance()
    {
        this.feet= 0;
        this.inches= 0;
    }

    Distance(int feet )
    {
        this.feet= feet;
        this.inches= 0;
    }

    Distance(int feet, int inches)
    {
        this.feet= feet;
        this.inches= inches;
    }

    static Distance add(Distance d1, Distance d2)
    {
        Distance res= new Distance();
        res.feet= d1.feet+ d2.feet;
        int in= d1.inches+ d2.inches;
        if(in>=12){
            res.inches= (in-12);
            res.feet++;
        }
        else{
            res.inches= in;
        }

        return res;
    }

    static Distance sub(Distance d1, Distance d2)
    {
        Distance res= new Distance();
        res.feet= d1.feet- d2.feet;
        int in= d1.inches- d2.inches;

        if(in<0)
        {
            res.inches= (12+in);
            res.feet--;
        }
        else{
            res.inches= in;
        }

        return res;
    }

    public static void main(String args[]){
        Distance a= new Distance(2,8);
        Distance b= new Distance(1,10);

        Distance sum= add(a,b);
        Distance sub= sub(a,b);

        System.out.println("The sum of the distances is= "+sum.feet+" feet, "+sum.inches+" inches");
        System.out.println("The difference in the distances is= "+ sub.feet+" feet, "+sub.inches+" inches");

    }
}
