import java.util.Scanner;

class Student
{
        String name;
        int oos,dbms,math;

        void getdata() {
        System.out.println("Enter the name of the student: ");
        Scanner nm= new Scanner(System.in);
        name= nm.nextLine();

        System.out.println("Marks obtained in OOS: ");
        Scanner os= new Scanner(System.in);
        oos= os.nextInt();

        System.out.println("Marks obtained in DBMS: ");
        Scanner db= new Scanner(System.in);
        dbms= db.nextInt();

        System.out.println("Marks obtained in Math: ");
        Scanner mt= new Scanner(System.in);
        math= mt.nextInt();
        }


        int average() {
        return (oos+dbms+math)/3;
        }


        void display() {
        System.out.println("\nStudent's name: "+name);
        int total= oos+dbms+math;
        System.out.println("Total marks= "+total);
        }


        public static void main(String args[]) {
        Student s1= new Student();
        Student s2= new Student();

        s1.getdata();
        s2.getdata();

        s1.display();
        s2.display();

        System.out.println("The average marks of "+s1.name+" is= "+s1.average());
        System.out.println("The average marks of "+s2.name+" is= "+s2.average());
        }
}
