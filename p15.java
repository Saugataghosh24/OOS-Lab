interface Shape
{
    double area();
    void draw();
    void rotate(double d);
    void move(double d, double l);
}

class Circle implements Shape
{
    double radius;
    double center_x;
    double center_y;
    
    Circle(double r, double x, double y)
    {
        radius = r;
        center_x = x;
        center_y = y;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    public void draw()
    {
        System.out.println("\nCenter of the circle: (" + String.format("%.2f",center_x) + ", " + String.format("%.2f",center_y) + ")\tRadius: " + radius);
    }
    
    public void rotate(double d)
    {
        double a=center_x, b=center_y;
        center_x = Math.cos(d) * a - Math.sin(d) * b;
        center_y = Math.sin(d) * a + Math.cos(d) * b;
    }
    
    public void move(double d, double l)
    {
        center_x += l * Math.cos(d);
        center_y += l * Math.sin(d);
    }
}

class Rectangle implements Shape
{
    double x1, y1;
    double x2, y2;
    double x3, y3;
    double x4, y4;
    
    Rectangle(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.x4 = x4;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
        this.y4 = y4;
    }
    
    private double length(double a1, double b1, double a2, double b2)
    {
        return Math.sqrt(Math.pow(a1-a2, 2) + Math.pow(b1-b2, 2));
    }
    
    private double xrotationchange(double d, double x, double y)
    {
        //System.out.println("x = " + Math.cos(d) + "*" + x + "-" + Math.sin(d) + "*" + y);
        return Math.cos(d) * x - Math.sin(d) * y;
    }
    
    private double yrotationchange(double d, double x, double y)
    {
        //System.out.println("y = " + Math.cos(d) + "*" + y + " + " + Math.sin(d) + "*" + x);
        return Math.sin(d) * x + Math.cos(d) * y;
    }
    
    private double xtranslationchange(double d, double l, double x)
    {
        return x + l * Math.cos(d);
    }
    
    private double ytranslationchange(double d, double l, double y)
    {
        return y + l * Math.sin(d);
    }
    
    public double area()
    {
        return length(x1, y1, x2, y2)*length(x2, y2, x3, y3);
    }
    
    public void draw()
    {
        System.out.println("\nCoordinates of the vertex 1: (" + String.format("%.2f",x1) + ", " + String.format("%.2f",y1) + ")");
        System.out.println("Coordinates of the vertex 2: (" + String.format("%.2f",x2) + ", " + String.format("%.2f",y2) + ")");
        System.out.println("Coordinates of the vertex 3: (" + String.format("%.2f",x3) + ", " + String.format("%.2f",y3) + ")");
        System.out.println("Coordinates of the vertex 4: (" + String.format("%.2f",x4) + ", " + String.format("%.2f",y4) + ")");
    }
    
    public void rotate(double d)
    {
        double a = x1, b = y1;
        x1 = xrotationchange(d, a, b);
        y1 = yrotationchange(d, a, b);
        a = x2; b = y2;
        x2 = xrotationchange(d, a, b);
        y2 = yrotationchange(d, a, b);
        a = x3; b = y3;
        x3 = xrotationchange(d, a, b);
        y3 = yrotationchange(d, a, b);
        a = x4; b = y4;
        x4 = xrotationchange(d, a, b);
        y4 = yrotationchange(d, a, b);
    }
    
    public void move(double d, double l)
    {
        x1 = xtranslationchange(d, l, x1);
        y1 = ytranslationchange(d, l, y1);
        x2 = xtranslationchange(d, l, x2);
        y2 = ytranslationchange(d, l, y2);
        x3 = xtranslationchange(d, l, x3);
        y3 = ytranslationchange(d, l, y3);
        x4 = xtranslationchange(d, l, x4);
        y4 = ytranslationchange(d, l, y4);
    }
}

class Main 
{
    public static void main(String args[]) 
    {
        Circle c = new Circle(5, 0, 1);
        System.out.println("Area: " + c.area());
        c.draw();
        c.rotate(Math.PI/2);
        c.draw();
        c.move(1.00, 4);
        c.draw();
        
        Rectangle r = new Rectangle(0, 0, 1, 0, 1, 1, 0, 1);
        System.out.println("Area: " + r.area());
        r.draw();
        r.rotate(Math.PI/2);
        r.draw();
        r.move(1.0, 4);
        r.draw();
    }
}