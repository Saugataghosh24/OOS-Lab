import java.util.Scanner;

class Marksheet
{
    String name;
    int s1,s2,s3,s4,s5;
    Scanner sc= new Scanner(System.in);

    Marksheet()
    {
        System.out.println("Enter the name of the Student: ");
        name= sc.nextLine();

        System.out.println("Enter the marks in OOP: ");
        s1= sc.nextInt();
        
        System.out.println("Enter the marks in DBMS: ");
        s2= sc.nextInt();

        System.out.println("Enter the marks in DSA: ");
        s3= sc.nextInt();

        System.out.println("Enter the marks in Math: ");
        s4= sc.nextInt();

        System.out.println("Enter the marks in OOS: ");
        s5= sc.nextInt();
    }

    float percent()
    {
        return (s1+s2+s3+s4+s5)/5f;
    }

    int total()
    {
        return s1+s2+s3+s4+s5;
    }

    public static void main(String args[])
    {
        Marksheet a= new Marksheet();
        Marksheet b= new Marksheet();
        //a.getdata();
        //b.getdata();

        System.out.println("The total marks of "+a.name+" is = "+a.total());
        System.out.println("The percentage of "+a.name+" is = "+a.percent()+"%\n");

        System.out.println("The total marks of "+b.name+" is = "+b.total());
        System.out.println("The percentage of "+b.name+" is = "+b.percent()+"%");
        
    }
}