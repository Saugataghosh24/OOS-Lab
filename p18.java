interface Fruit
{
    boolean hasAPeel();
}

interface Vegetable
{
    boolean hasARoot();
}

class Tomato implements Fruit, Vegetable
{
    public boolean hasAPeel()
    {
        return true;
    }
    
    public boolean hasARoot()
    {
        return false;
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Tomato t = new Tomato();
        if(t.hasAPeel() == true)
            System.out.println("Tomato has a peel");
        else
            System.out.println("Tomato does not have a peel"); 
        if(t.hasARoot() == true)
            System.out.println("Tomato has a root");
        else
            System.out.println("Tomato does not have a root");
    }
}
