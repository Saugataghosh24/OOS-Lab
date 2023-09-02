class Person
{
    int age;
    int height;
    int weight;
    String dateOfBirth;
    String address;
    
    Person()
    {}
    
    Person(int a, int ht, int wt, String dob, String add)
    {
        age = a;
        height = ht;
        weight = wt;
        dateOfBirth = dob;
        address = add;
    }
    
    void editAge(int a)
    {
        age = a;
    }
    
    void editHeight(int ht)
    {
        height = ht;
    }
    
    void editWeight(int wt)
    {
        weight = wt;
    }
    
    void editdob(String dob)
    {
        dateOfBirth = dob;
    }
    
    void editAddress(String add)
    {
        address = add;
    }
    
    void print()
    {
        System.out.println("\nAge: " + age + " years\tHeight: " + height + " cm\tWeight: " + weight + " kg");
        System.out.println("Date of Birth: " + dateOfBirth + "\tAddress: " + address);
    }
}

class Student extends Person
{
    int roll;
    String subjects[];
    int marks[]; 
    private int numofsubs;
    
    Student(int r, int n)
    {
        super();
        roll = r;
        numofsubs = n;
        subjects = new String[n];
        marks = new int[n];
    }
    
    Student(int r, int n, int a, int ht, int wt, String dob, String add)
    {
        super(a, ht, wt, dob, add);
        roll = r;
        numofsubs = n;
        subjects = new String[n];
        marks = new int[n];
    }
    
    void getsubs(String subs[])
    {
        for(int i=0; i<subs.length; i++)
            subjects[i] = subs[i];
    }
    
    void getmarks(int m[])
    {
        for(int i=0; i<m.length; i++)
            marks[i] = m[i];
    }
    
    float calculateGrade()
    {
        float avg = 0;
        for(int i=0; i<numofsubs; i++)
            avg += marks[i];
        avg = avg/numofsubs;
        return avg;
    }
    
    void print()
    {
        super.print();
        System.out.println("Roll: " + roll);
        System.out.println("Subjects\tMarks");
        for(int i=0; i<numofsubs; i++)
            System.out.println(subjects[i] + "\t\t" + marks[i]);
        System.out.println();
    }
}

class Employee extends Person
{
    int salary;
    String dateOfJoining;
    int experience;
    
    Employee()
    {
        super();
    }
    
    Employee(int a, int ht, int wt, String dob, String add)
    {
        super(a, ht, wt, dob, add);
    }
    
    Employee(int sal, String doj, int exp)
    {
        super();
        salary = sal;
        dateOfJoining = doj;
        experience = exp;
    }
    
    Employee(int sal, String doj, int exp, int a, int ht, int wt, String dob, String add)
    {
        super(a, ht, wt, dob, add);
        salary = sal;
        dateOfJoining = doj;
        experience = exp;
    }

    void editsal(int sal)
    {
        salary = sal;
    }

    void editjoiningdate(String doj)
    {
        dateOfJoining = doj;
    }

    void editexp(int exp)
    {
        experience = exp;
    }
    
    void print()
    {
        super.print();
        System.out.println("Date of Joining: " + dateOfJoining + "\tExperience: " + experience + " years");
        System.out.println("Salary: Rs. " + salary);
    }
}

class Technician extends Employee
{
    Technician(int sal, String doj, int exp, int a, int ht, int wt, String dob, String add)
    {
        super(sal, doj, exp, a, ht, wt, dob, add);
    }
    
    void print()
    {
        super.print();
    }
}

class Professor extends Employee
{
    String courses[];
    String listOfAdvisee[];
    private int numofcourses;
    private int numofadvisee;
    
    Professor(int sal, String doj, int exp, int a, int ht, int wt, String dob, String add, int noc, int noa)
    {
        super(sal, doj, exp, a, ht, wt, dob, add);
        numofcourses = noc;
        courses = new String[noc];
        numofadvisee = noa;
        listOfAdvisee = new String[noa];
    }
    
    void courselist(String cl[])
    {
        for(int i=0; i<numofcourses; i++)
            courses[i] = cl[i];
    }
    
    void adviseelist(String al[])
    {
        for(int i=0; i<numofadvisee; i++)
            listOfAdvisee[i] = al[i];
    }
    
    void print()
    {
        super.print();
        System.out.print("Courses: ");
        for(int i=0; i<numofcourses; i++)
            System.out.print(courses[i] + "\t");
        System.out.println();
        System.out.print("List of advisee: ");
        for(int i=0; i<numofadvisee; i++)
            System.out.print(listOfAdvisee[i] + "\t");
        System.out.println();
    }
}

class Main
{
    public static void main(String args[]) 
    {
        Person p = new Person(22, 164, 54, "16-01-2001", "Kolkata");
        p.print();
        
        Employee e = new Technician(50000, "20-04-2000", 24, 47, 171, 76, "01-06-1975", "Mumbai");
        e.print();
        
        Student s = new Student(07, 3, 21, 153, 50, "24-07-2000", "Howrah");
        String sub[] = {"OOP", "DBMS", "DSA "};
        int m[] = {84, 86, 88};
        s.getsubs(sub);
        s.getmarks(m);
        s.print();
        System.out.println("Average marks: " + s.calculateGrade());
        
        Professor prof = new Professor(90000, "20-04-2005", 17, 47, 171, 76, "01-06-1975", "Hyderabad", 2, 1);
        String c[] = {"OOP", "OOS"};
        String a[] = {"U.K.R"};
        prof.courselist(c);
        prof.adviseelist(a);
        prof.print();
    }
}